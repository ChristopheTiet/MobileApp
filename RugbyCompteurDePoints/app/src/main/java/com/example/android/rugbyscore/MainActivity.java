package com.example.android.rugbyscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addTryForTeamA(View view) {
        scoreA = scoreA + 5;
        displayForTeamA(scoreA);
    }

    public void addConversionForTeamA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void addPenaltyForTeamA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void addDropForTeamA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addTryForTeamB(View view) {
        scoreB= scoreB + 5;
        displayForTeamB(scoreB);
    }

    public void addConversionForTeamB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void addPenaltyForTeamB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void addDropForTeamB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
