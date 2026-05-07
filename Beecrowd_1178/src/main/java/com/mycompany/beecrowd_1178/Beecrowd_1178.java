/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1178;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1178 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vetor[] = new double [100];
        double x = scan.nextDouble();
        
        vetor[0] = x;
        System.out.printf("N[0] = %.4f\n",x);
        
        for(int i = 1; i < 100; i++){
        vetor[i] = (vetor[i-1]/2);
        System.out.printf("N[%d] = %.4f\n",i,vetor[i]);
        }
        
    }
}
