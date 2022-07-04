package com.example.onlinebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {
    Button loginbutton , signbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        loginbutton = findViewById(R.id.button_login);
        signbutton = findViewById(R.id.button_signup);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this , MainActivity.class );
                startActivity(intent);
            }
        });

        signbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(SignUpActivity.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}