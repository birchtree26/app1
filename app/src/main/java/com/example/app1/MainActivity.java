package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SplashScreen;

public class MainActivity extends AppCompatActivity {

    private ImageView phos;
    private TextView Title;
    Animation img,txtfl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         phos=findViewById(R.id.logo);
         Title=findViewById(R.id.Title)

         img= AnimationUtils.loadAnimation(context this,R.anim.img);
         txtfl= AnimationUtils.loadAnimation(context this,R.anim.textfl);

         phos.setAnimation(img);
         Title.setAnimation(txtfl);

         int SPLASH_SCREEN =4300;
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent intent = new Intent(packageContext:MainActivity.this,LoginActivity.class);
                 startActivity(intent);
                 finish();
             }
         },SPLASH_SCREEN)
    }
}