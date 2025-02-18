package com.learn.HibernateAndJPA.HibernateAndJPA.course.coursejdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.learn.HibernateAndJPA.HibernateAndJPA.Courseclass.Course;
@Repository
public class CourseJdbcRepository {
	@Autowired
   private JdbcTemplate springjdbctemplate;
   private static String INSERT_QUERY = """
   		insert into course(id,Course_name,author) values (?,?,?);
   		""";
   
   private static String DELETE_QUERY = """
   		delete from Course where id = ?;
   		""";
   
   private static String SELECT_QUERY = """
	   		select * from Course where id = ?;
	   		""";
   
   public void insert(Course course) {
	   springjdbctemplate.update(INSERT_QUERY,course.getId(),course.getCourse_name(),course.getAuthor());
   }
   
   public void delete(long id) {
	   springjdbctemplate.update(DELETE_QUERY,id);
   }
   
   public Course findById(long id) {
	   return springjdbctemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class),id);
   }
}
