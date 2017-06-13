package com.codingblocks_projects.vraun.pandora_list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Course> CbCourses = new ArrayList<Course>();
        CbCourses.add(new Course("Pandora" , "A"));
        CbCourses.add(new Course("elixr" , "B"));
        CbCourses.add(new Course("launchpad" , "C"));
        CbCourses.add(new Course("algo++" , "D"));
        CbCourses.add(new Course("perceptron" , "E"));
        CbCourses.add(new Course("Pandora" , "A"));
        CbCourses.add(new Course("elixr" , "B"));
        CbCourses.add(new Course("launchpad" , "C"));
        CbCourses.add(new Course("algo++" , "D"));
        CbCourses.add(new Course("perceptron" , "E"));
        CbCourses.add(new Course("Pandora" , "A"));
        CbCourses.add(new Course("elixr" , "B"));
        CbCourses.add(new Course("launchpad" , "C"));
        CbCourses.add(new Course("algo++" , "D"));
        CbCourses.add(new Course("perceptron" , "E"));
        CbCourses.add(new Course("Pandora" , "A"));
        CbCourses.add(new Course("elixr" , "B"));
        CbCourses.add(new Course("launchpad" , "C"));
        CbCourses.add(new Course("algo++" , "D"));
        CbCourses.add(new Course("perceptron" , "E"));
        CbCourses.add(new Course("Pandora" , "A"));
        CbCourses.add(new Course("elixr" , "B"));
        CbCourses.add(new Course("launchpad" , "C"));
        CbCourses.add(new Course("algo++" , "D"));
        CbCourses.add(new Course("perceptron" , "E"));

        // Create an {@link CourseAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        CourseAdapter adapter = new CourseAdapter(this, CbCourses);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

    }

}
