package com.jos.dem.springboot.jms.messengine;

import javax.jms.Message;
import javax.jms.ObjectMessage;

import org.apache.commons.lang3.builder.ToStringBuilder;

import org.springframework.stereotype.Component;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MessageListener {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @JmsListener(destination = "destination", containerFactory = "myJmsContainerFactory")
  public void receiveMessage(Message message) {
    Object command =  ((ObjectMessage) message).getObject();
    log.info("Message Received: " + ToStringBuilder.reflectionToString(command));
  }

}
