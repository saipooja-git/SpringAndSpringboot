package com.learn.HibernateAndJPA.HibernateAndJPA.course.coursejpa;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.learn.HibernateAndJPA.HibernateAndJPA.Courseclass.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
public class CourseJPARepository {
//	@Autowired
	@PersistenceContext
   private EntityManager entityManager;
	@Transactional
	public void insert(Course course) {
		entityManager.merge(course);
	}
   @Transactional
   public void deleteById(long id) {
	   Course course= entityManager.find(Course.class,id);
	   if (course != null) {
	        entityManager.remove(course);
	    }
	   
   }
   
   public Course findById(long id) {
	   return entityManager.find(Course.class, id);
   }
}
