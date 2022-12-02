package com.driver;

import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public StudentRepository(){

    }

    public void saveStudent(Student student){

    }

    public void saveTeacher(Teacher teacher){

    }

    public void saveStudentTeacherPair(String student, String teacher){

    }

    public Student findStudent(String student){
        Student student1 = null; //find the student based on given parameter

        return student1;
    }

    public Teacher findTeacher(String teacher){
        Teacher teacher1 = null; //find the teacher based on given parameter

        return teacher1;
    }

    public List<String> findStudentsFromTeacher(String teacher){
        List<String> studentList = null; //find student list based on given parameter

        return studentList;
    }

    public List<String> findAllStudents(){
        List<String> studentList = null; //find student list based on given parameter

        return studentList;
    }

    public void deleteTeacher(String teacher){

    }

    public void deleteAllTeachers(){

    }
}