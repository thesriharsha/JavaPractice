package rest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	//@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello() {
		return "<h1>Hello Run</h1>";
	}
	
	@GetMapping("/hello/{user}")
	public String hello(@PathVariable("user") String user) {
		return "<h1>Hello "+ user +"</h1>";
	}
	
	@GetMapping("/factorial/{num}")
	public String factorial(@PathVariable("num") int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact*=i;
		}
		return "<h2>The factorial of "+num+" is "+fact+"</h2>";
	}
	
	@GetMapping("/sysdate")
	public String date()
	{
		return "<h2>Date : "+LocalDate.now()+" Time : "+LocalTime.now()+"</h2>";
	}
}
