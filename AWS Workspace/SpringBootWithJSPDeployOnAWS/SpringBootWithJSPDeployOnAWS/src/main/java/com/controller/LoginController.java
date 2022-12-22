package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@PostMapping(value = "signIn")
	public ModelAndView signIn(Login login, HttpServletRequest req) {
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		login.setEmailid(emailid);
		login.setPassword(password);
		
		String result = loginService.signIn(login);
		
		
		ModelAndView mav = new ModelAndView();
		if(result.equals("successfully login")) {
			mav.setViewName("home");
		}else {
			mav.setViewName("index");
		}
		mav.addObject("msg", result);
		return mav;
	}
	
	@PostMapping(value = "signUp")
	public ModelAndView signUp(Login login, HttpServletRequest req) {
		
		String emailid = req.getParameter("emailid");
		String password = req.getParameter("password");
		login.setEmailid(emailid);
		login.setPassword(password);
		
		String result = loginService.signUp(login);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);		// request.setAttribute("msg",result);
		mav.setViewName("index");
		return mav;
	}
	
}
