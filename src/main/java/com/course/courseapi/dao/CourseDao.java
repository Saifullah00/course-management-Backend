package com.course.courseapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.courseapi.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long>{
	
}
