package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    void plusthreeA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }

    void plusthreeB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    void plustwoA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);

    }

    void plustwoB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    void freethrowA(View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

    }

    void freethrowB(View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    void reset(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }


}
