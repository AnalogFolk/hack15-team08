package com.example.zack.analosafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity23Activity extends ActionBarActivity {
    Button gototabss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity23);
        gototabss = (Button)findViewById(R.id.gofinalddd);
        gototabss.setOnClickListener(listenergetstartss);
    }

    View.OnClickListener listenergetstartss = new View.OnClickListener() {

        public void onClick(View v) {
            Intent myIntent = new Intent();
            myIntent.setClass(MainActivity23Activity.this, MainActivity24Activity.class);
            startActivity(myIntent);
        }

    };

}
