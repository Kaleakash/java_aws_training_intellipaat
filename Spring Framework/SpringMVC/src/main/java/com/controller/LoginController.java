package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Login;
import com.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "signIn",method = RequestMethod.POST)
	public ModelAndView checkUser(HttpServletRequest req,Login ll) { //DI for request object. 
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ll.setEmail(email);
		ll.setPassword(password);
		ModelAndView mav = new ModelAndView();
		
//		if(email.equals("akash@gmail.com") && password.equals("123")) {
//			mav.setViewName("success.jsp");
//		}else {
//			mav.setViewName("failure.jsp");
//		}
		
		if(loginService.checkLogin(ll).equals("success")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;		
	}
}
