/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1094;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1094 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt(); int coelho = 0; double rato = 0; double sapo = 0; double cobaias = 0;
        
        
        for(int i = 0; i < n; i++){
            int quantia = scan.nextInt();
            String tipo = scan.next();
            cobaias += quantia;
            
            switch(tipo){
                case "C": 
                    coelho += quantia;
                    break;
                case "R": 
                    rato += quantia;
                    break;
                case "S": 
                    sapo += quantia;
                    break;
            }
        }
        System.out.println("Total: " + (int)cobaias + " cobaias");
        System.out.println("Total de coelhos: " + (int)coelho);
        System.out.println("Total de ratos: " + (int)rato);
        System.out.println("Total de sapos: " + (int)sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (coelho/cobaias*100));
        System.out.printf("Percentual de ratos: %.2f %%\n", (rato/cobaias*100));
        System.out.printf("Percentual de sapos: %.2f %%\n", (sapo/cobaias*100));
        
    }
}
