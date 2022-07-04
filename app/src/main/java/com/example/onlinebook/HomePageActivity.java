package com.example.onlinebook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomePageActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    BookRecyclerAdapter adapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        ArrayList<Model> contents = new ArrayList<>();

        Model obj1 =  new Model();
        obj1.setTitle("Android Development");
        obj1.setAuthor("Used to create android application . Android software development is the process by which applications are created for devices running the Android operating system. Google states that[3] \"Android apps can be written using Kotlin, Java, and C++ languages\" using the Android software development kit (SDK), while using other languages is also possible. All non-Java virtual machine (JVM) languages, such as Go, JavaScript, C, C++ or assembly, need the help of JVM language code, that may be supplied by tools, likely with restricted API support. Some programming languages and tools allow cross-platform app support (i.e. for both Android and iOS). Third party tools, development environments, and language support have also continued to evolve and expand since the initial SDK was released in 2008. The official Android app distribution mechanism to end users is Google Play; it also allows staged gradual app release, as well as distribution of pre-release app versions to testers. Android software development is the process by which applications are created for devices running the Android operating system. Google states that[3] \"Android apps can be written using Kotlin, Java, and C++ languages\" using the Android software development kit (SDK), while using other languages is also possible. All non-Java virtual machine (JVM) languages, such as Go, JavaScript, C, C++ or assembly, need the help of JVM language code, that may be supplied by tools, likely with restricted API support. Some programming languages and tools allow cross-platform app support (i.e. for both Android and iOS). Third party tools, development environments, and language support have also continued to evolve and expand since the initial SDK was released in 2008. The official Android app distribution mechanism to end users is Google Play; it also allows staged gradual app release, as well as distribution of pre-release app versions to testers.");
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
        recyclerView.setLayoutManager(linearLayoutManager);
    }

}
