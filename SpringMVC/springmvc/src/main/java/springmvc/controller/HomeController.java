package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("This is Home page.");
		model.addAttribute("name", "Sumit Modi");
		model.addAttribute("Id", 1234);
		
		List<String> list = new ArrayList<>();
		list.add("Nilesh");
		list.add("Ramesh");
		list.add("Avinash");
		list.add("Kapil");
		list.add("Shubham");
		model.addAttribute("friends", list);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		LocalDateTime now = LocalDateTime.now();
//		System.out.println(now.toString());
		//Add Object
		modelAndView.addObject("name", "Guarav");
		modelAndView.addObject("rollnumber", 123321);
		modelAndView.addObject("time", now);
		
		//set the view name
		modelAndView.setViewName("help");
		
		//adding marks
		List<Integer> list = new ArrayList<>();
		list.add(1234);
		list.add(76543);
		list.add(567);
		list.add(98765);
		modelAndView.addObject("marks", list);
		
		return modelAndView;
	}
}
