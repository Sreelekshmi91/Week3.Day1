package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	public void studentName() {

		System.out.println("Student Name = Sreelekshmi S");
	}
	public void studentDept() {

		System.out.println("Student Department = ECE");
	}
	public void studentId() {

		System.out.println("Student Id = 690514");
	}
		
		public static void main(String[] args) {
			College college = new College();
			college.collegeName();
			college.collegeCode();
			college.collegeRank();

			
			Department department = new Department();
			department.collegeName();
			department.collegeCode();
			department.collegeRank();
			department.deptName();

			
			Student student = new Student();
			student.collegeName();
			student.collegeCode();
			student.collegeRank(); 
			student.deptName();
			student.studentName();
			student.studentDept(); 
			student.studentId();
	
}
}