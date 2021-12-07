package lab.seven.client.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("lab-7-verb")
public interface VerbClient {

	@GetMapping("/")
	public String getWord();
}
