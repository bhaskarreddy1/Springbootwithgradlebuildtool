package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GiveHomepage {
	
	@GetMapping("/student")
	public String getSutdent() {
		return "{name bhaskar place:gorantla city:anatapur }";
	}

}
