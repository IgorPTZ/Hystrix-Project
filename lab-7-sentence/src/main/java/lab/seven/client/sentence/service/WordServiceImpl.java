package lab.seven.client.sentence.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lab.seven.client.sentence.dao.AdjectiveClient;
import lab.seven.client.sentence.dao.ArticleClient;
import lab.seven.client.sentence.dao.NounClient;
import lab.seven.client.sentence.dao.SubjectClient;
import lab.seven.client.sentence.dao.VerbClient;

@Service
public class WordServiceImpl implements WordService {
	
	@Autowired
	private VerbClient verbClient;
	
	@Autowired
	private SubjectClient subjectClient;
	
	@Autowired
	private ArticleClient articleClient;
	
	@Autowired
	private AdjectiveClient adjectiveClient;
	
	@Autowired
	private NounClient nounClient;
	
	@Override
	@HystrixCommand(fallbackMethod = "getFallbackSubject")
	public String getSubject() {
		
		return subjectClient.getWord();
	}

	@Override
	public String getVerb() {
		
		return verbClient.getWord();
	}

	@Override
	public String getArticle() {
		
		return articleClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public String getAdjective() {
		
		return adjectiveClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod = "getFallbackNoun")
	public String getNoun() {
		
		return nounClient.getWord();
	}
	
	public String getFallbackSubject() {
		
		return "Default Subject";
	}
	
	public String getFallbackAdjective() {
		
		return "Default Adjective";
	}
	
	public String getFallbackNoun() {
		
		return "Default Noun";
	}
}
