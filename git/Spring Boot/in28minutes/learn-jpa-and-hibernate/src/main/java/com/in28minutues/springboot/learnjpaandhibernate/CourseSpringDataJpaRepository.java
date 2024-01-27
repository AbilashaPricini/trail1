package com.in28minutues.springboot.learnjpaandhibernate;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;

@Repository
public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
	
	
	
	List<Course> findByAuthor(String author);
	
	Course findByName(String name);
	
	/*
	 * default String findByName(String name) { Course course = new Course(); String
	 * author = ""; if(course.getName().equals(name)) { author = course.getAuthor();
	 * } return author; }
	 */
	

}
