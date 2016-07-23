package com.celebria;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by mitesh on 9/7/16.
 */
public class ActivityWinner extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner_layout);

        initComponents();
        listViewClickEvents();
    }

    private void listViewClickEvents() {
    }

    private void initComponents() {
        
    }
}
