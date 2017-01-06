package com.mms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentInfoController 
{
	
	@RequestMapping(value="/studentInfo")
	public ModelAndView getStudentInfo()
	{
		
		ModelAndView model = new ModelAndView("studentInfoForm");
		model.addObject("msg", "hi this is from StudentInfoController");
		
		return model;
	}
	
	

}
