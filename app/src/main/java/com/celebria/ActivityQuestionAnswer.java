package com.celebria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * Created by mitesh on 9/7/16.
 */
public class ActivityQuestionAnswer extends AppCompatActivity implements View.OnClickListener{

    private TextView txtOption1;
    private TextView txtOption2;
    private TextView txtOption3;
    private TextView txtOption4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_answer);

        initComponents();
        listViewClickEvents();
    }

    private void listViewClickEvents() {
    }

    private void initComponents() {
        txtOption1 = (TextView)findViewById(R.id.textViewOption1);
        txtOption2 = (TextView)findViewById(R.id.textViewOption2);
        txtOption3 = (TextView)findViewById(R.id.textViewOption3);
        txtOption4 = (TextView)findViewById(R.id.textViewOption4);

        txtOption1.setOnClickListener(this);
        txtOption2.setOnClickListener(this);
        txtOption3.setOnClickListener(this);
        txtOption4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.textViewOption1:
                Intent intent = new Intent(ActivityQuestionAnswer.this, ActivityWinner.class);
                startActivity(intent);
                break;
            case R.id.textViewOption2:
                Intent intent2 = new Intent(ActivityQuestionAnswer.this, ActivityWinner.class);
                startActivity(intent2);
                break;
            case R.id.textViewOption3:
                Intent intent3 = new Intent(ActivityQuestionAnswer.this, ActivityWinner.class);
                startActivity(intent3);
                break;
            case R.id.textViewOption4:
                Intent intent4 = new Intent(ActivityQuestionAnswer.this, ActivityWinner.class);
                startActivity(intent4);
                break;

        }
    }
}
