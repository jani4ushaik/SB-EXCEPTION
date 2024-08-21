package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg(){
		
		int i=10/0;
		
		String msg = "Welcome to Ashok It";
		
		return msg;
	}

	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<String> handleAE(Exception e) {
		
		return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
