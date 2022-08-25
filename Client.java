package com.tns.client;




import com.tns.entity.Student;
import com.tns.services.StudentService;
import com.tns.services.StudentServiceImpl;



public class Client 
{
public static void main(String[] args) {

//Debug this program as Debug -> Debug as Java Application

StudentService service = new StudentServiceImpl();
Student student = new Student();

       // Create Operation 
student.setStudentId(9); 
student.setName("Rutuja"); 
service.addStudent(student);

//at this breakpoint, we have added one record to table
       // Retrieve Operation
student = service.findStudentById(9); 
System.out.print("ID:"+student.getStudentID());
System.out.println(" Name:"+student.getName());
 
     // Update Operation
student = service.findStudentById(9);
student.setName("Rutuja Malik");
service.updateStudent(student);

//at this breakpoint, record is removed from table
        // Delete Operation
student = service.findStudentById(5);
service.removeStudent(student);
System.out.println("End of program/Life cycle completed...");
}
}