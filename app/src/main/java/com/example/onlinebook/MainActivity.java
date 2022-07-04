package com.example.onlinebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    BookRecyclerAdapter adapter;
    LinearLayoutManager linearLayoutManager;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.menu);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , MenuActivity.class);
            }
        });
        ArrayList<Model> contents = new ArrayList<>();

        Model obj1 =  new Model();
        obj1.setTitle("Android Development");
        obj1.setAuthor("Used to create android application ");
        obj1.setImg(R.drawable.book1);

        contents.add(obj1);

        Model obj2 = new Model();
        obj2.setTitle("Python");
        obj2.setAuthor("Used on a server to create web applications.");
        obj2.setImg(R.drawable.book2);
        contents.add(obj2);

        Model obj3 = new Model();
        obj3.setTitle("ReactJs");
        obj3.setAuthor("Used on a server to create web applications.");
        obj3.setImg(R.drawable.book3);
        contents.add(obj3);

        Model obj4 = new Model();
        obj4.setTitle("NodeJs");
        obj4.setAuthor("Used on a server to create web applications.");
        obj4.setImg(R.drawable.book4);
        contents.add(obj4);

        Model obj5 = new Model();
        obj5.setTitle("UI/UX");
        obj5.setAuthor("Designing.");
        obj5.setImg(R.drawable.harry);
        contents.add(obj5);

        Model obj6 = new Model();
        obj6.setTitle("Python");
        obj6.setAuthor("Used on a server to create web applications.");
        obj6.setImg(R.drawable.poordad);
        contents.add(obj6);

        Model obj7 = new Model();
        obj7.setTitle("NodeJs");
        obj7.setAuthor("Used on a server to create web applications.");
        obj7.setImg(R.drawable.bookthief);
        contents.add(obj7);

        Model obj8 = new Model();
        obj8.setTitle("ReactJs");
        obj8.setAuthor("Used on a server to create web applications.");
        obj8.setImg(R.drawable.endswithus);
        contents.add(obj8);



        recyclerView = findViewById(R.id.recyclerview);

        adapter = new BookRecyclerAdapter(this , contents); //myAAdapter class maa jani bho ani uta arraylist ko code run huncha
        linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);}
}

