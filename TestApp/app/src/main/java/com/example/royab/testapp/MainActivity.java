package com.example.royab.testapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstNo = (EditText) findViewById(R.id.firstNo);
        final EditText secondNo = (EditText) findViewById(R.id.secondNo);
        final TextView ansBox = (TextView) findViewById(R.id.ansBox);

        Button signButton = (Button) findViewById(R.id.addButton);
        Button courseButton = (Button) findViewById(R.id.courseButton);

        signButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                double ans = 0.0;
                ans = Double.valueOf(firstNo.getText().toString()) + Double.valueOf(secondNo.getText().toString());

                ansBox.setText(String.valueOf(ans));

            }
        });

        courseButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent myIntent = new Intent(MainActivity.this, VideoActivity.class);
                myIntent.putExtra("key", 1); //Optional parameters
                MainActivity.this.startActivity(myIntent);

            }
        });
    }
}
