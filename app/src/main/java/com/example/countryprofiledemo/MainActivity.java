package com.example.countryprofiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladeshButton, indiaButton, pakistanButton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bangladeshButton = findViewById(R.id.bangladeshButtonId);
        indiaButton = findViewById(R.id.indiaButtonId);
        pakistanButton = findViewById(R.id.pakistanButtonId);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bangladeshButtonId){
            intent = new Intent(MainActivity.this,ProfileActivity2.class);
            intent.putExtra("name","bangladesh");
            startActivity(intent);
        }
        if (v.getId()==R.id.indiaButtonId){
            intent = new Intent(MainActivity.this,ProfileActivity2.class);
            intent.putExtra("name","india");
            startActivity(intent);
        }
        if (v.getId()==R.id.pakistanButtonId){
            intent = new Intent(MainActivity.this,ProfileActivity2.class);
            intent.putExtra("name","pakistan");
            startActivity(intent);
        }

    }
}