package org.emn.fila1.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
	Topic findByName(String name);
	void deleteByName(String name);
}
