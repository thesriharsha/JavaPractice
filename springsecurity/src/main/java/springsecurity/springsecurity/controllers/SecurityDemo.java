package springsecurity.springsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityDemo {

	@GetMapping("/all")
	public String toAll()
	{
		return "Access to All";
	}
	
	
}
