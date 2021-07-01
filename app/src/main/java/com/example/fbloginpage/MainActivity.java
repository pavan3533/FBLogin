package com.example.fbloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity3(View view) {
        Intent myintent;
        myintent = new Intent(MainActivity.this,
                register.class);
        startActivity(myintent);
    }
}