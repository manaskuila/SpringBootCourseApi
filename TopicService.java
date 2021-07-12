package com.manas.springboot.topics;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.manas.springboot.topics.model.Topics;

@Service
public class TopicService {
	
	private List<Topics> topic=new ArrayList<>(Arrays.asList(new Topics("Java","Java Spring","Spring Boot Framwork"),
			new Topics("J2EE","Java Web Dev","Enterprise Java Dev"),
			new Topics("Core Java","Java8","Used for Bank end dev")));
	
	public List<Topics> getAllTopics(){
		return topic;
	}
	public Topics getTopics(String id){
		return topic.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topics topics) {
		topic.add(topics);
	}
	public void updateTopic(Topics topics) {
		
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		return ;
	}

}
