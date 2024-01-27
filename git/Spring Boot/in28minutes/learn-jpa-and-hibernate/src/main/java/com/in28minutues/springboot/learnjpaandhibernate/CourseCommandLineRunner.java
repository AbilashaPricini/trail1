package com.in28minutues.springboot.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutues.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutues.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
	/*
	 * @Autowired private CourseJdbcRepository courseJdbcRepository;
	 */
	
	/*
	 * @Autowired private CourseJpaRepository coursejpaRepositor;
	 */
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS Jpa!", "in28minutes"));
		repository.save(new Course(2, "Learn Azure Jpa!", "in28minutes"));
		repository.save(new Course(3, "Learn Devops Jpa!", "in28minutes"));
		
		repository.deleteById(2l);
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println(repository.findByName("Learn Devops Jpa!"));
	}

}
