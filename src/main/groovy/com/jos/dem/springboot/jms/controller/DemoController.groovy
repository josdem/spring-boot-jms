package com.jos.dem.springboot.jms.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class DemoController {

  @RequestMapping('/')
  String index(){
  	'Hello World!'
  }
	
}