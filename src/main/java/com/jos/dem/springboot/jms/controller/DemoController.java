package com.jos.dem.springboot.jms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.jos.dem.springboot.jms.command.Command;
import com.jos.dem.springboot.jms.command.PersonCommand;
import com.jos.dem.springboot.jms.service.MessageService;

@RestController
public class DemoController {

	@Autowired
  private MessageService messageService;

  @GetMapping("/")
  public String index(){
  	Command person = new PersonCommand("josdem","joseluis.delacruz@gmail.com");
  	messageService.sendMessage(person);
  	return "Java Message Service";
  }

}
