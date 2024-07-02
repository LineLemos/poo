package com.poo.introducao; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		LimpaTerminal.limpa_windows(); 

		
		Lista04 lista4 = new Lista04();

		lista4.ex6();
		
	}
}

