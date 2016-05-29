package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainSpringController {
	
	@RequestMapping(value = "/")
	protected ModelAndView getLoginPage() throws Exception {
		ModelAndView modelandview = new ModelAndView("index");
		return modelandview;
	}
	
	@RequestMapping(value = "/greeting")
	protected ModelAndView getGreetingPage(HttpServletRequest request) throws Exception {
		ModelAndView modelandview = new ModelAndView("greeting");
		modelandview.addObject("name", request.getParameter("name"));
		return modelandview;
	}
	
	@RequestMapping(value = "/main")
	protected ModelAndView getMainPage(HttpServletRequest request) throws Exception {
		ModelAndView modelandview = new ModelAndView("main");
		return modelandview;
	}	
}
