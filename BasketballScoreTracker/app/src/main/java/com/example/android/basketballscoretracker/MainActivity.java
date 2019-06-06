package com.example.android.basketballscoretracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    //Occurs right when app starts up
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }

    public void addThreeForTeamA(View v){
        displayForTeamA(3);
    }

    public void addTwoForTeamA(View v){
        displayForTeamA(2);
    }

    public void addFreeThrowForTeamA(View v){
        displayForTeamA(1);
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
