package com.mms.course;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="/courses", method= RequestMethod.POST)
	public void saveCourse(@RequestBody Course course)
	{
		courseService.saveCourse(course);
		
	}
	
	@RequestMapping(value="/courses/{id}", method= RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course, @PathVariable(name="id") String id)
	{
		courseService.updateCourse(course, id);
		
	}

}
