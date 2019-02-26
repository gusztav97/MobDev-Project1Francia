package com.example.jsu.project1francia;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProjectCalculator extends AppCompatActivity implements View.OnClickListener{

    double buffer;
    double numberConvert;
    double previousCompute;
    double result;
    boolean additionFlag;
    boolean subtractionFlag;
    boolean divisionFlag;
    boolean multiplicationFlag;
    boolean percentFlag;
    double percentage;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button one = (Button) findViewById(R.id.buttonOne);
        one.setOnClickListener(this);
        Button two = (Button) findViewById(R.id.buttonTwo);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.buttonThree);
        three.setOnClickListener(this);
        Button four = (Button) findViewById(R.id.buttonFour);
        four.setOnClickListener(this);
        Button five = (Button) findViewById(R.id.buttonFive);
        five.setOnClickListener(this);
        Button six = (Button) findViewById(R.id.buttonSix);
        six.setOnClickListener(this);
        Button seven = (Button) findViewById(R.id.buttonSeven);
        seven.setOnClickListener(this);
        Button eight = (Button) findViewById(R.id.buttonEight);
        eight.setOnClickListener(this);
        Button nine = (Button) findViewById(R.id.buttonNine);
        nine.setOnClickListener(this);
        Button zero = (Button) findViewById(R.id.buttonZero);
        zero.setOnClickListener(this);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        result = 0;
        previousCompute = 0;
        result = 0;

        additionFlag = false;
        subtractionFlag = false;
        divisionFlag = false;
        multiplicationFlag = false;
        percentFlag = false;
    }

    public void onClick(View v){

        textView = (TextView) findViewById(R.id.textView2);

        double secondInput;
        double output = 0;

        switch(v.getId()){
            case R.id.buttonOne:
                textView.append("1");
                break;

            case R.id.buttonTwo:
                textView.append("2");
                break;
            case R.id.buttonThree:
                textView.append("3");
                break;
            case R.id.buttonFour:
                textView.append("4");
                break;
            case R.id.buttonFive:
                textView.append("5");
                break;
            case R.id.buttonSix:
                textView.append("6");
                break;
            case R.id.buttonSeven:
                textView.append("7");
                break;
            case R.id.buttonEight:
                textView.append("8");
                break;
            case R.id.buttonNine:
                textView.append("9");
                break;
            case R.id.buttonZero:
                textView.append("0");
                break;

            case R.id.buttonAddition:
                buffer = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                additionFlag = true;
                break;
            case R.id.buttonSubtraction:
                buffer = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                subtractionFlag = true;
                break;

            case R.id.buttonDivision:
                buffer = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                divisionFlag = true;

                break;
            case R.id.buttonMultiplication:
                buffer = Double.parseDouble(textView.getText().toString());
                textView.setText("");
                multiplicationFlag = true;
                break;
            case R.id.buttonClear:
                textView.setText("");
                buffer = 0.0;
                previousCompute = 0.0;
                break;
            case R.id.buttonConversion:
                numberConvert = Double.parseDouble(textView.getText().toString());
                numberConvert *= -1;
                previousCompute *= -1;
                textView.setText(Double.toString(numberConvert));
                break;
            case R.id.buttonPercentage:
                percentFlag = true;
            case R.id.buttonEquals:
                secondInput = Double.parseDouble(textView.getText().toString());
                if(additionFlag == true && percentFlag == false){
                    output = buffer + secondInput;
                    additionFlag = false;
                    textView.setText(Double.toString(output));
                }
                if(additionFlag == true && percentFlag == true){
                    percentage = buffer + (buffer * secondInput/100);
                    textView.setText(Double.toString(percentage));
                    percentFlag = false;
                }
                if(subtractionFlag == true){
                    output = buffer - secondInput;
                    subtractionFlag = false;
                    textView.setText(Double.toString(output));
                }
                if(multiplicationFlag == true){
                    output = buffer * secondInput;
                    multiplicationFlag= false;
                    textView.setText(Double.toString(output));
                }
                if(divisionFlag == true){
                    output = buffer / secondInput;
                    divisionFlag = false;
                    textView.setText(Double.toString(output));
                }/*
                if(percentFlag == true && additionFlag == true){
                    percentage = buffer + (buffer * (secondInput/100));
                    textView.setText(Double.toString(percentage));
                    percentFlag = false;
                }  */

            default:
                break;


        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_project_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
