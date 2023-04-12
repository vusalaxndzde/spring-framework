package com.vusalaxndzde.cruddemo;

import com.vusalaxndzde.cruddemo.dao.StudentDAO;
import com.vusalaxndzde.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Vusal", "Akhundzada", "vusal@gmail.com");

		System.out.println("Saving student...");
		studentDAO.save(tempStudent);

		System.out.println("Display generated id: " + tempStudent.getId());
	}

}
