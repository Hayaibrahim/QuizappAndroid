package com.example.enghaya.quizappandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    EditText Answer;
    RadioButton Answer2;
    RadioButton Answer5;
    CheckBox checkanswer1;
    CheckBox checkanswer2;
    CheckBox checkanswer3;
    CheckBox checkanswer4;
    CheckBox checkanswer5;
    CheckBox checkanswer6;
    Button total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        total = (Button) this.findViewById(R.id.total);

        setContentView(R.layout.activity_main);
    }

    public void Total(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.checkanswer3));
        int ans1_score1;
        int ans2_score2;
        int ans3_score3;
        int ans4_score4;
        int ans5_score5;
        int final_score;


        String answer8;
        Answer = (EditText) this.findViewById(R.id.Answer);
        answer8 = Answer.getText().toString().toLowerCase();
        if (answer8.equals("android")) {
            ans2_score2 = 1;
        } else {
            ans2_score2= 0;
        }

            Boolean answer1;
            Answer2 = (RadioButton) this.findViewById(R.id.answer2);
            answer1 = Answer2.isChecked();
            if (answer1) {
                ans1_score1 = 1;
            } else {
                ans1_score1 = 0;
            }
            Boolean answer5;
            Answer5 = (RadioButton) this.findViewById(R.id.answer4);
            answer5 = Answer5.isChecked();//correct
            if (answer5) {
                ans4_score4 = 1;
            } else {
                ans4_score4 = 0;

            }
            Boolean answer3_choice1;
            Boolean answer3_choice2;
            Boolean answer3_choice3;
            checkanswer1 = (CheckBox) this.findViewById(R.id.checkanswer1);
            checkanswer2 = (CheckBox) this.findViewById(R.id.checkanswer2);
            checkanswer3 = (CheckBox) this.findViewById(R.id.checkanswer3);

            answer3_choice1 = checkanswer1.isChecked();//correct
            answer3_choice2 = checkanswer2.isChecked();
            answer3_choice3 = checkanswer3.isChecked();
            if (answer3_choice1 && answer3_choice2 && answer3_choice3) {
                ans3_score3 = 1;
            } else {
                ans3_score3 = 0;
            }
            Boolean answer7_choice1;
            Boolean answer7_choice2;
            Boolean answer7_choice3;
            checkanswer4 = (CheckBox) this.findViewById(R.id.checkanswer4);//correct
            checkanswer5 = (CheckBox) this.findViewById(R.id.checkanswer5);
            checkanswer6 = (CheckBox) this.findViewById(R.id.checkanswer6);
            answer7_choice1 = checkanswer4.isChecked();
            answer7_choice2 = checkanswer5.isChecked();
            answer7_choice3 = checkanswer6.isChecked();
            if (answer7_choice1 && !answer7_choice1 && !answer7_choice3) {
                ans5_score5 = 1;
            } else {
                ans5_score5 = 0;
            }
            final_score = ans1_score1  + ans3_score3 + ans4_score4 + ans5_score5+ans2_score2;

            if (final_score == 5) {
                resultsDisplay = "Good! You scored 5 out of 5";
            } else {
                resultsDisplay = " score " + final_score + " out of 5";
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, resultsDisplay, duration);
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.show();
            }


        }
    }
