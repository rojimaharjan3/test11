package com.example.onlinebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {
    ImageView img;
    TextView t1,t2 ,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        img=findViewById(R.id.image);
        t1=findViewById(R.id.title);

        t2=findViewById(R.id.author);
        t3=findViewById(R.id.description);
        Intent intent = getIntent();
        String title= intent.getExtras().getString("Title");//yo "Header" chai uta myAdapter ko onbind ma lekheko tyo putExtra ko string name ho
        String author = intent.getExtras().getString("Author");
        String description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Image");

        //setting value
        t1.setText(title);
        t2.setText(author);
        t3.setText(description);
        img.setImageResource(image);

    }

}