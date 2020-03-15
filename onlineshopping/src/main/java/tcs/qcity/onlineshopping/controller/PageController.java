package tcs.qcity.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // helper controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	// model&view class, model as view name-->index
	public ModelAndView index() {
		// master page
		// ctrl + shift + 0
		ModelAndView mv = new ModelAndView("page");
		// passing data to greeting view
		mv.addObject("greeting ", "welcome to spring web mvc");
		return mv;
	}

// creating a views folder 
	// WEB-INF
	// views
	// page.jsp
	
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting") String greeting) {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting ", "welcome to spring web mvc");

		return mv;

	}
	/*@RequestMapping(value = "/test")
	public ModelAndView test(@RequestParam(value="greeting",required=false) String greeting) {
		if(greeting ==null) {
			greeting="hello world";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting ", "welcome to spring web mvc");

		return mv;*/

	//}
}
