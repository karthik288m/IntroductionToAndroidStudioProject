package com.hello.world;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    TextView myName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myName = findViewById(R.id.tv_myName);
        myName.setText(R.string.app_name);

        myName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // do what ever you want

                myName.setTextColor(getResources().getColor(R.color.teal_200));
            }
        });







    }
}