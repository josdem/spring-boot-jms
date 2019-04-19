package com.jos.dem.springboot.jms.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonCommand implements Command {
	private String nickname;
	private String email;
}
