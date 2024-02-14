package com.example.demo.api.contoller;




@RestController
public class DemoController{
	
	@GetMapping("/demo")
	public String demo() {
		return "demo";
	}
	
}