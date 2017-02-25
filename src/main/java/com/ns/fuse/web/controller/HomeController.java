package com.ns.fuse.web.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="echo")
	public String echo(String message){
		return message;
	}
}
