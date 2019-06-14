package com.hbeonlabs.smartguard.smarthome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Launcher launcher=new Launcher();
        launcher.start();
    }
    private class Launcher extends Thread{
        public void run()
        {
            try {
                sleep(4000);

            }
            catch (InterruptedException e){

                e.printStackTrace();
            }

            Intent intent=new Intent(SplashScreenActivity.this,MainActivity.class);
            startActivity(intent);
            SplashScreenActivity.this.finish();
        }

    }
}


