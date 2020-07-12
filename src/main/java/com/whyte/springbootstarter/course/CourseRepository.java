package com.whyte.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

//CrudRepository is a generic type so must specify the entity its working with and the type of its primary key
public interface CourseRepository extends CrudRepository<Course, String> {
	//By naming you method like below Spring can make guesses about how to implement the method.
	//video ref here https://www.youtube.com/watch?v=_Jnu_jHfQbM&list=PLqq-6Pq4lTTbx8p2oCgcAQGQyqN8XeA1x&index=31
	//public List<Course> findByName(String name);
	public List<Course> findByTopicId(String topicId);
	
}
