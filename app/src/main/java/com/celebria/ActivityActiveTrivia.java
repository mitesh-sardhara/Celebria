package com.celebria;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.celebria.adapter.AdapterActiveTrivia;

/**
 * Created by mitesh on 8/7/16.
 */
public class ActivityActiveTrivia extends AppCompatActivity implements View.OnClickListener{

    private Button btnActiveTrivia;
    private Button btnAllCelebrities;

    private LinearLayout linearActiveTrivia;
    private LinearLayout linearAllCelebrities;

    private ListView listViewActiveTrivia;
    private ListView listViewAllCelebrities;

    private boolean isActiveTriviaSelected = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_active_trivia);

        initComponents();
        listViewClickEvents();
    }

    private void listViewClickEvents() {
        listViewActiveTrivia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(ActivityActiveTrivia.this, ActivityMatchUp.class);
                startActivity(intent);
            }
        });
        listViewAllCelebrities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }

    private void initComponents() {
        btnActiveTrivia = (Button)findViewById(R.id.buttonActiveTrivia);
        btnAllCelebrities = (Button)findViewById(R.id.buttonAllCelebrities);
        listViewActiveTrivia = (ListView) findViewById(R.id.listViewActiveTrivia);
        listViewAllCelebrities = (ListView) findViewById(R.id.listViewAllCelebrities);
        linearActiveTrivia = (LinearLayout) findViewById(R.id.linearActiveTriviaLayout);
        linearAllCelebrities = (LinearLayout) findViewById(R.id.linearAllCelecbritiesLayout);

        AdapterActiveTrivia adapterActiveTrivia = new AdapterActiveTrivia(this);
        adapterActiveTrivia.notifyDataSetChanged();
        listViewActiveTrivia.setAdapter(adapterActiveTrivia);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.buttonActiveTrivia:
                btnActiveTrivia.setBackgroundResource(R.drawable.tab_active_bg);
                btnAllCelebrities.setBackgroundResource(R.drawable.tab_deactive_bg);
                linearActiveTrivia.setVisibility(View.VISIBLE);
                linearAllCelebrities.setVisibility(View.GONE);
                isActiveTriviaSelected = true;
                break;
            case R.id.buttonAllCelebrities:
                btnActiveTrivia.setBackgroundResource(R.drawable.tab_deactive_bg);
                btnAllCelebrities.setBackgroundResource(R.drawable.tab_active_bg);
                linearActiveTrivia.setVisibility(View.GONE);
                linearAllCelebrities.setVisibility(View.VISIBLE);
                isActiveTriviaSelected = false;
                break;
        }
    }
}
