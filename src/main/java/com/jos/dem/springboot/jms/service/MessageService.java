package com.jos.dem.springboot.jms.service;

import com.jos.dem.springboot.jms.command.Command;

public interface MessageService {

  void sendMessage(final Command command);
}
