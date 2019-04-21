package com.jos.dem.springboot.jms.service.impl;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.stereotype.Service;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.jms.command.Command;
import com.jos.dem.springboot.jms.service.MessageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@EnableJms
public class MessageServiceImpl implements MessageService {

  @Autowired
  private JmsTemplate jmsTemplate;

  private Logger log = LoggerFactory.getLogger(this.getClass());

  public void sendMessage(final Command command) {
    jmsTemplate.send("destination", (Session session) -> {
      ObjectMessage message = session.createObjectMessage();
      message.setObject(command);
      return message;
    });
  }

}
