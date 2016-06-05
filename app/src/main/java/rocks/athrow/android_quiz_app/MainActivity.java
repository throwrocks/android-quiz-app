package rocks.athrow.android_quiz_app;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        // Final Score
        //------------------------------------------------------------------------------------------
        final_score = answer1_score + answer2_score + answer3_score + answer4_score;

        resultsDisplay = Integer.toString(final_score);
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.show();
    }
}

