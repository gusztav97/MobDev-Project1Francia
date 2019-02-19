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
import android.widget.TextView;

public class ProjectCalculator extends AppCompatActivity implements View.OnClickListener{

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
    }

    public void onClick(View v){

        TextView textView = (TextView) findViewById(R.id.textView2);

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
