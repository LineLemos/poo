package com.poo.introducao;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Lista03 {

    /* public void ex1() {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número entre 1 e 59 segundos para iniciar o cronômetro: ");

    }
 */
    public void ex2() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("A tabuada de " + numero + " é: ");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }

    public void ex3() {

        Scanner sc = new Scanner(System.in);

        int numero1, numero2;

        System.out.println("Digite o número menor: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o número maior: ");
        numero2 = sc.nextInt();

        System.out.println("Os números pares entre eles são: ");

        for (int i = numero1; i <= numero2; i++) {
            if (i % 2 == 0) {
                System.out.println (i);
            }
        }
    }

    /* public void ex4(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para ser adivinhado: ");
        int adivinhado = sc.nextInt();

        do{
        System.out.println("Tente adivinhar o número: ");
        int adivinhador = sc.nextInt();

        if (adivinhado == adivinhador){

            System.out.println("Acertou.");
        
        } else {

            if{}
        } */



        }
    }

    public void ex5() {

        Scanner sc = new Scanner(System.in);

        String login, senha;
        String loginCerto = "Aline";
        String senhaCerta = "0403";
        int tentativas = 3;

        do {
            System.out.print("Login: ");
            login = sc.next();

            System.out.print("Senha: ");
            senha = sc.next();

            if (login.equals(loginCerto) && senha.equals(senhaCerta)) {
                System.out.println("Bem vindo!");
                break;
            } else if (login.equals(loginCerto) && !senha.equals(senhaCerta)) {
                tentativas--;
                System.out.println("Sua senha está incorreta.");
            } else if (!login.equals(loginCerto) && senha.equals(senhaCerta)) {
                tentativas--;
                System.out.println("Seu login está incorreto.");
            } else {
                tentativas--;
                System.out.println("Seu login e senha estão incorretos.");
            }

            if (tentativas <= 0) {
                System.out.println("Seu login está bloqueado!");
                break;
            }
        } while (tentativas > 0);

        sc.close();
    }

