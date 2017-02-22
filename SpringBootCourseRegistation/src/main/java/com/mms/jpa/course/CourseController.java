package com.mms.jpa.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;

	
	@RequestMapping(value="/course", method= RequestMethod.POST)
	public void addCourse(@RequestBody Course course)
	{
		courseService.addCourse(course);
		
	}
	
	@RequestMapping(value="/course", method=RequestMethod.GET)
	public List<Course> getAllCourses()
	{
		
		return courseService.getAllCourses();
		 
		 
	}
}
