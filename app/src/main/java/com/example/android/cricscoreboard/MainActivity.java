package com.example.android.cricscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /**
     *  Tracks the Run
     */
    int run = 0;

    /**
     *  Tracks the Wickets
     */
    int wickets = 0;
    /**
     *  Tracks the balls
     */
    int balls = 0;
    /**
     *  Tracks the Overs
     */
    int overs = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the Run by 1 point.
     */
    public void addOneForRun(View v) {
        run = run + 1;
        displayForRun(run);
    }
    /**
     * Increase the Run by 4 point.
     */
    public void addFourForRun(View v) {
        run = run + 4;
        displayForRun(run);
    }
    /**
     * Increase the Run by 6 point.
     */
    public void addSixForRun(View v) {
        run = run + 6;
        displayForRun(run);
    }
    /**
     * Decrease the Run by 1 point.
     */
    public void DecreaseOneForRun(View v) {
        if (run==0){
            Toast.makeText(this, "You Can Not Have Less Than 0 Run", Toast.LENGTH_SHORT).show();
            return;
        }
        run = run - 1;
        displayForRun(run);
    }
    /**
     * Increase the Wickets by 1 point.
     */
    public void AddOneForWickets(View v) {
        wickets = wickets + 1;
        displayForWickets(wickets);
    }
    /**
     * Decrease the Wickets by 1 point.
     */
    public void DecreaseOneForWickets(View v) {
        if (wickets==0){
            Toast.makeText(this, "You Can Not Have Less Than 0 Wickets", Toast.LENGTH_SHORT).show();
            return;
        }
        wickets = wickets - 1;
        displayForWickets(wickets);
    }
    /**
     * increase the Balls by 1.
     */
    public void IncreaseBallByOne(View v) {
        if (balls==6){
            balls = balls-6;
            displayForBalls(balls);
        }
        balls = balls + 1;
        displayForBalls(balls);
    }
    /**
     * Decrease the Balls by 1.
     */
    public void DecreaseBallByOne(View v) {
        if (balls==0){
            Toast.makeText(this, "You Can Not Have Less Than 0 balls", Toast.LENGTH_SHORT).show();
            return;
        }
        balls = balls - 1;
        displayForBalls(balls);
    }
    /**
     * increase the Overs by 1.
     */
    public void IncreaseOverByOne(View v) {
        overs = overs + 1;
        displayForOvers(overs);
    }
    /**
     * Decrease the Overs by 1.
     */
    public void DecreaseOverByOne(View v) {
        if (overs==0){
            Toast.makeText(this, "You Can Not Have Less Than 0 overs", Toast.LENGTH_SHORT).show();
            return;
        }
        overs = overs - 1;
        displayForOvers(overs);
    }
    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        run = 0;
        wickets = 0;
        overs = 0;
        balls= 0 ;
        displayForRun(run);
        displayForOvers(overs);
        displayForBalls(balls);
        displayForWickets(wickets);
    }
    /**
     * Displays the given score for Run.
     */
    public void displayForRun(int score) {
        TextView scoreView = (TextView) findViewById(R.id.run_for_batting);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForWickets(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wickets_of_batting);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForOvers(int score) {
        TextView scoreView = (TextView) findViewById(R.id.overs_team);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBalls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.balls_team);
        scoreView.setText(String.valueOf(score));
    }
}
