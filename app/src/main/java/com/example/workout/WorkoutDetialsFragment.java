 package com.example.workout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class WorkoutDetialsFragment extends Fragment {
    public long workoutId;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_detials, container, false);
    }
    public void setWorkoutId(int i) {
        this.workoutId=i;
    }

    @Override
    public void onStart() {
        super.onStart();
        View view=getView();
        if(view!=null){
            TextView Title=view.findViewById(R.id.textTitle);
            Workout workout=Workout.workout[(int)workoutId];
            Title.setText(workout.getName());
            TextView details=view.findViewById(R.id.Details);
            details.setText(workout.getDescription());
        }
    }
}