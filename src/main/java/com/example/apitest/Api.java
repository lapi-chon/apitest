package com.example.apitest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api {
	
	@GetMapping(value="/status")
	public String getInfos() {
		return("Api fonctionne");
	}
	
}
