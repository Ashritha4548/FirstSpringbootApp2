package com.SpringbootApp.FirstSpringbootApp.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
   private List<Topic> topics = Arrays.asList(
            new Topic("Spring", "SpringFramework","Springframework description"),
                new Topic("java", "Core Java","Java description"),
                new Topic("Python", "Python","Python description")
        );
public List<Topic> getAllTopics(){
    return topics;
}
public void addTopic(Topic topic){
    topics.add(topic);
}
}
