package com.springboot.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	//http://localhost:8080/student
	
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Nandar", "Moh Moh Lwin");
	}
	
	//http://localhost:8080/student
	
	@GetMapping("/students")
	public List<Student> getStudents() {

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Su Su", "Lwin"));
		students.add(new Student("Nu Nu", "Lwin"));
		students.add(new Student("Su Su", "Tin"));
		students.add(new Student("Nu Nu", "Tin"));
		students.add(new Student("Pa Pa", "Lwin"));
		
		return students;
	}

}
