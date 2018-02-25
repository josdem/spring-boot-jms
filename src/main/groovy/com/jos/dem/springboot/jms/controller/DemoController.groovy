package com.jos.dem.springboot.jms.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

import com.jos.dem.springboot.jms.command.Command
import com.jos.dem.springboot.jms.command.PersonCommand

@RestController
class DemoController {

  @RequestMapping('/')
  String index(){
  	Command person = new PersonCommand(nickname:'josdem', email:'joseluis.delacruz@gmail.com')
  	
  	'Hello World!'
  }
	
}