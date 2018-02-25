package com.jos.dem.springboot.jms.service.impl

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Value
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier

import com.jos.dem.springboot.jms.command.Command
import com.jos.dem.springboot.jms.service.NotificationService

import org.slf4j.Logger
import org.slf4j.LoggerFactory

@Service
class NotificationServiceImpl implements NotificationService {

  Logger log = LoggerFactory.getLogger(this.class)

  @Override
  void sendNotification(Command command) {
    log.info "command: ${command.dump()}"
  }

}