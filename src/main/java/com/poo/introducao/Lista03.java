package com.poo.introducao;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Lista03 {

    public void ex01() {
        int tempo;
        boolean certo = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("digite um valor entre 1 e 59:");
            tempo = scanner.nextInt();

            if (tempo >= 1 && tempo <= 59) {
                certo = false;
            } else {
                System.out.println("Valor invalido");
            }

        } while (certo);

        for (int i = tempo; i > 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }
        System.out.println("acabou");
    }

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
                System.out.println(i);
            }
        }
    }
    void ex4() {
        Scanner sc = new Scanner(System.in);
        int chute, numero = (int)(Math.random() * 101);
        
        System.out.println("===== Jogo de Adivinhação =====\n" +
                           "Este programa um número aleatório de 0 a 100 e pede para o usuário adivinhá-lo.\n");
        System.out.println("Adivinhe um número de 0 a 100!");

        do {
            System.out.print("Chute: ");
            chute = sc.nextInt();
            if (chute == numero) {
                break;
            } else if (Math.abs(chute - numero) <= 10) {
                System.out.println("Está quente!");
            } else if (chute > numero) {
                System.out.println("Muito alto!");
            } else {
                System.out.println("Muito baixo!");
            }
        } while (chute != numero);
        System.out.println("Parabéns! O número secreto era " + numero + "!");
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

    public void ex06() {
        int andares;

        System.out.println("digite quantos andares: ");
        andares = scanner.nextInt();

        for (int i = 0; i < andares; i++) {
            for (int k = andares - i; k > 1; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public void ex07() {
        int largura, altura;

        System.out.println("digite a altura");
        altura = scanner.nextInt();

        System.out.println("digite a largura");
        largura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
