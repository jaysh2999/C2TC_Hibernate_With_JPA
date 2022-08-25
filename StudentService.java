package com.tns.services;


import com.tns.entity.Student;
//services offered

public interface StudentService {
	public abstract void addStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract  Student findstudentById(int id);
	Student findStudentById(int id);
	

}
