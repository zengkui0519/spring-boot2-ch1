package com.zk.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zk.sample.annotation.Function;

@Controller
public class HelloWorldController {

	@RequestMapping("/hiii")
	@Function()
	public @ResponseBody String say(String name){
		return "hello "+name;
	}
}
