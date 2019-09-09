package br.com.bossini.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.bossini.util.Calculadora;

@Configuration
public class AppConfig {
	
	@Bean
	public Calculadora getCalculadora () {
		return new Calculadora();
	}

}
