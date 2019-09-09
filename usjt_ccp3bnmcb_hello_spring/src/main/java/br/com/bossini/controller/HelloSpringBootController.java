package br.com.bossini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringBootController {

	@GetMapping ("/hello")
	public String qualquerCoisa () {
		System.out.println("entrou no método");
		return "hello_spring_boot";
	}
}
