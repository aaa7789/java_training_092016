package com.mms.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mms.dto.Student;

@Controller
public class StudentInfoController {
	
	@RequestMapping(value="/studentInfo", method=RequestMethod.GET)
	public ModelAndView getStudetDtls()
	{
		ModelAndView model = new ModelAndView("StudentDetails");
		model.addObject("msg", "Please provide your details for Admisson");
		return model;
	}
	
/*	
	@RequestMapping(value="/enrollmentStatus", method=RequestMethod.POST)
	public ModelAndView  enrollementStatus(@RequestParam(name="studentName") String name,
			                           @RequestParam(name="city") String loc)
	{
		ModelAndView model = new ModelAndView("StudentEnrollment");
		
		Student student = new Student();
		student.setStudentName(name);
		student.setCity(loc);
		model.addObject("student1", student);
		
		model.addObject("msg", "Enrollment success for studetn:  " + name +
	            " and you are from location " + loc);
		return model;
		
	}*/
	
	
	@RequestMapping(value="/enrollmentStatus/{user}/{location}", method=RequestMethod.GET)
	public ModelAndView  enrollementByRequestParam( @PathVariable(name="user") String name, 
			@PathVariable(name="location") String loc)
	{
		ModelAndView model = new ModelAndView("StudentEnrollment");
		model.addObject("msg", "enrollment success for " + name + " and you are from "  + loc);
		return model;
		
	}
	
	@RequestMapping(value="/enrollmentStatus", method=RequestMethod.POST)
	public ModelAndView  enrollementStatusByModelAttribut(@ModelAttribute(name="student1") Student student)
	{
		ModelAndView model = new ModelAndView("StudentEnrollment");
		model.addObject("msg", "Enrollment success for studetn");
		return model;
		
	}
	
	
	
/*	@RequestMapping(value="/enrollmentStatus/{user}/{city}/{state}", method=RequestMethod.GET)
	public ModelAndView  enrollementByPathParam( @PathVariable Map input)
	{
		String name = (String) input.get("user");
		String city = (String) input.get("city");
		String state = (String) input.get("state");
		ModelAndView model = new ModelAndView("StudentEnrollment");
		model.addObject("msg", "enrollment success for " + name + " and you are from "  + city + "and you are from state " + state);
		return model;
		
	}
	*/


}
