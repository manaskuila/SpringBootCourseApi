package com.manas.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manas.springboot.topics.TopicService;
import com.manas.springboot.topics.model.Topics;
@RestController
public class HelloController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/hello")
	public String getCourse() {
		return "Hi";
		
	}
	@RequestMapping("/topics")
	public List<Topics> getAllTopic() {
		return topicService.getAllTopics();
		
	}
	@RequestMapping(value="/topics",method=RequestMethod.POST)
	public List<Topics> addTopic() {
		return topicService.getAllTopics();
		
	}
	@RequestMapping(value="/topics/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(String id) {
		topicService.deleteTopic(id);
		
	}

}
