package rocks.athrow.android_quiz_app;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }


    public void submitAnswers(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        //------------------------------------------------------------------------------------------
        // Question 1 - Correct Answer is #3 (DNA)
        //------------------------------------------------------------------------------------------
        Boolean answer1;

        RadioButton question1_choice3 = (RadioButton) this.findViewById(R.id.question1_choice3);
        if (question1_choice3 != null) {
            answer1 = question1_choice3.isChecked();
        } else {
            answer1 = null;
        }
        if (answer1 == null || !answer1) {
            answer1_score = 0;
        } else {
            answer1_score = 1;
        }
        //------------------------------------------------------------------------------------------
        // Question 2 - Correct Answer is "Vulcanizing"
        //------------------------------------------------------------------------------------------
        String answer2;
        EditText question2_answer = (EditText) this.findViewById(R.id.question2_answer);
        if (question2_answer != null) {
            answer2 = question2_answer.getText().toString().toLowerCase();
        } else {
            answer2 = "";
        }
        if (answer2.equals("vulcanizing")) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 3  - Correct Answers are #1 (Ribosomes) and #3 (Golgi Apparatus)
        //------------------------------------------------------------------------------------------
        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        CheckBox question3_choice1 = (CheckBox) this.findViewById(R.id.question3_choice1);
        CheckBox question2_choice2 = (CheckBox) this.findViewById(R.id.question3_choice2);
        CheckBox question3_choice3 = (CheckBox) this.findViewById(R.id.question3_choice3);
        CheckBox question3_choice4 = (CheckBox) this.findViewById(R.id.question3_choice4);
        if (question3_choice1 != null) {
            answer3_choice1 = question3_choice1.isChecked();
        } else {
            answer3_choice1 = null;
        }
        if (question2_choice2 != null) {
            answer3_choice2 = question2_choice2.isChecked();
        } else {
            answer3_choice2 = null;
        }
        if (question3_choice3 != null) {
            answer3_choice3 = question3_choice3.isChecked();
        } else {
            answer3_choice3 = null;
        }
        if (question3_choice4 != null) {
            answer3_choice4 = question3_choice4.isChecked();
        } else {
            answer3_choice4 = null;
        }
        if ((answer3_choice1 != null && answer3_choice1) &&
                (answer3_choice2 == null || !answer3_choice2) &&
                (answer3_choice3 != null && answer3_choice3) &&
                (answer3_choice4 == null || !answer3_choice4)
                ) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 4 - Correct Answer is "Gravity"
        //------------------------------------------------------------------------------------------
        String answer4;
        EditText question4_answer = (EditText) this.findViewById(R.id.question4_answer);
        if (question4_answer != null) {
            answer4 = question4_answer.getText().toString().toLowerCase();
        } else {
            answer4 = "";
        }
        if (answer4.equals("gravity")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 5  - Correct Answers is #2 "Pine trees"
        //------------------------------------------------------------------------------------------
        Boolean answer5;

        RadioButton question5_choice2 = (RadioButton) this.findViewById(R.id.question5_choice2);
        if (question5_choice2 != null) {
            answer5 = question5_choice2.isChecked();
        } else {
            answer5 = null;
        }
        if (answer5 == null || !answer5) {
            answer5_score = 0;
        } else {
            answer5_score = 1;
        }
        //------------------------------------------------------------------------------------------
        // Question 6 - Correct Answer is "Clouds" or "Cloud"
        //------------------------------------------------------------------------------------------
        String answer6;
        EditText question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        if (question6_answer != null) {
            answer6 = question6_answer.getText().toString().toLowerCase();
        } else {
            answer6 = "";
        }
        if (answer6.equals("clouds") || answer6.equals("cloud")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 7  - Correct Answers are #3 (Earth) and #4 (Pluto)
        //------------------------------------------------------------------------------------------
        Boolean answer7_choice1;
        Boolean answer7_choice2;
        Boolean answer7_choice3;
        Boolean answer7_choice4;
        CheckBox question7_choice1 = (CheckBox) this.findViewById(R.id.question7_choice1);
        CheckBox question7_choice2 = (CheckBox) this.findViewById(R.id.question7_choice2);
        CheckBox question7_choice3 = (CheckBox) this.findViewById(R.id.question7_choice3);
        CheckBox question7_choice4 = (CheckBox) this.findViewById(R.id.question7_choice4);
        if (question7_choice1 != null) {
            answer7_choice1 = question7_choice1.isChecked();
        } else {
            answer7_choice1 = null;
        }
        if (question2_choice2 != null) {
            answer7_choice2 = question7_choice2.isChecked();
        } else {
            answer7_choice2 = null;
        }
        if (question3_choice3 != null) {
            answer7_choice3 = question7_choice3.isChecked();
        } else {
            answer7_choice3 = null;
        }
        if (question3_choice4 != null) {
            answer7_choice4 = question7_choice4.isChecked();
        } else {
            answer7_choice4 = null;
        }
        if ((answer7_choice1 == null || !answer7_choice1) &&
                (answer7_choice2 == null || !answer7_choice2) &&
                (answer7_choice3 != null && answer7_choice3) &&
                (answer7_choice4 != null && answer7_choice4)
                ) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 8 - Correct Answer is "Wrist"
        //------------------------------------------------------------------------------------------
        String answer8;
        EditText question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        if (question8_answer != null) {
            answer8 = question8_answer.getText().toString().toLowerCase();
        } else {
            answer8 = "";
        }
        if (answer8.equals("wrist")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Question 9  - Correct Answers is #2 "Stalagmites"
        //------------------------------------------------------------------------------------------
        Boolean answer9;

        RadioButton question9_choice2 = (RadioButton) this.findViewById(R.id.question9_choice2);
        if (question9_choice2 != null) {
            answer9 = question9_choice2.isChecked();
        } else {
            answer9 = null;
        }
        if (answer9 == null || !answer9) {
            answer9_score = 0;
        } else {
            answer9_score = 1;
        }
        //------------------------------------------------------------------------------------------
        // Question 10 - Correct Answer is "Smelting"
        //------------------------------------------------------------------------------------------
        String answer10;
        EditText question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        if (question10_answer != null) {
            answer10 = question10_answer.getText().toString().toLowerCase();
        } else {
            answer10 = "";
        }
        if (answer10.equals("smelting")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }
        //------------------------------------------------------------------------------------------
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
        answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if ( final_score == 10 ){
            resultsDisplay = "Perfect! You scored 10 out of 10";
        }else{
            resultsDisplay = "Try again. You scored " + final_score + " our of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}

