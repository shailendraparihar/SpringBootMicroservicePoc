package com.reservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ram
 *
 * This controller is specific to web security custom login/logout page
 */

@Controller
public class LoginController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/myLogin")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage() {
		return "logout";
	}
	@RequestMapping("/common")
	@ResponseBody
	public String common() {
		return "this is unauthorized common page";
	}
}
