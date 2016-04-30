package edu.umsl.springprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
		
		
	}

}
