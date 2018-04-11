package com.example.android.essentialoilsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;


/**This app is a 5 question quiz on essential oils.
 *
 */

public class MainActivity extends AppCompatActivity {

    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This is to find the correct answers for the radio buttons. Questions 1.
     **/

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        RadioButton lavendar = (RadioButton) findViewById(R.id.radio_lavendar);
        boolean lavendarChecked = lavendar.isChecked();

        RadioButton rose = (RadioButton) findViewById(R.id.radio_rose);
        boolean roseChecked = rose.isChecked();

        RadioButton citronella = (RadioButton) findViewById(R.id.radio_citronella);
        boolean citronellaChecked = citronella.isChecked();

        RadioButton cypress = (RadioButton) findViewById(R.id.radio_cypress);
        boolean cypressChecked = cypress.isChecked();

        if (lavendarChecked) {
            // Lavendar is the correct answer to question 1
            score = score + 20;
        }
        if (roseChecked) {
            score = score;
        }
        if (citronellaChecked) {
            score = score;
        }
        if (cypressChecked) {
            score = score;
        }

/**
 * This is to find the correct answers for the checkboxes buttons. Questions 2.
 **/

        //To see if Cedarwood box checked.
        CheckBox ceadarwoodCheckBox = (CheckBox) findViewById(R.id.cb_Cedarwood);
        boolean hasCedarwood = ceadarwoodCheckBox.isChecked();

        //To see if Myrhh box checked.
        CheckBox myrhhCheckBox = (CheckBox) findViewById(R.id.cb_Myrhh);
        boolean hasMrryh = myrhhCheckBox.isChecked();

        //to see if Vetiver box checked.
        CheckBox vetiverCheckBox = (CheckBox) findViewById(R.id.cb_Vetiver);
        boolean hasVetiver = vetiverCheckBox.isChecked();

        CheckBox frankensenseCheckBox = (CheckBox) findViewById(R.id.cb_Frankensense);
        boolean hasFrankensense = frankensenseCheckBox.isChecked();

        if (hasMrryh && hasFrankensense) {
            score = score + 20;
        }else
            score = score;


/**
 * This is to find the correct answers for the radio buttons. Questions 3.
 **/
        // Q3 Is the button now checked?
        RadioButton radioTrue = (RadioButton) findViewById(R.id.radio_true);
        boolean radioTrueChecked = radioTrue.isChecked();

        RadioButton radioFalse = (RadioButton) findViewById(R.id.radio_false);
        boolean radioFalseChecked = radioFalse.isChecked();


        if (radioTrueChecked) {
            // True is the correct answer to question 3
            score = score + 20;
        }
        if (radioFalseChecked) {
            score = score;
        }

/**
 * This is to find the correct answers for the radio buttons. Questions 4.
 **/
        // Is the button now checked?
        RadioButton basil = (RadioButton) findViewById(R.id.radio_basil);
        boolean basilChecked = basil.isChecked();

        RadioButton sandlewood = (RadioButton) findViewById(R.id.radio_sandlewood);
        boolean sandlewoodChecked = sandlewood.isChecked();

        RadioButton wintergreen = (RadioButton) findViewById(R.id.radio_wintergreen);
        boolean wintergreenChecked = wintergreen.isChecked();

        RadioButton peppermint = (RadioButton) findViewById(R.id.radio_peppermint);
        boolean peppermintChecked = peppermint.isChecked();

        if (basilChecked) {
            // Basil is the correct answer to question 4
            score = score + 20;
            }
        if (sandlewoodChecked) {
            score = score;
        }
        if (wintergreenChecked) {
            score = score;
        }
        if (peppermintChecked) {
            score = score;
        }
/**
 * This is to find the correct answers for the radio buttons. Questions 5.
 **/
        // Is the button now checked?
        RadioButton cleaning = (RadioButton) findViewById(R.id.radio_cleaning);
        boolean cleaningChecked = cleaning.isChecked();

        RadioButton pipeClean = (RadioButton) findViewById(R.id.radion_pipe_cleaner);
        boolean pipeCleanChecked = pipeClean.isChecked();

        RadioButton roomFreshener = (RadioButton) findViewById(R.id.radio_freshener);
        boolean roomFreshenerChecked = roomFreshener.isChecked();

        RadioButton waterAdditive = (RadioButton) findViewById(R.id.radio_water);
        boolean waterAdditiveChecked = waterAdditive.isChecked();

                if (cleaningChecked) {
                    //Cleaning is the correct answer to question 5
                    score = score + 20;
                }
        if (pipeCleanChecked) {
            score = score;
        }
        if (roomFreshenerChecked) {
            score = score;
        }
        if (waterAdditiveChecked) {
            score = score;
        }
        }

/**Displays the final score. First, method displays the given score.
 *
 */
private void submitOrder () {
    Toast.makeText(this, "You scored " + score + "%!", Toast.LENGTH_SHORT).show();
}


        }






