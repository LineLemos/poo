package com.poo.introducao;

import java.util.Locale;
import java.util.Scanner;

public class Lista01 {

    Scanner sc = new Scanner(System.in);

    public void ex1(){
        int num1, num2, resultado;

        System.out.print("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        
        System.out.print("Digite outro número: ");
        num2 = sc.nextInt();

        resultado = num1 + num2;
        System.out.println("A soma dos números é: " + resultado);

    }

    public void ex2(){

        String nome, sobrenome;

        System.out.println("Digite seu primeiro nome: ");
        Scanner sc = new Scanner(System.in);

        nome = sc.next();

        System.out.println("Digite seu sobrenome: ");
        sobrenome = sc.next();

        System.out.println("Olá, " + nome + " " + sobrenome + "!");
        
    }
    public void ex3(){

        double valorReal, valorDolar, taxaConversao = 5.25;

        System.out.print("Digite o valor em reais que deseja converter para dólares: R$");
        Scanner sc = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        valorReal = sc.nextDouble();
        
        valorDolar = valorReal/ taxaConversao;

        System.out.println("R$" + 
            String.format("%.2f", valorReal) + 
            " convertidos em dólar equivalem a: $" + 
            String.format("%.2f", valorDolar));
        
    }

    public void ex4(){

        int numero, antecessor, sucessor;

        System.out.println("Digite o número que você deseja saber o antecessor e o sucessor: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        antecessor = numero -1;
        sucessor = numero +1;

        System.out.println("O antecessor de " + numero + " é: " + antecessor + "\nE o sucessor de " + numero + " é: " + sucessor);
        
    }

    public void ex5(){

        int areaTerreno, valorm2, valorTerreno;

        System.out.print("Qual a área do seu terreno em m²? ");
        Scanner sc = new Scanner(System.in);
        areaTerreno = sc.nextInt();

        System.out.print("Qual o valor do m² na sua região? R$");
        valorm2 = sc.nextInt();

        valorTerreno = areaTerreno * valorm2;
        System.out.println("O valor do seu terreno é: R$" + valorTerreno);
        

    }
    public void ex6(){

        double distancia, valorcombustivel = 5.25, custototal, autonomia;

        System.out.print("Digite a distância percorrida em km: ");
        Scanner sc = new Scanner(System.in);
        distancia = sc.nextDouble();

        System.out.print("Quanto de combustível você colocou (em reais)? R$");
        custototal = sc.nextDouble();

        autonomia = distancia/(custototal/valorcombustivel);

        System.out.println("A autonomia do seu veículo é de: " + autonomia + " Km/l.");
        
    }
    
    public void ex7(){

        double nota1, nota2, nota3, nota4, media, notaRecuperacao;

        System.out.print("Digite a primeira nota: ");
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextDouble();

        System.out.print("\nDigite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("\nDigite a terceira nota: ");
        nota3 = sc.nextDouble();

        System.out.print("\nDigite a quarta nota: ");
        nota4 = sc.nextDouble();

        media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.print("\nA média do estudante é: " + media + "\n");

        if (media >= 6){
        System.out.println("Aprovado.");
     } else {
        System.out.print("\nDigite a nota da recuperação: ");
        notaRecuperacao = sc.nextDouble();

        if (notaRecuperacao >= 6){
            System.out.println("Aprovado.");
      } else {
            System.out.println("Reprovado.");
        }
     }
    }


    public void ex8(){

        double celsius, farenheit;

        System.out.print("Digite a temperatura em Farenheit: ");
        Scanner sc = new Scanner(System.in);
        farenheit = sc.nextDouble();

        celsius = (farenheit -32)/ 1.8;

// A minha ideia inicial foi fazer um celsius = conversão, sendo conversão um número inteiro.
// Mas eu não sabia como, então pesquisei como fazia.
// Mas um jeito mais simples seria só usar string.format(%.0f) (?)
        int conversao = (int) Math.round(celsius);

        System.out.print("A temperatura em Celsius é: " + conversao);

        sc.close();
    }
}
