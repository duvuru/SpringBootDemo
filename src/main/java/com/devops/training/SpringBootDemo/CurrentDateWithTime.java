package com.devops.training.SpringBootDemo;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrentDateWithTime {
	
	@RequestMapping("/")
	public Date getCurrentDateAndTime(){
		return new Date();
	}

}
