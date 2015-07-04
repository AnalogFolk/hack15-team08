package com.example.zack.analosafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity22Activity extends ActionBarActivity {

    Button gototabss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity22);

        gototabss = (Button)findViewById(R.id.gofinal);
        gototabss.setOnClickListener(listenergetstartss);
    }


    View.OnClickListener listenergetstartss = new View.OnClickListener() {

        public void onClick(View v) {
            Intent myIntent = new Intent();
            myIntent.setClass(MainActivity22Activity.this, MainActivity23Activity.class);
            startActivity(myIntent);
        }

    };

}
