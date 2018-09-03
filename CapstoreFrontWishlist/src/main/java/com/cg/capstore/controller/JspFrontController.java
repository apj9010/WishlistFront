package com.cg.capstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspFrontController {
	
	@RequestMapping(value="/addProduct")
	public String transferControl() {
		System.err.println("In Jsp Sending Control to jsp page");
		return "addProduct";
	}
	
}
