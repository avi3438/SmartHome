package com.hbeonlabs.smartguard.smarthome;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.tuya.smart.home.sdk.TuyaHomeSdk;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView smart_socket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        smart_socket=(CardView) findViewById(R.id.cvSocket);
        smart_socket.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.cvSocket: i= new Intent(this,SmartSocket.class);
            startActivity(i);
            break;

        }

    }
}
