/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1009;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1009 {

    public static void main(String[] args) {
        String nome;
        double fixo;
        double vendas;
        double salario;
        
        Scanner scan = new Scanner(System.in);
        
        nome = scan.nextLine();
        fixo = scan.nextDouble();
        vendas = scan.nextDouble();
        
        salario = fixo + (vendas * 0.15);
        
        System.out.printf("TOTAL = R$ %.2f\n",salario);
    }
}

