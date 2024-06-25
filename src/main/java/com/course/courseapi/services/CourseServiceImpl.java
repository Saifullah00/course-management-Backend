package com.course.courseapi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.courseapi.dao.CourseDao;
import com.course.courseapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
//	List<Course> list;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145,"Java Core", "This is in depth course on java"));
//		list.add(new Course(146,"Spring Java ", "This is in depth course on Spring java"));
		
	}
	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}
	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for(Course course: list) {
//			if(course.getId()== courseId) {
//				c=course;
//				break;
//			}
//		}
		return courseDao.getOne(courseId);
	}
	
	
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	
	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e->{
//			if(e.getId()==course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long long1) {
//		list = this.list.stream().filter(e->e.getId()!=long1).collect(Collectors.toList());
		@SuppressWarnings("deprecation")
		Course entity = courseDao.getOne(long1);
		courseDao.delete(entity);
	}

}
