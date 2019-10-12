package edu.mum.cs.cs425.eregistrarcrudlab8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = {"/", "/eregistrar", "/eregistrar/home"})
	public String home() {
		return "home/index";
	}
}
