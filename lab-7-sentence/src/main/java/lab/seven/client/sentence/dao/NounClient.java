package lab.seven.client.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("lab-7-noun")
public interface NounClient {

	@GetMapping("/")
	public String getWord();
}
