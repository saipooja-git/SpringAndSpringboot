package com.learn.HibernateAndJPA.HibernateAndJPA.course.coursejpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.HibernateAndJPA.HibernateAndJPA.Courseclass.Course;
import com.learn.HibernateAndJPA.HibernateAndJPA.course.coursespringdatajparepository.CourseSpringDataJPARepository;
@Component
public class CourseJPACommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseSpringDataJPARepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repo.save(new Course(1,"AWS now","in28Minutes"));
		repo.save(new Course(2,"Azure now","in28Minutes"));
		repo.save(new Course(3,"Devops now","in28Minutes"));
		repo.deleteById(1l); // since we have wrote as type long in coursespringdataJPARepository class
		System.out.println(repo.findById(2l));
		System.out.println(repo.findById(3l));
		System.out.println(repo.findByCourseName("AWS now"));


		

	}

}
//
//only by using jpa 
//package com.learn.HibernateAndJPA.HibernateAndJPA.course.coursejpa;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import com.learn.HibernateAndJPA.HibernateAndJPA.Courseclass.Course;
//@Component
//public class CourseJPACommandLineRunner implements CommandLineRunner{
//
//	@Autowired
//	private CourseJPARepository repo;
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		repo.insert(new Course(1,"AWS now","in28Minutes"));
//		repo.insert(new Course(2,"Azure now","in28Minutes"));
//		repo.insert(new Course(3,"Devops now","in28Minutes"));
//		repo.deleteById(1);
//		System.out.println(repo.findById(2));
//		System.out.println(repo.findById(3));
//
//		
//
//	}

//}
