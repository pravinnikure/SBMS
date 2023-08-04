package com.prav.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/***
 * This annotations creates objects to our class and also enables HTTP protocal supports
 * @author Pravin
 *
 */

@Controller
public class HomeController {
	
	@RequestMapping(value = "/show", method=RequestMethod.GET)
	public String homeShow()
	{
		return "Home";
	}
}
