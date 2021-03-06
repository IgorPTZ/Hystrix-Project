package lab.seven.client.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab7ArticleApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab7ArticleApplication.class, args);
	}

}
