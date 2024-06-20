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

        Scanner sc = new Scanner(System.in);
        Scanner scint = new Scanner(System.in);

        String gestante, deficiente;
        int respostaidoso;
        

        System.out.println("Qual a sua idade? ");
        respostaidoso = scint.nextInt();
        if (respostaidoso >= 65){
        System.out.println("Dirija-se a fila preferencial.");
        return;
        }
        
        System.out.println("Você está gestante? Responda com S/N: ");
        gestante = sc.next();

        if (gestante.equalsIgnoreCase("s")){
        System.out.println("Dirija-se a fila preferencial.");
        return;
        }
        
        System.out.println("Você é PCD? Responda com S/N: ");
        deficiente = sc.next();

        if (deficiente.equalsIgnoreCase("s")){
            System.out.println("Dirija-se a fila preferencial.");
            return;
            }

        else{
        System.out.println("Dirija-se a fila comum.");}

        }
    public void ex4(){

        Scanner sc = new Scanner(System.in);

        int resposta;

        System.out.println("Qual a sua idade? ");
        resposta = sc.nextInt();

        if (resposta ==16 || resposta ==17){
            System.out.println("Comparecer ao evento somente acompanhado de responsável. ");
        }
        if (resposta >=18){
        System.out.println("Bem vindo ao evento!");
        }
        else{
        System.out.println("Infelizmente, você não pode comparecer ao evento.");
        }
    }
    public void ex5(){

        Scanner sc = new Scanner(System.in);
      
        String login = "Aline", senha = "0403";

        System.out.print("Login: ");
        login = sc.next();

        System.out.print("Senha: ");
        senha = sc.next();

        if (login.equals("Aline") && senha.equals("0403")){
        System.out.println("Bem vindo!");
        }
        if (login.equals("Aline") && !senha.equals("0403")){
        System.out.println("Sua senha está incorreta.");
        }
        if (!login.equals("Aline") && senha.equals("0403")){
            System.out.println("Seu login está incorreto.");
        }
        else{
        System.out.println("Seu login e senha estão incorretos.");
        }
    }
    public void ex6(){

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media, recuperacao;

        System.out.print("Insira a nota da 1ª avaliação: ");
        nota1 = sc.nextDouble();

        System.out.print("Insira a nota da 2ª avaliação: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2)/ 2;

        if (media >=6){
        System.out.println("Aprovado. A média foi: " + media);
        }
        else{
        System.out.print("Insira a nota da recuperação: ");
        recuperacao = sc.nextDouble();
        
        if (nota1 < nota2) {
        media = (nota2 + recuperacao)/2;
        if (media >=6){
        System.out.println("Aprovado. A média foi: " + media);
        }
        if (media < 6) {
        System.out.println("Reprovado. A média foi: " + media);
        }
        }
    
        if (nota2 < nota1) {
        media = (nota1 + recuperacao)/2;
        if (media >=6){
        System.out.println("Aprovado. A média foi: " + media);
        }
        if (media < 6){
        System.out.println("Reprovado. A média foi: " + media);
        }
        }
        if (recuperacao < nota1 && recuperacao < nota2){
        media = (nota1 + nota2)/2;
        System.out.println("Reprovado. A média foi: " + media);
        }
}
}
}






      
    



