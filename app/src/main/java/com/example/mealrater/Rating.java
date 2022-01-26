package com.example.mealrater;

import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.Button;

public class Rating extends DialogFragment {
    RatingBar selectRate;

    public interface SaveRating {
        void didFinishMealRate(RatingBar selectRate);

    }

    public Rating() {
        //
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.rating, container);
        getDialog().setTitle("Choose Rate");
        selectRate = RatingBar


    }


    Button saveButton = view.findViewById(R.id.SaveButton);
       saveButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            saveItem(selectRate);
        }
    });





}
