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
        else if (login.equals("Aline") && !senha.equals("0403")){
        System.out.println("Sua senha está incorreta.");
        }
        else if (!login.equals("Aline") && senha.equals("0403")){
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
        }
        else {
        media = (nota1 + recuperacao)/2;
        }
        if (recuperacao <= nota1 && recuperacao <= nota2) {
            media = (nota1 + nota2) / 2;
        }
        if (media >= 6) {
            System.out.println("Aprovado. A média foi: " + media);
        } else {
            System.out.println("Reprovado. A média foi: " + media);
        }
    }
    }
    public void ex7(){

        Scanner sc = new Scanner(System.in);

        int dividendo, divisor;

        System.out.println("Digite o dividendo: ");
        dividendo = sc.nextInt();

        System.out.println("Digite o divisor: ");
        divisor = sc.nextInt();

        if (dividendo % divisor ==  0) {
            System.out.println("É divisivel. O resultado da divisão é: " + (dividendo/divisor));
        }else{
            System.out.println("Não é divisível.");
        }
    }

    public void ex8(){

        Scanner sc = new Scanner(System.in);

        int chances = 3;
        String resposta1, resposta2, resposta3, resposta4, resposta5;


        System.out.println("Pergunta 1)\nSegundo a música da Xuxa que referencia a teoria das cores, o azul com vermelho dá: ");
        System.out.println("a)Roxo."); 
        System.out.println("b)Verde."); 
        System.out.println("c)Laranja."); 
        System.out.println("d)Rosa."); 
        
        resposta1 = sc.next();
        
        if (resposta1.equalsIgnoreCase("a")){
        System.out.println("Parabéns! Você acertou.");
        }
        else {
            chances --;
           
        if (chances > 0){
            System.out.println("Incorreto. Você ainda tem: " + chances + " chances.");
            }
        else {
            System.out.println("Você não tem mais chances. O jogo acabou.");
            return;
        }
    }
        System.out.println("Pergunta 2)\nQual a capital da Austrália? ");
        System.out.println("a)Sydney."); 
        System.out.println("b)Melbourne."); 
        System.out.println("c)Camberra."); 
        System.out.println("d)Perth."); 

        resposta2 = sc.next();

        if (resposta2.equalsIgnoreCase("c")){
            System.out.println("Parabéns! Você acertou.");
            }
        else {
            chances --;

        if (chances > 0){
            System.out.println("Incorreto. Você ainda tem: " + chances + " chances.");
            }
        else {
            System.out.println("Você não tem mais chances. O jogo acabou.");
            return;
        }
    }
    System.out.println("Pergunta 3)\nQuem é o ator principal do filme musical Grease(1978)? O astro de cinema também atuou em outras grandes produções como Os Embalos de Sábado à Noite(1977) e Pulp Fiction(1994), tendo sido indicado para o Oscar de Melhor Ator por ambos os filmes.");
        System.out.println("a)Silvester Stallone."); 
        System.out.println("b)John Travolta."); 
        System.out.println("c)Rodrigo Santoro."); 
        System.out.println("d)Patrick Swayze."); 

        resposta3 = sc.next();

        if (resposta3.equalsIgnoreCase("b")){
            System.out.println("Parabéns! Você acertou.");
            }
        else {
            chances --;

        if (chances > 0){
                System.out.println("Incorreto. Você ainda tem: " + chances + " chances.");
                }
         else {
                System.out.println("Você não tem mais chances. O jogo acabou.");
              return;}
            
         }
        System.out.println("Pergunta 4)\nA palavra TRIÂNGULO tem mais relação com qual dos assuntos a seguir? ");
        System.out.println("a)Astronomia."); 
        System.out.println("b)Geometria."); 
        System.out.println("c)Geologia."); 
        System.out.println("d)Psicologia."); 

        resposta4 = sc.next();

        if (resposta4.equalsIgnoreCase("b")){
            System.out.println("Parabéns! Você acertou.");
            }
        else {
            chances --;

        if (chances > 0){
                System.out.println("Incorreto. Você ainda tem: " + chances + " chances.");
                }
         else {
                System.out.println("Você não tem mais chances. O jogo acabou.");
              return;}
         }
            
        System.out.println("Pergunta 5)\nComplete a célebre frase de Beauvoir(1967): Ninguém nasce mulher, torna-se...");
        System.out.println("a)forte."); 
        System.out.println("b)resiliente."); 
        System.out.println("c)mulher."); 
        System.out.println("d)irredutível."); 

        resposta5 = sc.next();

        if (resposta5.equalsIgnoreCase("c")){
            System.out.println("Parabéns! Você acertou e ganhou o jogo!");
            }
        else {
            chances --;

        if (chances > 0){
                System.out.println("Incorreto. Mas parabéns, você ganhou o jogo! Pois ainda tem " + chances + " chances.");
                }
         else {
                System.out.println("Você não tem mais chances. O jogo acabou.");
              return;}
            }
        }
        }
    


        
    









      
    



