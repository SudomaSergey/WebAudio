package controllers;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import controllers.HibernateUtil;
import dom.Publisher;

@Controller
public class MainSpringController {
	
	@RequestMapping(value = "/")
	protected ModelAndView getLoginPage() throws Exception {
		ModelAndView modelandview = new ModelAndView("index");
		return modelandview;
	}
	
	@RequestMapping(value = "/greeting")
	protected ModelAndView getGreetingPage(HttpServletRequest request) throws Exception {

		String name = request.getParameter("name");
		String ip = request.getRemoteAddr();
		
		ModelAndView modelandview = new ModelAndView("greeting");
		modelandview.addObject("name", name);
		
		Publisher publisher = new Publisher();
		publisher.setName(name);
		publisher.setIpAdr(ip);
		
		DatabaseController.pushToDB(publisher);
		
		return modelandview;
	}
	
	@RequestMapping(value = "/main")
	protected ModelAndView getMainPage(HttpServletRequest request) throws Exception {
		ModelAndView modelandview = new ModelAndView("main");
		return modelandview;
	}	
}
