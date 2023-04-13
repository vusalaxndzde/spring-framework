package com.vusalaxndzde.cruddemo;

import com.vusalaxndzde.cruddemo.dao.StudentDAO;
import com.vusalaxndzde.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
//			createMultipleStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentLastName(studentDAO);
//			updateStudent(studentDAO);
			deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int id = 3;
		System.out.println("Deleting student id: " + id);
		studentDAO.delete(id);
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student student = studentDAO.findById(studentId);

		student.setFirstName("Vusal");
		studentDAO.update(student);
		System.out.println("Updated student: " + student);
	}

	private void queryForStudentLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastName("Akhundzada4");
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("id = 1 Student: " + studentDAO.findById(1));
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating 3 new student objects...");
		Student tempStudent1 = new Student("Vusal1", "Akhundzada1", "vusal@gmail.com");
		Student tempStudent2 = new Student("Vusal2", "Akhundzada2", "vusal@gmail.com");
		Student tempStudent3 = new Student("Vusal3", "Akhundzada4", "vusal@gmail.com");

		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Vusal", "Akhundzada", "vusal@gmail.com");

		System.out.println("Saving student...");
		studentDAO.save(tempStudent);

		System.out.println("Display generated id: " + tempStudent.getId());
	}

}
