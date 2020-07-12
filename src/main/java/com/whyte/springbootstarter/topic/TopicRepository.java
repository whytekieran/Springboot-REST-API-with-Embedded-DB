package com.whyte.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

//CrudRepository is a generic type so must specify the entity its working with and the type of its primary key
public interface TopicRepository extends CrudRepository<Topic, String> {
	
}
