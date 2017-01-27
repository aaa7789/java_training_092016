package com.mms.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.course.dto.Course;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/courses")
	public List<Course> getCourseDetails()
	{
		
		return courseService.getCourseDetails();
		
	}

}
