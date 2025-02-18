package com.learn.HibernateAndJPA.HibernateAndJPA.Courseclass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	private long id;
	private String course_name;
	private String author;
	
	public Course() {
		
	}

	public Course(long id, String course_name, String author) {
		super();
		this.id = id;
		this.course_name = course_name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", course_name=" + course_name + ", author=" + author + "]";
	}
	
	
	
}
