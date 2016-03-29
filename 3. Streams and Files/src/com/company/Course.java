package com.company;

import java.io.Serializable;

public class Course implements Serializable{
    private  String name;
    private Integer numOfStudents;

    Course(String courseName, Integer students){
        name = courseName;
        numOfStudents = students;
    }

    public void print(){
        System.out.println(name + " " + numOfStudents);
    }
}
