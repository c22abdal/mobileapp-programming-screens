package com.example.screens;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView msg = (TextView) findViewById(R.id.text);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("Name");
            msg.setText("Hello: " + name);
        }
    }
}
