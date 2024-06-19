package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {


    public void ex1(){

        int numero;

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        if(numero == 0){
            System.out.println("O número é 0.");
        }else if (numero %2 == 0){
            System.out.println("Par.");
        } else {
            System.out.println("Ímpar.");
        }

    }

    public void ex2(){

        int num1, num2;

        System.out.print("Escreva um número: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.print("Escreva outro número: ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O número " + num1 + " é maior que " + num2);
        }else{
            System.out.println("O número " + num2 + " é maior que " + num1);
        }
    }

    public void ex3(){

        String idoso, gestante, deficiente;

        System.out.println();


    }
}
