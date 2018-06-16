package asw.springboot.microservizio1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroController1 {
	
	@RequestMapping("/")
    public String home(){
        return "Hello World!\nProva ad accedere al path ... blablabla/service1";
    }

	@RequestMapping("/service1")
	public String service1() {
		Client client = new Client("http://localhost:8090");
		return client.call() + "... a good beer!".toUpperCase();
	}

}
