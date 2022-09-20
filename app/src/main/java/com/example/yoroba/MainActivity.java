package com.example.yoroba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView numberView;
    TextView familyView;
    TextView colourView;
    TextView phrasesView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberView = findViewById(R.id.numbers);
        familyView = findViewById(R.id.family);
        colourView = findViewById(R.id.colors);
        phrasesView = findViewById(R.id.phrases);


        //these are Click listeners
        numberView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(intent);
            }
        });

        //these are Click listeners
        familyView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(intent);
            }
        });
        //these are Click listeners
        colourView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColourActivity.class);
                startActivity(intent);
            }
        });
        //these are Click listeners
        phrasesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(intent);
            }
        });
    }
}