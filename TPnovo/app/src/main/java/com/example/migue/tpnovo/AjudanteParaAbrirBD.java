package com.example.migue.tpnovo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class AjudanteParaAbrirBD extends SQLiteOpenHelper {

    AjudanteParaAbrirBD oAPABD;

    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "bdTrabalho";

    protected static final String TABLE_PERGUNTAS = "Perguntas";

    protected static final String PER_COL1 = "pergunta";
    protected static final String PER_COL2 = "numero";
    protected static final String PER_COL3 = "tema";



    protected static final String TABLE_RESPOSTAS = "Respostas";

    protected static final String RES_COL1 = "tema";
    protected static final String RES_COL2 = "media";



    private static final String CREATE_PERGUNTAS ="CREATE TABLE " + TABLE_PERGUNTAS + " (" + PER_COL1
            + " VARCHAR(250) PRIMARY KEY, "
            + PER_COL2 + " INTEGER, "
            + PER_COL3 + " INTEGER);";


    private static final String CREATE_RESPOSTAS = "CREATE TABLE " + TABLE_RESPOSTAS + " ( " + RES_COL1
            + " VARCHAR(10) PRIMARY KEY, "
            + RES_COL2 + " INTEGER );";




    public AjudanteParaAbrirBD(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_PERGUNTAS);
        db.execSQL(CREATE_RESPOSTAS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE " + TABLE_PERGUNTAS + ";");
        db.execSQL(CREATE_PERGUNTAS);

        db.execSQL("DROP TABLE " + TABLE_RESPOSTAS + ";");
        db.execSQL(CREATE_RESPOSTAS);
    }


    public void addPergunta(Pergunta p){
        SQLiteDatabase db =this.getWritableDatabase();

        String s= p.getPergunta();

        String query = "SELECT * FROM " + TABLE_PERGUNTAS + " WHERE " + PER_COL1 + " = \"" + s + "\"";
        Cursor cs = db.rawQuery(query, null);

        if (cs.getCount() != 0) return ;


        ContentValues v = new ContentValues();

        v.put(PER_COL1, p.getPergunta());
        v.put(PER_COL2, p.getNumero());
        v.put(PER_COL3, p.getTema());

        db.insert(TABLE_PERGUNTAS,null, v );
        db.close();
    }

    public Cursor devolvePergunta(int numero, int tema){
        SQLiteDatabase db = this.getReadableDatabase();

        String query = "SELECT * FROM " + TABLE_PERGUNTAS + " WHERE " + PER_COL2 + " =" + numero + " and " + PER_COL3 + " =" + tema ;
        Cursor c = db.rawQuery(query, null);
        return c;

    }

    public Cursor devolveMedia( int tema){
        SQLiteDatabase db = this.getReadableDatabase();

        String query = "SELECT * FROM " + TABLE_RESPOSTAS + " WHERE " + RES_COL1 + " =" + tema  ;
        Cursor c = db.rawQuery(query, null);

        if (c.getCount() == 0) {
            return null;
        }
    else {
            return c;
        }
    }


    public void addTema(Resposta r){
        SQLiteDatabase db =this.getWritableDatabase();

        int i= r.getTema();

        String query = "SELECT * FROM " + TABLE_RESPOSTAS + " WHERE " + RES_COL1 + " = \"" + i + "\"";
        Cursor cs = db.rawQuery(query, null);

        if (cs.getCount() != 0) {
                deletResposta(i);
                addTema(r);
                return;
        }

        cs.moveToFirst();
        ContentValues v = new ContentValues();

        v.put(RES_COL1, r.getTema());
        v.put(RES_COL2, r.getMedia());
        //v.putNull("media");


        db.insert(TABLE_RESPOSTAS,null, v );
        db.close();
    }

    public void deletResposta(int tema){

        SQLiteDatabase db;

        String where = RES_COL1 + "=" + tema;
        db = this.getReadableDatabase();
        db.delete(TABLE_RESPOSTAS,where,null);
        db.close();
    }



}
