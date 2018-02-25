package com.jos.dem.springboot.jms.service

import com.jos.dem.springboot.jms.command.Command

interface MessageService {

  void message(final Command command)
  
}