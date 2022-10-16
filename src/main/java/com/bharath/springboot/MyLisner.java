package com.bharath.springboot;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MyLisner {

	@JmsListener(destination ="{springjms.myQueue}")
	public void receive (String message) {
		System.out.println("Message Receive --> " + message);
	}
}
