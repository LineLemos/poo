package com.poo.introducao;

import java.util.Scanner;

public class Lista04 {

    public void ex1(){

   double[] vendasDia = {10.50, 2.80, 6.20, 8.00, 5.90, 3.50};
    double totalVendas = 0;

        for (double vendas : vendasDia){
        totalVendas += vendas;
        
    }

        System.out.println("A soma das vendas do dia é: R$" + String.format("%.2f", totalVendas));
    }

}
