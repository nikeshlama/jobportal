package com.nikesh.jobportal.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.nikesh.jobportal.R;

public class JobseekerOrJobprovider extends AppCompatActivity {
    LinearLayout userLinear, developerLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobseeker_or_jobprovider);
        getSupportActionBar().setTitle("Registration selection");
        userLinear= findViewById(R.id.UserLinear);
        developerLinear= findViewById(R.id.DeveloperLinear);

        userLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(JobseekerOrJobprovider.this, RegisterForm.class);
                intent.putExtra("As","JobProvider");
                startActivity(intent);
            }
        });
        developerLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),RegisterForm.class);
                intent.putExtra("As","JobSeeker");
                startActivity(intent);
            }
        });
    }
}