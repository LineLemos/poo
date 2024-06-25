package com.poo.introducao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Lista04 {

    public void ex1() {

        double[] vendasDia = { 10.50, 2.80, 6.20, 8.00, 5.90, 3.50 };
        double totalVendas = 0;

        for (double vendas : vendasDia) {
            totalVendas += vendas;

        }

        System.out.println("A soma das vendas do dia é: R$" + String.format("%.2f", totalVendas));
    }

    public void ex2() {

        double[] vendasDia = { 10.50, 2.80, 6.20, 8.00, 5.90, 3.50 };
    
          System.out.println("A maior venda foi: R$" + identificaNumeroMaior(vendasDia));
          System.out.println("A menor venda foi: R$" + identificaNumeroMenor(vendasDia));
    }
      double identificaNumeroMaior(double[] lista){
          double numeroMaior = 0;
          for(double item : lista) {
              if(item > numeroMaior) {
                  numeroMaior = item;
              }
          }
          return numeroMaior;
      }
      double identificaNumeroMenor(double[] lista){
          double numeroMenor = 0;
          for(double item : lista) {
              if(item < numeroMenor) {
                  numeroMenor = item;
              }
          }
          return numeroMenor;
      }
    
    public void ex3(){
        
        double[] vendasDia = { 10.50, 2.80, 6.20, 8.00, 5.90, 3.50 };
        double totalVendas = 0;
        double media;

        for (double vendas : vendasDia) {
            totalVendas += vendas;
        }

        media = (totalVendas / vendasDia.length);

        System.out.println("A média do total de vendas do dia foi: R$" + String.format("%.2f", media));

    }

    public void ex4(){
        
        int[] lista = {3,5,6,7,8,10,22,55,110};

        for(int num : lista) {
            if(num%2 == 0 ){
                System.out.print(num + " ");
            }
        }
    }

    }
    public void ex5(){

        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        HashSet<String> mercado = new HashSet<String>();

        mercado.add("pão");
        mercado.add("leite");
        mercado.add("manteiga");

        while(true){
        System.out.println("-- MENU --");
        System.out.println("1. Ver lista");
        System.out.println("2. Adicionar item");
        System.out.println("3. Sair");
        System.out.println("Pressione o número da opção desejada.");
        int resposta = sc.nextInt();

        if(resposta == 1){
            System.out.println(mercado);

        }else if (resposta ==2){
            System.out.println("Adicione um item: ");
            String item = scs.next();
            mercado.add(item);
            System.out.println("Sua lista de mercado agora é: " + mercado);

        }else if (resposta ==3){
            System.out.println("Saindo...");
            break;

        }else{
            System.out.println("Digite um número válido");
        }
    }
}

    public void ex6(){

        Scanner sc = new Scanner(System.in);
        Scanner scs = new Scanner(System.in);

        HashSet<String> mercado = new HashSet<String>();

        mercado.add("pão");
        mercado.add("leite");
        mercado.add("manteiga");
        mercado.add("pão");
        
        while(true){
        System.out.println("-- MENU --");
        System.out.println("1. Ver lista");
        System.out.println("2. Adicionar item");
        System.out.println("3. Remover item");
        System.out.println("4. Sair");
        System.out.println("Pressione o número da opção desejada.");
        int resposta = sc.nextInt();

        if(resposta == 1){
            System.out.println(mercado);
           
        }else if (resposta ==2){
            System.out.println("Adicione um item: ");
            String item = scs.next();
            mercado.add(item);
            System.out.println("Sua lista de mercado agora é: " + mercado);
            
        }else if (resposta ==3){
            System.out.println(mercado);
            System.out.println("Qual item deseja remover?");
            String remover = scs.next();
            mercado.remove(remover);
            System.out.println("Sua lista agora é:" + mercado);

        }else if (resposta ==4){
            System.out.println("Saindo...");
            break;

        }else{
            System.out.println("Digite um número válido");
        }
       
    }
}
    public void ex7(){

        HashMap<String, Double > mercado = new HashMap<String, Double>();

        mercado.put("pão", 5.99);
        mercado.put("leite", 4.20);
        mercado.put("manteiga", 10.10);

        System.out.println("Sua lista é: " +  mercado);


    }
    public void ex8(){




    }

