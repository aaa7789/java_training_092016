package com.mms.jpa.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;

	public void addCourse(Course course) {
		courseRepository.save(course);

	}

	public List<Course> getAllCourses() {
		/*List<Course> resultList = new ArrayList<Course>();
		Iterable<Course> courseList = courseRepository.findAll();
		for (Course currCourse : courseList) {
			resultList.add(currCourse);
		}

		return resultList;*/
		List<Course> coursesList = new ArrayList<Course>();
		courseRepository.findAll().forEach(coursesList :: add);
		return coursesList;

	}

}
