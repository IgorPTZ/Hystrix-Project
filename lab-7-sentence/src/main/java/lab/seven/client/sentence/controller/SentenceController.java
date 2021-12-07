package lab.seven.client.sentence.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lab.seven.client.sentence.service.SentenceService;

@Controller
public class SentenceController {
	
	@Autowired
	private SentenceService sentenceService;
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentences() {
		
		return "<h3>Some sentences</h3><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>";
	}
}

