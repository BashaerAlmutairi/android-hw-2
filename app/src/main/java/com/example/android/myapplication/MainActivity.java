package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);



        Student s1 = new Student ("Yousef", 14 , 12 , R.drawable.boy1);
        Student s2 = new Student ("Salman", 13 , 10 , R.drawable.boy1);
        Student s3 = new Student ("Majed", 15 , 11 , R.drawable.boy1);


        ArrayList<Student> students = new ArrayList<>();
        students.add(s1); // add item to ArrayList
        students.add(s2); // add item to ArrayList
        students.add(s3); // add item to ArrayList



        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}