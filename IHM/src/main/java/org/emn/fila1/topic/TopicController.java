package org.emn.fila1.topic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
		
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}
	
	@RequestMapping("/topics/{name}")
	public Topic getTopic(@PathVariable String name) {		
		return topicService.getTopic(name);
	}
	
	@RequestMapping(path="/topics/{name}", method=RequestMethod.PUT)
	public void addTopic(@PathVariable String name, @RequestBody Topic topic) {
		topicService.addTopic(name, topic);
	}
	
	@RequestMapping(path="/topics/{name}", method=RequestMethod.POST)
	public void updateTopic(@PathVariable String name, @RequestBody Topic topic) {
		topicService.updateTopic(name, topic);
	}
	
	@RequestMapping(path="/topics/{name}", method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String name) {
		topicService.deleteTopic(name);
	}
	
	
	
	
	
}
