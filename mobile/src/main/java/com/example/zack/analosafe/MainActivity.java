package com.example.zack.analosafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    Button gototabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gototabs = (Button)findViewById(R.id.getstarted);
        gototabs.setOnClickListener(listenergetstart);
    }

    View.OnClickListener listenergetstart = new View.OnClickListener() {
        public void onClick(View v) {
            Intent myIntent = new Intent();
            myIntent.setClass(MainActivity.this, MainActivity22Activity.class);
            startActivity(myIntent);
        }
    };

}
