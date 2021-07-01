package com.example.fbloginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText Firstnmtextview;

    public void showtoast(View view){
        if (Firstnmtextview.getText().toString() == null) {
            Toast.makeText(this, "Enter your First Name", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Your First Name is: " + Firstnmtextview.getText().toString(), Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Firstnmtextview = (EditText) findViewById(R.id.Firstnmtextview);
    }
}