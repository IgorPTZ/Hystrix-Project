package lab.seven.client.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("lab-7-adjective")
public interface AdjectiveClient {

	@GetMapping("/")
	public String getWord();
}
