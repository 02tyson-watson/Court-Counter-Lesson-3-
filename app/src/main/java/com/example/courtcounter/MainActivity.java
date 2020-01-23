package com.example.courtcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int totalA = 0;
    int totalB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(totalA);
        displayForTeamB(totalB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Points_A);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Points_B);
        scoreView.setText(String.valueOf(score));
    }
    public void add_three_A(View view){
        totalA = totalA + 3;
        displayForTeamA(totalA);
    }
    public void add_two_A(View view){
        totalA = totalA + 2;
        displayForTeamA(totalA);
    }
    public void add_one_A(View view){
        totalA = totalA + 1;
        displayForTeamA(totalA);
    }
    public void add_three_B(View view){
        totalB = totalB + 3;
        displayForTeamB(totalB);
    }
    public void add_two_B(View view){
        totalB = totalB + 2;
        displayForTeamB(totalB);
    }
    public void add_one_B(View view){
        totalB = totalB + 1;
        displayForTeamB(totalB);
    }
    public void reset_A(View view){
        totalA = 0;
        displayForTeamA(totalA);
    }
    public void reset_B(View view){
        totalB = 0;
        displayForTeamB(totalB);
    }
}
