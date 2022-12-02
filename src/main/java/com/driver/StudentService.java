package com.driver;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public void addStudent(Student student){

    }

    public void addTeacher(Teacher teacher){

    }

    public void createStudentTeacherPair(String student, String teacher){

    }

    public Student findStudent(String studentName){
        Student student1 = null; //find the student based on given parameter

        return student1;
    }

    public Teacher findTeacher(String teacherName){
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
