package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WebProduitController {
	
	@RequestMapping("/api")
	public String GetProduit() {
		return "hello it work";
	}
	

}
