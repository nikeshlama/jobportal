package com.nikesh.jobportal.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.nikesh.jobportal.R;

public class ImageSliderActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_slider);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        button=findViewById(R.id.btnjoin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageSliderActivity.this, LoginForm.class);
                startActivity(intent);

            }
        });

        int imgarray[]= {R.drawable.one, R.drawable.two, R.drawable.three};
        viewFlipper= findViewById(R.id.viewflipper);
        for(int i=0;i<imgarray.length;i++)
            showimage(imgarray[i]);

    }
    public void showimage(int img)
    {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(img);

        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        //viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}