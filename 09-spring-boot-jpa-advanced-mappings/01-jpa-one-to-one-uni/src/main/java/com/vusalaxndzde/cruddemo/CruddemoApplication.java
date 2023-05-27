package com.vusalaxndzde.cruddemo;

import com.vusalaxndzde.cruddemo.dao.AppDAO;
import com.vusalaxndzde.cruddemo.entity.Instructor;
import com.vusalaxndzde.cruddemo.entity.InstructorDetail;
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
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
			createInstructor(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO) {
		Instructor instructor = new Instructor(
				"Vusal1", "Akhundzada1", "vusal@gmail.com");

		InstructorDetail instructorDetail = new InstructorDetail(
				"youtube.com", "football");

		instructor.setInstructorDetail(instructorDetail);
		System.out.println("Saving: " + instructor);
		appDAO.save(instructor);
	}

}
