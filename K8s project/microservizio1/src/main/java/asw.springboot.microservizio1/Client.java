package asw.springboot.microservizio1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class Client {
	
	private String url;
	
	public Client (String url) {
		this.url=url;
	}
	
	public String call() {
		RestTemplate rest=new RestTemplate();
		return rest.getForObject(this.url+"/service2", String.class);
	}

}
