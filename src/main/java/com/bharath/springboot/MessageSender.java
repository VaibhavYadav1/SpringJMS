package com.bharath.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	private JmsTemplate jmsTemplate;
	
	@Value("{springjms.myQueue}")
    private String queue;
	
	public void send (String message) {
		
		System.out.println("Message Send -->" + message);
//		jmsTemplate.convertAndSend(queue, message);
		
		MessageCreator messagecreator = s -> s.createTextMessage("Hello jms!!");
		jmsTemplate.send(queue, messagecreator);
	}
}
