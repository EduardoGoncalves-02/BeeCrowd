/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1180;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1180 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int vetor[] = new int[n];
        int menor = 0;
        
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            vetor[i] = x;
            if(vetor[menor] > vetor[i]){
                menor = i;
            }
        }
        System.out.println("Menor valor: " + vetor[menor]);
        System.out.println("Posicao: " + menor);
    }
}
