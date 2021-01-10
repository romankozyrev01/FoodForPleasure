package com.example.foodforpleasure;

import Services.ActivityService;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class UserTargetActivity extends AppCompatActivity {
    ActivityService activityService = new ActivityService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
    }

    public void submitLoseWeight(View view){
        activityService.startMainActivity(this);
    }
}