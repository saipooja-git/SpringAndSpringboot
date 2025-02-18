package com.learn.HibernateAndJPA.HibernateAndJPA.course.coursespringdatajparepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.HibernateAndJPA.HibernateAndJPA.Courseclass.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {
    List<Course> findByCourseName(String courseName); // 'name' must be a field in Course entity
}

