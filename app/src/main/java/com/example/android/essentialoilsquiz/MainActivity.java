package com.example.android.essentialoilsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

//global integer for score
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitAnswers(View view) {

        //To see if the Whipped Cream box is checked.
        CheckBox whippedCreamCheckBox = (CheckBox) findViewById(R.id.cb_Whipped_Cream);
        boolean hasWhippedCream = whippedCreamCheckBox.isChecked();

        //To see if the ChocolateCheckBox is checked
        CheckBox chocolateCheckBox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = chocolateCheckBox.isChecked();

        //To calculate price
        int price = calculatePrice(hasWhippedCream, hasChocolate);
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();
        String priceMessage= createOrderSummary(price, hasWhippedCream, hasChocolate, name);
        displayMessage(priceMessage);


        // get score
        score = onCheckboxClicked() + radioButtonSelected() + editTextAnswer();
        //make toast
        Toast.makeText(this, "Your score is " + score + "!", Toast.LENGTH_SHORT).show();
    }


    /** This is to find the correct answer for question #1.
    **/

    public void onRadioButtonClicked1(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_lavendar:
                if (checked)
                    // Lavendar is the correct answer
                    break;
            case R.id.radio_rose:
                if (checked)
                    // wrong answer
                    break;
            case R.id.radio_citronella:
                if (checked)
                    // wrong answer
                    break;
            case R.id.radio_cypress:
                if (checked)
                    // wrong answer
                    break;
        }


            /** Question number two: Check which boxes are button clicked.  Two boxes should be checked. This method is called when the correct boxes are checked.
        **/

            public void checkbox(View view){
//To see if Cedarwood box checked.
            CheckBox ceadarwoodCheckBox= (CheckBox) findViewById(R.id.cb_Cedarwood);
            boolean hasCederwood = ceadarwoodCheckBox.isChecked();

            //To see if Myrhh box checked.
            CheckBox myrhhCheckBox= (CheckBox) findViewById(R.id.cb_Myrhh);
            boolean hasMrryh = myrhhCheckBox.isChecked();

            //to see if Vetiver box checked.
            CheckBox vetiverCheckBox= (CheckBox) findViewById(R.id.cb_Vetiver);
            boolean hasVetiver = vetiverCheckBox.isChecked();

            CheckBox frankensenseCheckBox= (CheckBox) findViewById(R.id.cb_Frankensense);
            boolean hasFrankensense = frankensenseCheckBox.isChecked();
            }

        /** Question number 3 finding the right answer.  The answer is true.
         *
         */

        public void onRadioButtonClicked3(View view) {
            // Is the button now checked?
            boolean checked2 = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.radio_true:
                    if (checked)
                        // True is the correct answer
                        break;
                case R.id.radio_false:
                    if (checked)
                        // wrong answer
                        break;
            }


            /**Question number 4 finding the right answer.  The answer is Basil.
             *
             */
            public void onRadioButtonClicked4(View view) {
                // Is the button now checked?
                boolean checked = ((RadioButton) view).isChecked();

            switch(view.getId()) {
                case R.id.radio_sandlewood:
                    if (checked)
                        // wrong answer.
                        break;
                case R.id.radio_wintergreen:
                    if (checked)
                        // wrong answer
                        break;
                case R.id.radio_peppermint:
                    if (checked)
                        // wrong answer
                        break;
                case R.id.radio_basil:
                    if (checked)
                        // Basil is the correct answer.
                        break;

/**Question number 5.  There is no wrong answer.  They just have to type in a name of an essential oil.
 *
 *
 */

private void displayname(String) {
    TextView
                }















}
