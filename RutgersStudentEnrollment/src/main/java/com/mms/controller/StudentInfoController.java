package com.mms.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	
	@InitBinder
	public void dataBinder(WebDataBinder binder)
	{
	  SimpleDateFormat format = new SimpleDateFormat("MM*dd*yyyy");
	  binder.registerCustomEditor(Date.class, "submissionDate", new CustomDateEditor(format, false));
	  binder.registerCustomEditor(String.class, "city", new CityNameCustomEditor());
		
		
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
	public ModelAndView  enrollementStatusByModelAttribut(@Valid @ModelAttribute(name="student1") Student student, BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView model = new ModelAndView("StudentDetails");
			return model;
		}
		ModelAndView model = new ModelAndView("StudentEnrollment");
		model.addObject("msg", "Enrollment success for studetn");
		return model;
		
	}
	
	
/*	
	@RequestMapping(value="/enrollmentStatus/{user}/{city}/{state}", method=RequestMethod.GET)
	public ModelAndView  enrollementByPathParam( @PathVariable Map<String, String> input)
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
