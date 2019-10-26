package com.jos.dem.springboot.jms.controller;

import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.jms.command.Command;
import com.jos.dem.springboot.jms.command.PersonCommand;
import com.jos.dem.springboot.jms.service.MessageService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class DemoController {

	@Autowired
  private MessageService messageService;

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @GetMapping("/")
  public Mono<String> index(){
    log.info("Sending message");
  	Command person = new PersonCommand("josdem","joseluis.delacruz@gmail.com");
  	messageService.sendMessage(person);
  	return Mono.just("Java Message Service");
  }

}
