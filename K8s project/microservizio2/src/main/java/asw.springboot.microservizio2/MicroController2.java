package asw.springboot.microservizio2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController2 {
	
	@RequestMapping("/service2")
	public String service2() {
		return "Hey there I'm service2...let's open a beer🍺!";
	}
	
}
