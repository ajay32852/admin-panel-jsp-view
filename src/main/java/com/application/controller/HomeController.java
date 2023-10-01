
package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {
    
  @GetMapping("")  
  public ModelAndView index()
  {
      
        System.out.println("Home page runnning");
        ModelAndView modelAndView = new ModelAndView("layouts/master-layout");
        modelAndView.addObject("pageTitle", "Home"); // Set the dynamic page title
        // Add data to the model
        
        modelAndView.addObject("contentPage", "admin/post/index"); // Set the content page
      
        return modelAndView;
        
      
      
      
  }
  
  
  
    
    
    
    
    
}
