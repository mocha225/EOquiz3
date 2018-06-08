package com.example.android.essentialoilsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * This app is a 5 question quiz on essential oils.
 */

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**Question one is Lavendar checked.
     * /

     * This is to find the correct answers for the radio buttons. Questions 1.
     **/
    // Is the button now checked?
    RadioButton questionOne = findViewById(R.id.radio_lavendar);
    boolean answerQuestionOne = questionOne.isChecked();

    private int calculateScore(boolean answerQuestionOne){
          if (answerQuestionOne) {
              score = score + 20;
        }
        return score;
    }




/**
 * This is to find the correct answers for the checkboxes buttons. Questions 2.
 **/


        //To see if Myrh and Frankensenses boxes checked.
        CheckBox cedarwoodCheckBox = (CheckBox) findViewById(R.id.cb_Cedarwood);
        boolean hasCedarwood = cedarwoodCheckBox.isChecked();
        CheckBox myrhhCheckBox = (CheckBox) findViewById(R.id.cb_Myrhh);
        boolean hasMrryh = myrhhCheckBox.isChecked();
        CheckBox vetiverCheckBox = (CheckBox) findViewById(R.id.cb_Vetiver);
        boolean hasVetiver = vetiverCheckBox.isChecked();
        CheckBox frankensenseCheckBox = (CheckBox) findViewById(R.id.cb_Frankensense);
        boolean hasFrankensense = frankensenseCheckBox.isChecked();

        if (myrhhCheckBox && frankensenseCheckBox && !cedarwoodCheckBox && !vetiverCheckBox) {
        (score = score + 20)
        }

/**
 * This is to find the correct answers for the radio buttons. Questions 3.
 **/

        // Q3 Is the button now checked?
        RadioButton radioTrue = (RadioButton) findViewById(R.id.radio_true);
        boolean radioTrueChecked = radioTrue.isChecked();


        if (radioTrueChecked) {
            // True is the correct answer to question 3
            score = score + 20;
            return;
        }


/**
 * This is to find the correct answers for the radio buttons. Questions 4.
 **/
        // Is the button now checked?
        RadioButton basil = (RadioButton) findViewById(R.id.radio_basil);
        boolean basilChecked = basil.isChecked();


        if (basilChecked) {
            // Basil is the correct answer to question 4
            score = score + 20;
            return;
        }

/**
 * This is to find the correct answers for the radio buttons. Questions 5.
 **/
        // Is the button now checked?
        RadioButton cleaning = (RadioButton) findViewById(R.id.radio_cleaning);
        boolean cleaningChecked = cleaning.isChecked();


        if (cleaningChecked) {
            //Cleaning is the correct answer to question 5
            score = score + 20;
            return;
        }
    }

    /**
     * Displays the final score. First, method displays the given score.
     */
    public void submitOrder(View view) {
        TextView fullTextView = (TextView) findViewById(R.id.button3_id);
        Toast.makeText(this, "You scored " + score + "%!", Toast.LENGTH_SHORT).show();
    }


}






