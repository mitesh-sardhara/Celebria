package com.celebria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;


/**
 * Created by mitesh on 9/7/16.
 */
public class ActivityMatchUp extends AppCompatActivity{

    private RelativeLayout relativeQuzFor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchup);

        initComponents();
        clickEvents();
    }

    private void clickEvents() {
        relativeQuzFor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityMatchUp.this, ActivityQuestionAnswer.class);
                startActivity(intent);
            }
        });
    }

    private void initComponents() {
        relativeQuzFor = (RelativeLayout) findViewById(R.id.relativeQuizFor);
    }
}
