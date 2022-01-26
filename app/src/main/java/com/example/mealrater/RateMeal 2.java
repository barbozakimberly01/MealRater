package com.example.mealrater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RateMeal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_meal);
        saveButton ();
    }

    public void saveButton (){
        Button saveButton = findViewById(R.id.buttonSave);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText dishName = findViewById(R.id.editDish);
                TextView textDish = findViewById(R.id.dishRate);
                String dishToDisplay = dishName.getText().toString();

                textDish.setText(dishToDisplay);

            }
        });
    }
}