package com.manish;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


// fetch data by model
//@Controller
//public class HelloController {
//       @RequestMapping("/p7")
//	public String OpenF2(Model model) {
//		
//		
//		String name = "Manish Kumar";
//	   model.addAttribute("n", name);
//	  
//	     
//		return "f2";
//	}
//	
//}



// fetch data with ModelAndView 

//@Controller
//public class HelloController {
//       @RequestMapping("/p7")
//	public ModelAndView OpenF2() {
//		ModelAndView mv = new ModelAndView();
//		
//		String name = "Manish Kumar";
//	   mv.addObject("n", name);
//	   String add = "Bihar";
//	   mv.addObject("add", add);
//	   mv.setViewName("f2");
//		return mv;
//	}
//	
//}


//fetch data by ModelMap 
@Controller
public class HelloController {
    @RequestMapping("/p7")
	public String OpenF2(ModelMap m) {
		
		
		String name = "Manish Kumar";
	     m.addAttribute("n", name);
	     m.addAttribute("role", "Admin");
	     
		return "f2";
	}
	
}


