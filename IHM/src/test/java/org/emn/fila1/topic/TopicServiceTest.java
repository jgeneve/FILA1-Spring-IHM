package org.emn.fila1.topic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TopicServiceTest {

	@Autowired
	private TopicService topicService;
	
	@MockBean private TopicRepository TopicRepository;
	
	@Test
	public void test() {
		String topicName = "rust";
		Topic topic = new Topic(42, topicName, "Rust Language Programming");
		
		BDDMockito.given(TopicRepository.save(topic)).willReturn(null);
		BDDMockito.given(TopicRepository.findByName(topicName)).willReturn(topic);
		
		topicService.addTopic(topicName, topic);
		assertNotNull(topicService.getTopic(topicName));
	}

}
