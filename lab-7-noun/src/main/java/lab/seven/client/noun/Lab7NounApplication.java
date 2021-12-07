package lab.seven.client.noun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab7NounApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab7NounApplication.class, args);
	}

}
