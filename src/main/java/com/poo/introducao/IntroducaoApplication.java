package com.poo.introducao; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		LimpaTerminal.limpa_windows(); 

		Lista01 lista1 = new Lista01();
		Lista02 lista2 = new Lista02();
		Lista03 lista3 = new Lista03();
		Lista04 lista4 = new Lista04();

		lista3.ex3();
		
	}
}

