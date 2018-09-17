package com.java.SpringProject.PatientController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PatientController {
	//This is the first page to be viewed which is handled by Controller methods
	 @RequestMapping("/")  
	    public ModelAndView welcome() {  
		 ModelAndView mv=new ModelAndView();
		 mv.setViewName("welcome");
		 return mv;
		}
	 
	 @RequestMapping("/home")  
	    public ModelAndView home() {  
	     ModelAndView mv= new ModelAndView(); 
	     mv.setViewName("home");
		 return mv;
		} 
}
