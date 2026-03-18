/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1010;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1010 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int codigoUm = scan.nextInt();
        int quantidadeUm = scan.nextInt();
        double valorUm = scan.nextDouble();
        
        int codigoDois = scan.nextInt();
        int quantidadeDois = scan.nextInt();
        double valorDois = scan.nextDouble();
        
        double ValorTotal = (quantidadeUm * valorUm) + (quantidadeDois * valorDois);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",ValorTotal);
    }
}
