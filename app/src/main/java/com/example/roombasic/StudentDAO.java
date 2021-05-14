package com.example.roombasic;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface StudentDAO {
    @Insert
    void addStudent(Student student);
    @Query("Select * From student")
    List<Student> getAllStudents();
    @Delete
    void deleteStudent(int studentID);
}
