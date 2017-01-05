package com.mms.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView model = new ModelAndView("welcome2");
		model.addObject("message", "loging successful");
		
		return model;
	}

}
