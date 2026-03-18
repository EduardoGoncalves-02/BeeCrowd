/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1008;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1008 {

    public static void main(String[] args) {
        int numero;
        int horas;
        double valorDasHoras;
        double salario;
        
        Scanner scan = new Scanner(System.in);
        
        numero = scan.nextInt();
        horas = scan.nextInt();
        valorDasHoras = scan.nextDouble();
        
        salario = horas * valorDasHoras;
        
        System.out.println("NUMBER = "+numero);
        System.out.printf("SALARY = U$ %.2f\n",salario);
        
    }
}
