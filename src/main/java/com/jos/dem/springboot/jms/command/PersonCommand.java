package com.jos.dem.springboot.jms.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonCommand implements Command {
  private String nickname;
  private String email;
}
