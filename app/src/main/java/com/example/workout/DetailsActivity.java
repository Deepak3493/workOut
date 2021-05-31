package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DetailsActivity extends AppCompatActivity {
    public static final String EXTRA_WORKOUT_ID="id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        // call the workoout and make fragment interact with the activity
       WorkoutDetialsFragment fragment= (WorkoutDetialsFragment)getSupportFragmentManager().findFragmentById(R.id.frag);
       fragment.setWorkoutId(1);
    }

}