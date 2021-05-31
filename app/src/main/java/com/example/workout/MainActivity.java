 package com.example.workout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity implements workoutFragement.Listener {
    public static final String EXTRA_WORKOUT_ID="id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void itemClicked(long id){
        Intent intent=new Intent(this,DetailsActivity.class);
        intent.putExtra(DetailsActivity.EXTRA_WORKOUT_ID,(int)id);
        startActivity(intent);
    }

}