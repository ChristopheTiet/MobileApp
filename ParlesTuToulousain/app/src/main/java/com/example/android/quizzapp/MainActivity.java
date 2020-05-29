package com.example.android.quizzapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitQuizz(View view) {
        score = 0;
        String result;
        checkScore();

        if (score<1) {
            result = "Ton score est de 0/4, bienvenu à Toulouse étranger!";
        } else if (score == 1) {
            result = "Ton score est de 1/4, il te faut passer plus de temps avec les toulousains! ";
        } else if (score == 2) {
            result = "Ton score est de 2/4, t'es sur le bon chemin pitchou.ne! D'ici peu de temps tu parleras courammment toulousain";
        } else if (score == 3) {
            result = "Ton score est de 3/4, T'es pas toulousain.e de naissance mais presque!";
        } else {
            result = "Ton score est de 4/4, Ah on voit que le toulousain est ta langue natale!";
        }
        Context context = getApplicationContext();
        Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
    }

    private void checkScore() {
        checkFirstQuestion();
        checkSecondQuestion();
        checkThirdQuestion();
        checkFourthQuestion();
    }

    private void checkFirstQuestion() {
        EditText firstAnswerView = findViewById(R.id.first_answer);
        String firstAnswer = firstAnswerView.getText().toString();
        if (firstAnswer.equals("con")) {
            score = score + 1;
        }
    }

    private void checkSecondQuestion() {
        RadioButton chocolatine = findViewById(R.id.radio_chocolatine);
        if (chocolatine.isChecked()) {
            score = score + 1;
        }
    }

    private void checkThirdQuestion() {
        int numberGoodAnswer = 0;
        CheckBox Answer3_1View = findViewById(R.id.answer3_1);
        CheckBox Answer3_2View = findViewById(R.id.answer3_2);
        CheckBox Answer3_3View = findViewById(R.id.answer3_3);
        CheckBox Answer3_4View = findViewById(R.id.answer3_4);
        CheckBox Answer3_5View = findViewById(R.id.answer3_5);

        if (Answer3_1View.isChecked()) {
            numberGoodAnswer = numberGoodAnswer + 1;
        }

        if (!Answer3_2View.isChecked()) {
            numberGoodAnswer = numberGoodAnswer + 1;
        }

        if (Answer3_3View.isChecked()) {
            numberGoodAnswer = numberGoodAnswer + 1;
        }

        if (Answer3_4View.isChecked()) {
            numberGoodAnswer = numberGoodAnswer + 1;
        }

        if (!Answer3_5View.isChecked()) {
            numberGoodAnswer = numberGoodAnswer + 1;
        }

        if (numberGoodAnswer == 5) {
            score = score + 1;
        }
    }

    private void checkFourthQuestion() {
        RadioButton bordelaisView = findViewById(R.id.radio_bordelais_oui);
        if (bordelaisView.isChecked()) {
            score = score + 1;
        }
    }

}
