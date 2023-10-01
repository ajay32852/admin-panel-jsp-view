
package com.application.controller;

import com.application.request.LoginRequest;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin/")
public class LoginController {
    
    @GetMapping("login")
    public ModelAndView login()
    {
       ModelAndView modelAndView=new ModelAndView();
       modelAndView.addObject("loginRequest",new LoginRequest());
       modelAndView.addObject("pageTitle","Login");
       modelAndView.setViewName("auth/login");
       return modelAndView;
    }
    
    @PostMapping("login")
    public ModelAndView loginAuth()
    {
        System.out.println("DAAA");
        
       ModelAndView modelAndView=new ModelAndView();
       
//       if(request.hashCode())
//       {
//          modelAndView.setViewName("auth/login");
//       }else{
//           modelAndView.setViewName("redirect:/dashboard");
//       }
//        modelAndView.addObject("loginRequest", request);
//        
//        modelAndView.setViewName("auth/login");
        return modelAndView;     
    }
    
    @GetMapping("/hello")
    public void  Hello()
    {
        System.out.println("Hello Java app");
    }
    
     
    
}
