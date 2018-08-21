package com.gms.web.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes("context")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)//get방식을 생략할수있고 생략하면 value도 생략할수있어
	public String home(HttpSession session, HttpServletRequest request) {//request가 모델안에 있게된다.(pom.xml에서 정의된(전역으로) 모델이 돌아다닌다)
		String context = request.getContextPath();
		logger.info("Welcome home! The client locale is {}.", context);
		session.setAttribute("context", context);
		//model.addAttribute("serverTime", "");
		//모델
		return "main";
	}
	
}
