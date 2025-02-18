package com.learn.HibernateAndJPA.HibernateAndJPA.course.coursejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.HibernateAndJPA.HibernateAndJPA.Courseclass.Course;
@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJdbcRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.insert(new Course(1,"AWS","in28Minutes"));
		repo.insert(new Course(2,"Azure","in28Minutes"));
		repo.insert(new Course(3,"Devops","in28Minutes"));
		repo.delete(1);
		System.out.println(repo.findById(2));
		System.out.println(repo.findById(3));

		

	}

}
