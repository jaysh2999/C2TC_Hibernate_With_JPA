package com.tns.dao;

import com.tns.entity.Student;

public abstract class StudentDao {
	public abstract Student getStudentById(int id);//find
	public abstract void addStudent(Student student);//insert
	public abstract void removeStudent(Student student);//delete
	public abstract void updateStudent(Student student);//update
	public abstract void commitTranscation();
	public abstract void beginTranscation();

}
