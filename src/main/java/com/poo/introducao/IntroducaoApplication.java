package com.poo.introducao; 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class IntroducaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroducaoApplication.class, args);

		LimpaTerminal.limpa_windows(); 

		Lista02 lista2 = new Lista02();
		//lista2.ex1();
		//lista2.ex2();
		//lista2.ex3();
		//lista2.ex4();
		lista2.ex5();
		lista2.ex6();
		
		
	}
}

