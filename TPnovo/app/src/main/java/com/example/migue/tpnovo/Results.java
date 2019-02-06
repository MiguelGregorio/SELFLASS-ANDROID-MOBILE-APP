package com.example.migue.tpnovo;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Results extends AppCompatActivity {

    AjudanteParaAbrirBD aj;

    TextView tv1,tv2,tv3,tv4,tv5,tvmediafinal;
    float r1,r2,r3,r4,r5,rfinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);

        tvmediafinal = findViewById(R.id.tvmediafinal);


        aj = new AjudanteParaAbrirBD(this);

        //resposta1
        Cursor c1 = aj.devolveMedia(1);


        if (c1 != null) {
            c1.moveToFirst();
            String str = c1.getString(1);
            tv1.setText(str);
        }


        //resposta2
        Cursor c2 = aj.devolveMedia(2);


        if (c2 != null) {
            c2.moveToFirst();
            String str = c2.getString(1);
            tv2.setText(str);
        }

        //resposta3
        Cursor c3 = aj.devolveMedia(3);


        if (c3 != null) {
            c3.moveToFirst();
            String str = c3.getString(1);
            tv3.setText(str);
        }

        //resposta4
        Cursor c4 = aj.devolveMedia(4);


        if (c4 != null) {
            c4.moveToFirst();
            String str = c4.getString(1);
            tv4.setText(str);
        }

        //resposta5
        Cursor c5 = aj.devolveMedia(5);


        if (c5 != null) {
            c5.moveToFirst();
            String str = c5.getString(1);
            tv5.setText(str);
        }


        String teste1 = tv1.getText().toString();
        String teste2 = tv2.getText().toString();
        String teste3 = tv3.getText().toString();
        String teste4 = tv4.getText().toString();
        String teste5 = tv5.getText().toString();


        teste1 = teste1.replaceAll(",", ".");
        teste2 = teste2.replaceAll(",", ".");
        teste3 = teste3.replaceAll(",", ".");
        teste4 = teste4.replaceAll(",", ".");
        teste5 = teste5.replaceAll(",", ".");


if(!(teste1.equals("")) && !(teste2.equals("")) && !(teste3.equals("")) && !(teste4.equals("")) && !(teste5.equals(""))) {

    r1 = Float.parseFloat(teste1);
    r2 = Float.parseFloat(teste2);
    r3 = Float.parseFloat(teste3);
    r4 = Float.parseFloat(teste4);
    r5 = Float.parseFloat(teste5);

    rfinal = (r1 + r2 + r3 + r4 + r5) / 5;

    DecimalFormat df = new DecimalFormat("0.00");

    tvmediafinal.setText(df.format(rfinal));
}



        /**if(r1==0 || r2==0 || r3==0 || r4==0 || r5==0){

         }


        if (r1 > 0 && r2 > 0 && r3 > 0 && r4 > 0 && r5 > 0) {


        }**/


    }

    public void clearAll(View v) {
        /**aj.deletResposta(1);
        aj.deletResposta(2);
        aj.deletResposta(3);
        aj.deletResposta(4);
        aj.deletResposta(5);


        startActivity(new Intent(this, Results.class));
        finish();**/


        AlertDialog.Builder a_builder = new AlertDialog.Builder(Results.this);
        a_builder.setMessage("Are you sure ?\n" +
                "All your data will be eliminated.")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        aj.deletResposta(1);
                        aj.deletResposta(2);
                        aj.deletResposta(3);
                        aj.deletResposta(4);
                        aj.deletResposta(5);

                        startActivity(new Intent(Results.this, Results.class));
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert= a_builder.create();
        alert.setTitle("Alert");
        alert.show();
    }



}
