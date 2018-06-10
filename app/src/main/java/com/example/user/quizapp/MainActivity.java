package com.example.user.quizapp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0, score2 =0, score3 = 0, score4 = 0, score5 = 0, score6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//end of onCreate

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()){
            //question 1
            case R.id.button_1a:
                if (checked)
                    score = 0;
                break;

            case R.id.button_1b:
                if (checked)
                    score = 0;
                break;

            case R.id.button_1c:
                if (checked)
                score += 1;
                break;

            case R.id.button_1d:
                if (checked)
                    score = 0;
                break;
                //end of question 1

            //question 2
            case R.id.button_2a:
                if (checked)
                    score2 += 1;
                break;

            case R.id.button_2b:
                if (checked)
                    score2 = 0;
                break;

            case R.id.button_2c:
                if (checked)
                    score2 = 0;
                break;

            case R.id.button_2d:
                if (checked)
                    score2 = 0;
                break;
                //end of question 2

            //question 3
            case R.id.button_3a:
                if (checked)
                    score3 += 0;
                break;

            case R.id.button_3b:
                if (checked)
                    score3 = 1;
                break;

            case R.id.button_3c:
                if (checked)
                    score3 = 0;
                break;

            case R.id.button_3d:
                if (checked)
                    score3 = 0;
                break;
            //end of question 3

            //question 4
            case R.id.button_4a:
                if (checked)
                    score4 += 0;
                break;

            case R.id.button_4b:
                if (checked)
                    score4 = 1;
                break;

            case R.id.button_4c:
                if (checked)
                    score4 = 0;
                break;

            case R.id.button_4d:
                if (checked)
                    score4 = 0;
                break;
            //end of question 4
        }
    }

    public void onCheckboxClicked(View view){
        switch (view.getId()){
            case R.id.checkbox_5a:
                doubleCheckedboxes();
                break;

            case R.id.checkbox_5b:
                doubleCheckedboxes();
                break;

            case R.id.checkbox_5c:
                doubleCheckedboxes();
                break;

            case R.id.checkbox_5d:
                doubleCheckedboxes();
                break;
        }
    }

    private void doubleCheckedboxes(){
        CheckBox CB1 = findViewById(R.id.checkbox_5b);//right answer
        CheckBox CB2 = findViewById(R.id.checkbox_5d);//right answer
        CheckBox CB3 = findViewById(R.id.checkbox_5a);
        CheckBox CB4 = findViewById(R.id.checkbox_5c);

        boolean right = CB1.isChecked() && CB2.isChecked();
        boolean wrong = CB3.isChecked() || CB4.isChecked();

        if (right && !wrong){
            score5 =+ 1;
        }else {
            score5 = 0;
        }
    }

    private void question1code(){
        RadioButton button1 = findViewById(R.id.button_1c);//the answer
        RadioButton button2 = findViewById(R.id.button_1a);
        RadioButton button3 = findViewById(R.id.button_1b);
        RadioButton button4 = findViewById(R.id.button_1d);

        if (button2.isChecked()){
            button2.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answer1);
            ans1.setText(getResources().getString(R.string.ans1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (button3.isChecked()){
            button3.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answer1);
            ans1.setText(getResources().getString(R.string.ans1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (button4.isChecked()){
            button4.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans1 = findViewById(R.id.answer1);
            ans1.setText(getResources().getString(R.string.ans1));
            ans1.setVisibility(View.VISIBLE);
            ans1.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
    }

    private void question2code(){
        RadioButton button1 = findViewById(R.id.button_2a);//the answer
        RadioButton button2 = findViewById(R.id.button_2b);
        RadioButton button3 = findViewById(R.id.button_2c);
        RadioButton button4 = findViewById(R.id.button_2d);

        if (button2.isChecked()){
            button2.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answer2);
            ans2.setText(getResources().getString(R.string.ans2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (button3.isChecked()){
            button3.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answer2);
            ans2.setText(getResources().getString(R.string.ans2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (button4.isChecked()){
            button4.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans2 = findViewById(R.id.answer2);
            ans2.setText(getResources().getString(R.string.ans2));
            ans2.setVisibility(View.VISIBLE);
            ans2.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
    }

    private void question3code(){
        RadioButton button1 = findViewById(R.id.button_3b);//the answer
        RadioButton button2 = findViewById(R.id.button_3a);
        RadioButton button3 = findViewById(R.id.button_3c);
        RadioButton button4 = findViewById(R.id.button_3d);

        if (button2.isChecked()){
            button2.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answer3);
            ans3.setText(getResources().getString(R.string.ans3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (button3.isChecked()){
            button3.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answer3);
            ans3.setText(getResources().getString(R.string.ans3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (button4.isChecked()){
            button4.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans3 = findViewById(R.id.answer3);
            ans3.setText(getResources().getString(R.string.ans3));
            ans3.setVisibility(View.VISIBLE);
            ans3.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
    }

    private void question4code(){
        RadioButton button1 = findViewById(R.id.button_4b);//the answer
        RadioButton button2 = findViewById(R.id.button_4a);
        RadioButton button3 = findViewById(R.id.button_4c);
        RadioButton button4 = findViewById(R.id.button_4d);

        if (button2.isChecked()){
            button2.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answer4);
            ans4.setText(getResources().getString(R.string.ans4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (button3.isChecked()){
            button3.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answer4);
            ans4.setText(getResources().getString(R.string.ans4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (button4.isChecked()){
            button4.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans4 = findViewById(R.id.answer4);
            ans4.setText(getResources().getString(R.string.ans4));
            ans4.setVisibility(View.VISIBLE);
            ans4.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
    }

    private void question5code(){
        CheckBox button1 = findViewById(R.id.checkbox_5b);//Argentina the answer
        CheckBox button2 = findViewById(R.id.checkbox_5d);//Brazil the answer
        CheckBox button3 = findViewById(R.id.checkbox_5a);//Germany
        CheckBox button4 = findViewById(R.id.checkbox_5c);//Australia

        boolean germanyOnly = button3.isChecked();
        boolean australiaOnly = button4.isChecked();

        if (germanyOnly) {
            button3.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        if (australiaOnly) {
            button4.setBackground(getResources().getDrawable(R.drawable.radio_buttons));
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }

        boolean a = button1.isChecked() && button2.isChecked();
        boolean b = a && germanyOnly;
        boolean c = a && australiaOnly;

        boolean x = button2.isChecked() && button3.isChecked() && button4.isChecked();
        boolean y = button1.isChecked();
        boolean m = button1.isChecked() && button3.isChecked() && button4.isChecked();
        boolean n = button2.isChecked();

        if (b || c){
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5alt2));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (!x && y){
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5alt1));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));

        }else if (!m && n){
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(getResources().getString(R.string.ans5alt1));
            ans5.setVisibility(View.VISIBLE);
            ans5.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        if (a && !germanyOnly && !australiaOnly){
            TextView ans5 = findViewById(R.id.answer5);
            ans5.setText(null);
            ans5.setVisibility(View.GONE);
        }
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
    }

    private void question6code(){
        TextInputEditText ed = findViewById(R.id.editText);
        String myAnswer = ed.getText().toString();
        String russia = "Russia";

        if (myAnswer.trim().equalsIgnoreCase(russia)){
            score6 =+ 1;
        }else {
            TextView ans6 = findViewById(R.id.answer6);
            ans6.setText(getResources().getString(R.string.ans6));
            ans6.setVisibility(View.VISIBLE);
            ans6.setBackground(getResources().getDrawable(R.drawable.hidden_textview));
        }
        ed.setEnabled(false);
    }

    public void submitButton(View view){
        //errors
        RadioGroup rg1 = findViewById(R.id.rg1);
        RadioGroup rg2 = findViewById(R.id.rg2);
        RadioGroup rg3 = findViewById(R.id.rg3);
        RadioGroup rg4 = findViewById(R.id.rg4);

        TextInputEditText ed = findViewById(R.id.editText);

        CheckBox CB1 = findViewById(R.id.checkbox_5b);//right answer
        CheckBox CB2 = findViewById(R.id.checkbox_5d);//right answer
        CheckBox CB3 = findViewById(R.id.checkbox_5a);
        CheckBox CB4 = findViewById(R.id.checkbox_5c);
        boolean checked = CB1.isChecked() || CB2.isChecked() || CB3.isChecked() || CB4.isChecked(); //at least one checkbox is checked

        if(rg1.getCheckedRadioButtonId() == -1){
            //if no RadioButton is checked
            Toast.makeText(this, "Question 1 not answered", Toast.LENGTH_SHORT).show();

        }else if(rg2.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 2 not answered", Toast.LENGTH_SHORT).show();

        }else if(rg3.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 3 not answered", Toast.LENGTH_SHORT).show();

        }else if (rg4.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "Question 4 not answered", Toast.LENGTH_SHORT).show();

        }else if (!checked){
            Toast.makeText(this, "Question 5 not answered", Toast.LENGTH_SHORT).show();

        } else if (ed.length() == 0){
            Toast.makeText(this, "Question 6 not answered", Toast.LENGTH_SHORT).show();
        }
        else {
            //if at least one RadioButton & checkbox is checked and the editText not empty
            question1code();
            question2code();
            question3code();
            question4code();
            question5code();
            question6code();

            int totalScore = score + score2 + score3 + score4 + score5 + score6;
            //Toasts
            if (totalScore <= 2){
                Toast.makeText(this, "Ooops!", Toast.LENGTH_SHORT).show();
            }else if (totalScore == 3){
                Toast.makeText(this, "Good Job!", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Excellent Job!", Toast.LENGTH_SHORT).show();
            }

            //TextView
            TextView results = findViewById(R.id.results);
            results.setText(getResources().getString(R.string.results, totalScore));
            results.setVisibility(View.VISIBLE);

            //Buttons
            Button next = findViewById(R.id.next_button);
            next.setVisibility(View.VISIBLE);
            Button submit = findViewById(R.id.submit_button);
            submit.setEnabled(false);
        }
    }

    public void nextPage(View view){
        startActivity(new Intent(this, SecondActivity.class));
    }

}//end of public class
