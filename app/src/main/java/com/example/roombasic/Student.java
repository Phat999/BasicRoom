package com.example.roombasic;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import kotlin.experimental.ExperimentalTypeInference;

@Entity(tableName = "person")
public class Student {
    @PrimaryKey(autoGenerate = true)
    private int studentID;
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                '}';
    }
}
