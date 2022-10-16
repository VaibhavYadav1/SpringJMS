package com.bharath.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringjmsApplicationTests {
	
	@Autowired
	MessageSender sender;
	
	@Test
	void testSendAndReceive() throws Exception {
		try {
			sender.send("Helo Spring jms");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
