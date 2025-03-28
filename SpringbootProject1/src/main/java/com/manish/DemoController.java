package com.manish;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class DemoController {

	@RequestMapping("/p5")
	public String openF1() {
		return "f1";
	}
	
	@RequestMapping("/p5controller")
	@ResponseBody
	public String processF1(@RequestParam("fname") String fname, @RequestParam("mname") String mname, @RequestParam("lname") String lname ) {
		
		
		
		return "Welcome : " +fname+ " "+mname+ " "+lname+ " " ;
		
	}
	
	//Path variable 
	//localhost:8080/p6/7
	@RequestMapping("/p6/{n1}/{n2}")
	@ResponseBody
	public String fetchdata(@PathVariable("n1") Integer n1, @PathVariable("n2") Integer n2) {
		
		return "Addition is : "+(n1+n2);
	}
}
