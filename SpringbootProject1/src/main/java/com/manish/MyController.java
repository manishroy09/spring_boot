package com.manish;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
     @RequestMapping("/home")
     public String openHome(Model m) {
    	 User u = new User();
    	 u.setName("Manish kumar");
    	 u.setAge(21);
    	 m.addAttribute("user", u);
    	 return "home";
     }
     @RequestMapping("/save")
	public String openHome(@ModelAttribute User user, Model m) {
    	 m.addAttribute("msg", "welcome : " +user.getName() );
    	 m.addAttribute("age", "Your Age is  : " +user.getAge() );
		return "s";
	}
}
