package com.example.mealrater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRateMealButton();
        didFinishMealRate();
    }

    public void initRateMealButton(){
        Button rateMealButton = findViewById(R.id.buttonRateMeal);
        rateMealButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Rating.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });


    }

    public void initSaveButton(){
        Button saveRating = findViewById(R.id.SaveButton);
        saveRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    @Override
    public void didFinishMealRate (RatingBar selectRate){
        TextView mealRate = findViewById(R.id.textView2);
        mealRate.setText(selectRate);
    }


    }
