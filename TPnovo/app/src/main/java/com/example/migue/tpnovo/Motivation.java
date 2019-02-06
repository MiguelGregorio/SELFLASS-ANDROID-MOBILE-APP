package com.example.migue.tpnovo;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;


import java.text.DecimalFormat;

import static com.example.migue.tpnovo.R.id.bSub;
import static com.example.migue.tpnovo.R.id.fill;
import static com.example.migue.tpnovo.R.id.text;
import static com.example.migue.tpnovo.R.id.tvmedia;
import static com.example.migue.tpnovo.R.id.tv1;
import static com.example.migue.tpnovo.R.id.tv3;

public class Motivation extends Activity {

    AjudanteParaAbrirBD aj;


    TextView tv1, tv2, tv3, tv4, tv5,tv6;
    RadioGroup rg11,rg12,rg13,rg14, rg15, rg16;
    RadioButton radioButton111, radioButton112, radioButton113, radioButton114, radioButton115, radioButton116, radioButton117,
            radioButton121, radioButton122, radioButton123, radioButton124, radioButton125, radioButton126, radioButton127,
            radioButton131, radioButton132, radioButton133, radioButton134, radioButton135, radioButton136, radioButton137,
            radioButton141, radioButton142, radioButton143, radioButton144, radioButton145, radioButton146, radioButton147,
            radioButton151, radioButton152, radioButton153, radioButton154, radioButton155, radioButton156, radioButton157,
            radioButton161, radioButton162, radioButton163, radioButton164, radioButton165, radioButton166, radioButton167;


    Button bSub;
    TextView fonte;

    int r1,r2,r3,r4,r5,r6;
    float rf;

    TextView tvmedia;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);




        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tvmedia = findViewById(R.id.tvmedia);

        rg11 = findViewById(R.id.rg11);
        bSub = findViewById(R.id.bSub);



        aj = new AjudanteParaAbrirBD(this);

        //pergunta1
        Cursor c = aj.devolvePergunta(1, 1);
        c.moveToFirst();
        String str = c.getString(0);
        tv1.setText(str);

        //pergunta2
        c = aj.devolvePergunta(2, 1);
        c.moveToFirst();
        str = c.getString(0);
        tv2.setText(str);

        //pergunta3
        c = aj.devolvePergunta(3, 1);
        c.moveToFirst();
        str = c.getString(0);
        tv3.setText(str);

        //pergunta4
        c = aj.devolvePergunta(4, 1);
        c.moveToFirst();
        str = c.getString(0);
        tv4.setText(str);

        //pergunta5
        c = aj.devolvePergunta(5, 1);
        c.moveToFirst();
        str = c.getString(0);
        tv5.setText(str);

        //pergunta6
        c = aj.devolvePergunta(6, 1);
        c.moveToFirst();
        str = c.getString(0);
        tv6.setText(str);


        Cursor c1 = aj.devolveMedia(1);


        if (c1 != null) {
            c1.moveToFirst();
            String str1 = c1.getString(1);
            tvmedia.setText(str1);
        }




    }


    public void submit(View v) {


        fonte = findViewById(R.id.fonte);



        tvmedia = findViewById(R.id.tvmedia);

        rg11 = findViewById(R.id.rg11);
        rg12 = findViewById(R.id.rg12);
        rg13 = findViewById(R.id.rg13);
        rg14 = findViewById(R.id.rg14);
        rg15 = findViewById(R.id.rg15);
        rg16 = findViewById(R.id.rg16);


        radioButton111 = findViewById(R.id.radioButton111);
        radioButton112 = findViewById(R.id.radioButton112);
        radioButton113 = findViewById(R.id.radioButton113);
        radioButton114 = findViewById(R.id.radioButton114);
        radioButton115 = findViewById(R.id.radioButton115);
        radioButton116 = findViewById(R.id.radioButton116);
        radioButton117 = findViewById(R.id.radioButton117);

        radioButton121 = findViewById(R.id.radioButton121);
        radioButton122 = findViewById(R.id.radioButton122);
        radioButton123 = findViewById(R.id.radioButton123);
        radioButton124 = findViewById(R.id.radioButton124);
        radioButton125 = findViewById(R.id.radioButton125);
        radioButton126 = findViewById(R.id.radioButton126);
        radioButton127 = findViewById(R.id.radioButton127);

        radioButton131 = findViewById(R.id.radioButton131);
        radioButton132 = findViewById(R.id.radioButton132);
        radioButton133 = findViewById(R.id.radioButton133);
        radioButton134 = findViewById(R.id.radioButton134);
        radioButton135 = findViewById(R.id.radioButton135);
        radioButton136 = findViewById(R.id.radioButton136);
        radioButton137 = findViewById(R.id.radioButton137);

        radioButton141 = findViewById(R.id.radioButton141);
        radioButton142 = findViewById(R.id.radioButton142);
        radioButton143 = findViewById(R.id.radioButton143);
        radioButton144 = findViewById(R.id.radioButton144);
        radioButton145 = findViewById(R.id.radioButton145);
        radioButton146 = findViewById(R.id.radioButton146);
        radioButton147 = findViewById(R.id.radioButton147);

        radioButton151 = findViewById(R.id.radioButton151);
        radioButton152 = findViewById(R.id.radioButton152);
        radioButton153 = findViewById(R.id.radioButton153);
        radioButton154 = findViewById(R.id.radioButton154);
        radioButton155 = findViewById(R.id.radioButton155);
        radioButton156 = findViewById(R.id.radioButton156);
        radioButton157 = findViewById(R.id.radioButton157);

        radioButton161 = findViewById(R.id.radioButton161);
        radioButton162 = findViewById(R.id.radioButton162);
        radioButton163 = findViewById(R.id.radioButton163);
        radioButton164 = findViewById(R.id.radioButton164);
        radioButton165 = findViewById(R.id.radioButton165);
        radioButton166 = findViewById(R.id.radioButton166);
        radioButton167 = findViewById(R.id.radioButton167);

        if ((radioButton111.isChecked() | radioButton112.isChecked() | radioButton113.isChecked() || radioButton114.isChecked() | radioButton115.isChecked() | radioButton116.isChecked() | radioButton117.isChecked()) &&
                (radioButton121.isChecked() | radioButton122.isChecked() | radioButton123.isChecked() || radioButton124.isChecked() | radioButton125.isChecked() | radioButton126.isChecked() | radioButton127.isChecked()) &&
                (radioButton131.isChecked() | radioButton132.isChecked() | radioButton133.isChecked() || radioButton134.isChecked() | radioButton135.isChecked() | radioButton136.isChecked() | radioButton137.isChecked()) &&
                (radioButton141.isChecked() | radioButton142.isChecked() | radioButton143.isChecked() || radioButton144.isChecked() | radioButton145.isChecked() | radioButton146.isChecked() | radioButton147.isChecked()) &&
                (radioButton151.isChecked() | radioButton152.isChecked() | radioButton153.isChecked() || radioButton154.isChecked() | radioButton155.isChecked() | radioButton156.isChecked() | radioButton157.isChecked()) &&
                (radioButton151.isChecked() | radioButton152.isChecked() | radioButton153.isChecked() || radioButton154.isChecked() | radioButton155.isChecked() | radioButton156.isChecked() | radioButton157.isChecked())){

                //pergunta1
                switch (rg11.getCheckedRadioButtonId()) {
                    case R.id.radioButton111:
                        r1 = 1;
                        break;
                    case R.id.radioButton112:
                        r1 = 2;
                        break;
                    case R.id.radioButton113:
                        r1 = 3;
                        break;
                    case R.id.radioButton114:
                        r1 = 4;
                        break;
                    case R.id.radioButton115:
                        r1 = 5;
                        break;
                    case R.id.radioButton116:
                        r1 = 6;
                        break;
                    case R.id.radioButton117:
                        r1 = 7;
                        break;
                }

                //pergunta2
            switch (rg12.getCheckedRadioButtonId()) {
                case R.id.radioButton121:
                    r2 = 1;
                    break;
                case R.id.radioButton122:
                    r2 = 2;
                    break;
                case R.id.radioButton123:
                    r2 = 3;
                    break;
                case R.id.radioButton124:
                    r2 = 4;
                    break;
                case R.id.radioButton125:
                    r2 = 5;
                    break;
                case R.id.radioButton126:
                    r2 = 6;
                    break;
                case R.id.radioButton127:
                    r2 = 7;
                    break;
            }

            //pergunta3
            switch (rg13.getCheckedRadioButtonId()) {
                case R.id.radioButton131:
                    r3 = 1;
                    break;
                case R.id.radioButton132:
                    r3 = 2;
                    break;
                case R.id.radioButton133:
                    r3 = 3;
                    break;
                case R.id.radioButton134:
                    r3 = 4;
                    break;
                case R.id.radioButton135:
                    r3 = 5;
                    break;
                case R.id.radioButton136:
                    r3 = 6;
                    break;
                case R.id.radioButton137:
                    r3 = 7;
                    break;
            }

            //pergunta4
            switch (rg14.getCheckedRadioButtonId()) {
                case R.id.radioButton141:
                    r4 = 1;
                    break;
                case R.id.radioButton142:
                    r4 = 2;
                    break;
                case R.id.radioButton143:
                    r4 = 3;
                    break;
                case R.id.radioButton144:
                    r4 = 4;
                    break;
                case R.id.radioButton145:
                    r4 = 5;
                    break;
                case R.id.radioButton146:
                    r4 = 6;
                    break;
                case R.id.radioButton147:
                    r4 = 7;
                    break;
            }

            //pergunta5
            switch (rg15.getCheckedRadioButtonId()) {
                case R.id.radioButton151:
                    r5 = 1;
                    break;
                case R.id.radioButton152:
                    r5 = 2;
                    break;
                case R.id.radioButton153:
                    r5 = 3;
                    break;
                case R.id.radioButton154:
                    r5 = 4;
                    break;
                case R.id.radioButton155:
                    r5 = 5;
                    break;
                case R.id.radioButton156:
                    r5 = 6;
                    break;
                case R.id.radioButton157:
                    r5 = 7;
                    break;
            }

            //pergunta6
            switch (rg16.getCheckedRadioButtonId()) {
                case R.id.radioButton161:
                    r6 = 1;
                    break;
                case R.id.radioButton162:
                    r6 = 2;
                    break;
                case R.id.radioButton163:
                    r6 = 3;
                    break;
                case R.id.radioButton164:
                    r6 = 4;
                    break;
                case R.id.radioButton165:
                    r6 = 5;
                    break;
                case R.id.radioButton166:
                    r6 = 6;
                    break;
                case R.id.radioButton167:
                    r6 = 7;
                    break;
            }

            rf =((float)(r1+r2+r3+r4+r5+r6)/6);

            DecimalFormat df = new DecimalFormat("0.00");



             tvmedia.setText(df.format(rf));

            aj.addTema((new Resposta(1,df.format(rf))));


            Toast.makeText(getApplicationContext(), "successfully submitted", Toast.LENGTH_SHORT).show();

        }
        else Toast.makeText(getApplicationContext(), "answer all questions, please", Toast.LENGTH_SHORT).show();

    }

    public void reset(View v){
        aj.deletResposta(1);
        Toast.makeText(getApplicationContext(), " deleted answer", Toast.LENGTH_SHORT).show();

        rg11 = findViewById(R.id.rg11);
        rg12 = findViewById(R.id.rg12);
        rg13 = findViewById(R.id.rg13);
        rg14 = findViewById(R.id.rg14);
        rg15 = findViewById(R.id.rg15);
        rg16 = findViewById(R.id.rg16);

        rg11.clearCheck();
        rg12.clearCheck();
        rg13.clearCheck();
        rg14.clearCheck();
        rg15.clearCheck();
        rg16.clearCheck();




        tvmedia.setText("");


    }
}