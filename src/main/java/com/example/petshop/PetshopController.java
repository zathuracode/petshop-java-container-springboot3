package com.example.petshop;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
@RequestMapping("/api/v1/petshopController")
public class PetshopController {

	private String getLocalDateTime()
	{
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
		  LocalDateTime now = LocalDateTime.now();
		  return dtf.format(now);
	}
	
	
	@GetMapping(path ="/getnumberofdogs" )
	public String getNumberOfDogs() {
		return "We have 5 dogs dgomez. " + getLocalDateTime();
	}
	
	@GetMapping(path = "/getnumberofcats")
	public String anotherGet() {
		return "We have 3 cats. dgomez " + getLocalDateTime();
	}
	
	@PostMapping(path = "/submitrequest")
    public String postBody(@RequestBody String request) {
        return "We received your request at  dgomez"+getLocalDateTime()+": " + request;
    }

}