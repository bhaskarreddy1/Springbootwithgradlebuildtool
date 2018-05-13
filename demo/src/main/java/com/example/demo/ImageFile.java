package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageFile {
	@GetMapping("/got/bhaskar")
	public String getmethod() {
		return "get method is is good";
	}

}
