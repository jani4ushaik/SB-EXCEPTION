package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@GetMapping("/demo")
	public String getWelcomeMsg(){
		
		int i=10/0;
		
		String msg = "Welcome to Ashok It";
		
		return msg;
	}


}
