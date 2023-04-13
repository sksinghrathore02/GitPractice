package com.cjc.service;

import com.cjc.model.Student;

public interface StudentService 
{
public Student savedata(Student s);
public Iterable<Student> getdata();
public void updatedata(Student s);
public Iterable<Student> deletedata(int id);
}
