package org.emn.fila1.topic;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		
		for(Topic t: topicRepository.findAll()) {
			topics.add(t);
		}
		
		return topics;
			
	}

	public Topic getTopic(String name) {
		return topicRepository.findByName(name);
	}

	public void addTopic(String name, Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String name, Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String name) {
		topicRepository.deleteByName(name);
	}
}
