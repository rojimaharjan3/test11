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
                startActivity(intent);
            }
        });
        ArrayList<Model> contents = new ArrayList<>();

        Model obj1 =  new Model();
        obj1.setTitle("Meant to Be");
        obj1.setAuthor("Book by Emily Giffin ");
        obj1.setDescription("A restless golden boy and a girl with a troubled past navigate a love story that may be doomed before it even begins");
        obj1.setImg(R.drawable.book1);

        contents.add(obj1);

        Model obj2 = new Model();
        obj2.setTitle("The Book of Living Secrets");
        obj2.setAuthor("Book by Madeleine Roux");
        obj2.setDescription("This story follows two girls who transport themselves into the world of their favorite book only to encounter the sinister alternate reality that awaits them.\n" +
                "\n" +
                "No matter how different best friends Adelle and Connie are, one thing they’ve always had in common is their love of a little-known gothic romance novel called Moira. So when the girls are tempted by a mysterious stranger to enter the world of the book, they hardly suspect it will work. But suddenly they are in the world of Moira, living among characters they’ve obsessed about for years.\n" +
                "\n" +
                "Except…all is not how they remembered it. The world has been turned upside down: The lavish balls and star-crossed love affairs are now interlaced with unspeakable horrors. The girls realize that something dark is lurking behind their foray into fiction—and they will have to rewrite their own arcs if they hope to escape this nightmare with their lives.");
        obj2.setImg(R.drawable.book2);
        contents.add(obj2);

        Model obj3 = new Model();
        obj3.setTitle("Harry Poter and the Chamber of Secrets");
        obj3.setAuthor("Book by J.K Rowling");
        obj3.setDescription("An ancient prophecy seems to be coming true when a mysterious presence begins stalking the corridors of a school of magic and leaving its victims paralyzed.");
        obj3.setImg(R.drawable.book3);
        contents.add(obj3);

        Model obj4 = new Model();
        obj4.setTitle("The Book of Life");
        obj4.setAuthor("Book by Deborah Harkness");
        obj4.setImg(R.drawable.book4);
        contents.add(obj4);

        Model obj5 = new Model();
        obj5.setTitle("Harry Potter and the Cursed Child");
        obj5.setAuthor("J.K Rowling");
        obj5.setImg(R.drawable.harry);
        contents.add(obj5);

        Model obj6 = new Model();
        obj6.setTitle("Rich Dad Poor Dad");
        obj6.setAuthor("Book by Robert T Kiyosaki");
        obj6.setImg(R.drawable.poordad);
        contents.add(obj6);

        Model obj7 = new Model();
        obj7.setTitle("The Book Thief");
        obj7.setAuthor("Markus Zusak");
        obj7.setImg(R.drawable.bookthief);
        contents.add(obj7);

        Model obj8 = new Model();
        obj8.setTitle("It Ends With Us");
        obj8.setAuthor("Book by Collen Hover");
        obj8.setImg(R.drawable.endswithus);
        contents.add(obj8);



        recyclerView = findViewById(R.id.recyclerview);

        adapter = new BookRecyclerAdapter(this , contents); //myAAdapter class maa jani bho ani uta arraylist ko code run huncha
        linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);}
}

