package com.mms.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mms.course.dto.Course;

@Service
public class CourseService {
	
	private List<Course> coureList = new ArrayList<Course>(
			  Arrays.asList(new Course("computer","computer science", "4 years course"),
					  new Course("chemistry","chemistry science", "3 years course"),
					  new Course("bilogy","medical science", "6 years course")));
	

	public List<Course> getCourseDetails() {
		
		return coureList;
	}
	


}
