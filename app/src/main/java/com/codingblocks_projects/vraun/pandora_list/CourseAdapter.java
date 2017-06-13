package com.codingblocks_projects.vraun.pandora_list;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vraun on 13-06-2017.
 */

public class CourseAdapter extends ArrayAdapter<Course> {

    private static final String LOG_TAG = CourseAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param Cbcourses A List of Cbcourses objects to display in a list
     */

    public CourseAdapter(Activity context , ArrayList<Course> Cbcourses) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Cbcourses);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);

        if(listItemView == null) {
            if(getViewTypeCount(position) == 0){
                convertView = listItemView.inflate(R.layout.list_item , null);
            }else{
                convertView = listItemView.inflate(R.layout.list_item_right , null);
            }

        }

        // Get the {@link Course} object located at this position in the list
        Course currentCourse = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView courseNameTV = (TextView) listItemView.findViewById(R.id.courseName);
        // Get the version name from the current Course object and
        // set this text on the name TextView
        courseNameTV.setText(currentCourse.getCourse_name());

        // Find the TextView in the list_item layout with the ID version_number
        TextView studentsNameTV = (TextView) listItemView.findViewById(R.id.studentsName);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        studentsNameTV.setText(currentCourse.getStudents_name());


        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

    @Override
    public int getItemViewType(int position) {
        if (){

        }
        return 1;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }
}
