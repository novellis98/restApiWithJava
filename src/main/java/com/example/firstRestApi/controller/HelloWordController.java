package com.example.firstRestApi.controller;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	private MessageSource messageSource;

	public HelloWordController(MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}

//	@RequestMapping(method = RequestMethod.GET, path = "/hello-word")
	@GetMapping("/hello-word")
	public String helloWord() {
		return "hello word";
	}

	@GetMapping("/hello-word-internetional")
	public String helloWordInternational() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
//		return "hello word V2";
	}

	@GetMapping("/hello-word-bean")
	public HelloWordBean helloWordBean() {
		return new HelloWordBean("hello word");
	}

	@GetMapping("/hello-word-bean/path-variable/{name}")
	public HelloWordBean helloWordBean(@PathVariable String name) {
//		return new HelloWordBean ("hello word" + name);
		return new HelloWordBean(String.format("hello word %s", name));
	}
}
