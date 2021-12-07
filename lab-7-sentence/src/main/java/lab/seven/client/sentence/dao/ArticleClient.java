package lab.seven.client.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("lab-7-article")
public interface ArticleClient {

	@GetMapping("/")
	public String getWord();
}
