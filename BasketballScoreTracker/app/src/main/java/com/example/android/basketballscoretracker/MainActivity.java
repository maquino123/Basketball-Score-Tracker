package com.example.android.basketballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Score is a global variable as it needs to be
    // - saved
    // - modified for a longer period of time
    // - in between button clicks
    int scoreForTeamA = 0;

    @Override
    //Occurs right when app starts up
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increases the score for Team A by 3
     * @param v
     */
    public void addThreeForTeamA(View v){
        scoreForTeamA = scoreForTeamA + 3;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increases the score for Team A by 2
     * @param v
     */
    public void addTwoForTeamA(View v){
        scoreForTeamA = scoreForTeamA + 2;
        displayForTeamA(scoreForTeamA);
    }

    /**
     * Increases the score for Team A by 1
     * @param v
     */
    public void addFreeThrowForTeamA(View v){
        scoreForTeamA = scoreForTeamA + 1;
        displayForTeamA(scoreForTeamA);
    }


    /**
     * Displays the given score for the first team
     * @param score
     */
    public void displayForTeamA(int score){
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
