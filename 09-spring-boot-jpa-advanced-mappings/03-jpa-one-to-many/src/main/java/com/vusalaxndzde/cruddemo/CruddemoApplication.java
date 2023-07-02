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
//			createInstructor(appDAO);

//			findInstructor(appDAO);

//			deleteInstructor(appDAO);

//			findInstructorDetail(appDAO);

			deleteInstructorDetail(appDAO);
		};
	}

	private void deleteInstructorDetail(AppDAO appDAO) {
		int id = 3;
		appDAO.deleteInstructorDetailById(id);
		System.out.println("Done!");
	}

	private void findInstructorDetail(AppDAO appDAO) {
		int id = 2;
		InstructorDetail instructorDetail = appDAO.findInstructorDetailById(2);
		System.out.println(instructorDetail);
		System.out.println(instructorDetail.getInstructor());
	}

	private void deleteInstructor(AppDAO appDAO) {
		int id = 1;

		System.out.println("Deleting instructor id: " + id);
		appDAO.deleteInstructorById(id);
		System.out.println("Done!");
	}

	private void findInstructor(AppDAO appDAO) {
		int id = 2;

		System.out.println("Finding instructor id: " + id);
		Instructor instructor = appDAO.findInstructorById(id);

		System.out.println("Instructor: " + instructor);
		System.out.println("Instructor detail: " + instructor.getInstructorDetail());
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
