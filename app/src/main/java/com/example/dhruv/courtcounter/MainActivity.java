package com.example.dhruv.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app is a basket ball score tracker
 */

public class MainActivity extends AppCompatActivity {

    public int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Display method for Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreBoardA = (TextView) findViewById(R.id.teamA_score_text_view);
        scoreBoardA.setText("" + score);
    }

    /**
     * Display method for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreBoardB = (TextView) findViewById(R.id.teamB_score_text_view);
        scoreBoardB.setText("" + score);
    }

    /**
     * Method for +3 Team A
     */
    public void plusThreeTeamA(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    /**
     * Method for +2 Team A
     */
    public void plusTwoTeamA(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    /**
     * Method for Free throw Team A
     */
    public void freeThrowTeamA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    /**
     * Method for +3 Team B
     */
    public void plusThreeTeamB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    /**
     * Method for +2 Team B
     */
    public void plusTwoTeamB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    /**
     * Method for Free throw Team B
     */
    public void freeThrowTeamB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    /**
     * Method for reset button
     */
    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
