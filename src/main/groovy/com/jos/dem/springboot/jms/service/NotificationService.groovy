package com.jos.dem.springboot.jms.service

import com.jos.dem.springboot.jms.command.Command

interface NotificationService {

  void sendNotification(Command command)

}