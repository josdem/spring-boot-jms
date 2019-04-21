package com.jos.dem.springboot.jms;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;

@SpringBootApplication
public class DemoApplication {

	@Bean
  public JmsListenerContainerFactory<?> myJmsContainerFactory(ConnectionFactory connectionFactory) {
    SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
    factory.setConnectionFactory(connectionFactory);
    return factory;
  }

  public static void main(String[] args) {
	  SpringApplication.run(DemoApplication.class, args);
  }

}
