package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication.customview.WrapperPeriodicElement;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WrapperPeriodicElement copper = findViewById(R.id.element_copper);
        copper.setTextTop("29");

        copper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, copper.getTextBottom(), Toast.LENGTH_LONG).show();
            }
        });

        final WrapperPeriodicElement sodium = findViewById(R.id.element_sodium);
        sodium.setTextTop("11");
        sodium.setTextMiddle("Na");
        sodium.setTextBottom("Sodium");

        sodium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, sodium.getTextBottom(), Toast.LENGTH_LONG).show();
            }
        });

    }
}