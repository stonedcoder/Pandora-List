package com.codingblocks_projects.vraun.pandora_list;

/**
 * Created by vraun on 13-06-2017.
 */

/**
 * {@link Course} represents a single course release.
 * Each object has 2 properties: students_name, course_name .
 */
public class Course {

    private String course_name , students_name ;

    public Course(String course_name, String students_name) {
        this.course_name = course_name;
        this.students_name = students_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public String getStudents_name() {
        return students_name;
    }
}
