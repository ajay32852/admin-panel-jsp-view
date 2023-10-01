
package com.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin/")
public class DashboardController {
    
    @GetMapping("dashboard")
    public ModelAndView index()
    {
        ModelAndView modelAndView = new ModelAndView("layouts/master-layout");
        modelAndView.addObject("pageTitle", "Dashboard"); // Set the dynamic page title
        modelAndView.addObject("contentPage", "admin/dashboard/index"); // Set the content page
        return modelAndView;
    }
    
}
