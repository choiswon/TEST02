package com.simplify.sample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

	@RequestMapping("/")
	public String root_test(HttpSession session) throws Exception{
		return "Hello Root(/) " + session.getId();
	}

	@RequestMapping("/demo")
	public String demo_test(HttpSession session) throws Exception{
		return "Hello demo(/demo) " + session.getId();
	}

}
