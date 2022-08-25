//Entity class

package com.tns.entity;
import java.io.Serializable;
import javax.persistence.*;
//INFORMING TO THE PROGRAM ABOUT THE DATABASE TABLE
@Entity
@Table(name="student")
public class Student implements Serializable
{
	private static final long serialVersionUID=1L;

	@Id
	private int StudentID;
	
	private String name;
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentId(int studentID) {
		this.StudentID=StudentID;
	}
	public String getName() 
	{
		return getName();
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + StudentID + ", name =" + name + "]";
	}

}
