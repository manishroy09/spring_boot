package com.manish;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TestController {
@RequestMapping("/p1")
  public void hi() {
	System.out.println("Hi.. method called using spring boot");
}


//will goto browser and write the below line
// http://localhost:8080/p1
@RequestMapping("/p2")
@ResponseBody
    public String hello() {
    	return "Hello using spring boot";
    }

@RequestMapping("/p3")
@ResponseBody
   public String getName(HttpServletRequest request) {
	   return "welcome " +request.getParameter("name");
   }
   
   
   @RequestMapping("/index")
   public String openIndex() {
	   return "index";
   }
   
   
   @RequestMapping("/p4")
   @ResponseBody
   public void name() {
	   System.out.println("name method is called");
   }
   
  
}


