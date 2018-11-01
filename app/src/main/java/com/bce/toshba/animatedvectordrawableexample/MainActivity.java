package com.bce.toshba.animatedvectordrawableexample;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    Button btn_check;
    ImageView iv_animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_check = (Button) findViewById(R.id.btn_check);
        iv_animation = (ImageView) findViewById(R.id.iv_animation);

        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iv_animation.setImageResource(R.drawable.check_icon_animation); //set animation xml to imageview
                iv_animation.setVisibility(View.VISIBLE); //make it visible
                ((Animatable) iv_animation.getDrawable()).start(); //start animation
            }
        });
    }
}
