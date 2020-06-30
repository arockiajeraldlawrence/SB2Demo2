package com.example.SB2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Sb2demoApplication  extends SpringBootServletInitializer {

	 @Override
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(Sb2demoApplication.class);
	 }
	 
	public static void main(String[] args) {
		SpringApplication.run(Sb2demoApplication.class, args);
	}
	
    @RequestMapping("/")
    public String index() {
        return "Welcome Sahaswin Arockia Jerald Lawrence Preetha!";
    }
    

}
