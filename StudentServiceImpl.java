package com.tns.services;



import com.tns.dao.StudentDao;
import com.tns.entity.Student;



public abstract class StudentServiceImpl implements StudentService { 
	private StudentDao dao;
    public StudentServiceImpl()
{
    	dao = new StudentDaoImpl();
}
@Override
public void addStudent(Student student) { 
	dao.beginTranscation();
	dao.addStudent(student); 
	dao.commitTranscation();
}

@Override
public void updateStudent(Student student) { 
	dao.beginTranscation();
	dao.updateStudent(student);
	dao.commitTranscation();
}

@Override
public void removeStudent(Student student) {
	dao.beginTranscation(); 
	dao.removeStudent(student);
	dao.commitTranscation();
}

@Override
public Student findStudentById(int id) {
//no need of transaction, as it's an read operation 
	Student student = dao.getStudentById(id);
    return student;
}
}
