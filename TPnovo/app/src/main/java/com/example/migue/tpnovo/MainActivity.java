package com.example.migue.tpnovo;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    AjudanteParaAbrirBD oAPABD = new AjudanteParaAbrirBD(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        oAPABD.addPergunta(new Pergunta("1. I feel it is important to help others because Iam concerned about other people needs and problems.", 1, 1));
        oAPABD.addPergunta((new Pergunta("2. Volunteering allows me to learn new things and to gain a new perspective about the cause I am working.",2 ,1 )));
        oAPABD.addPergunta((new Pergunta("3. Volunteering makes me feel important and needed.",3 ,1 )));
        oAPABD.addPergunta((new Pergunta("4. Volunteering will help me to succeed in getting a job or a career.",4 ,1 )));
        oAPABD.addPergunta((new Pergunta("5. My friends and peopleI am close volunteer and want me to follow them.",5 ,1 )));
        oAPABD.addPergunta((new Pergunta("6. Volunteering helps me to reduce negative emotions, such as loneliness, guilty, sadness and preoccupation.",6 ,1 )));

        oAPABD.addPergunta((new Pergunta("1. It is normal for people to lose their heads and insult others.",1 ,2 )));
        oAPABD.addPergunta((new Pergunta("2. Some people deserve to be mistreated because of the way they behave.",2 ,2 )));
        oAPABD.addPergunta((new Pergunta("3. There may be a legitimate justification for carrying out violent acts directed at others.",3 , 2)));
        oAPABD.addPergunta((new Pergunta("4. The situations of violence should be solved in private only by those directly involved.",4 , 2)));

        oAPABD.addPergunta((new Pergunta("1. Iam confident about the decisions I make and I usually accomplish what I plan to do.",1 , 3)));
        oAPABD.addPergunta((new Pergunta("2. I never go along with the group when I am not sure about what decision to make.",2 ,3 )));
        oAPABD.addPergunta((new Pergunta("3. People have more power on their community if they work together.",3 ,3 )));
        oAPABD.addPergunta((new Pergunta("4. I am generally optimistic about what will happen in my life in the future.",4 ,3 )));
        oAPABD.addPergunta((new Pergunta("5. Getting angry about something can make the difference toward the change.",5 ,3 )));

        oAPABD.addPergunta((new Pergunta("1. Under certain circumstances I may threaten someone.",1 ,4 )));
        oAPABD.addPergunta((new Pergunta("2. I am an argumentative person who often disagree with others and tell them what he/she thinks about them.",2 ,4 )));
        oAPABD.addPergunta((new Pergunta("3. I am a hothead person andI have difficulty controlling my temper .", 3,4 )));
        oAPABD.addPergunta((new Pergunta("4. I am usually a suspicious person about people I don´t know well becauseI feel that other people always seem to get the breaks.",4 ,4 )));

        oAPABD.addPergunta((new Pergunta("1. When I have a choice,I try to work with others in a team instead of by myself.",1 , 5)));
        oAPABD.addPergunta((new Pergunta("2. When working on projects,I enjoy interacting with people.",2 ,5 )));
        oAPABD.addPergunta((new Pergunta("3. I prefer to work ona team rather than work alone in individual tasks.", 3, 5)));

        /**oAPABD.addTema((new Resposta(1,"ola")));
        oAPABD.addTema((new Resposta(2,"ccc")));**/


    }




    public void motivation(View v) {
        startActivity(new Intent(this, Motivation.class));
    }

    public void violence(View v) {
        startActivity(new Intent(this, Violence.class));
    }

    public void sense(View v) {
        startActivity(new Intent(this, Sense.class));
    }

    public void attitudes(View v) {
        startActivity(new Intent(this, Attitudes.class));
    }

    public void work(View v) {
        startActivity(new Intent(this, Work.class));
    }

    public void results(View v) {
        startActivity(new Intent(this, Results.class));
    }
}