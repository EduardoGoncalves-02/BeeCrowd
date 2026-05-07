/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1177;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1177 {

    public static void main(String[] args) {
        int vetor[] = new int[1000];
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        int valor = 0;
        
        for(int i = 0; i < 1000; i++){
            vetor[i] = valor;
            valor++;
            
            if(valor == t){
            valor = 0;
            }
            System.out.println("N[" + i + "] = " + vetor[i]);
        }
        
    }
}
