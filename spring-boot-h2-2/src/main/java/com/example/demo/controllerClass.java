package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerClass {

	@Autowired
	private StudentRepository studentRepo;
	
	@GetMapping("/hi")
	public String shit()
	{

		System.out.println("hey");
	    return "br";
	}
	
	@GetMapping("/bhatt")
	public List<Student> getshits(@RequestParam("bb") String name)
	{
		return this.studentRepo.rraj(name);
	}
}
