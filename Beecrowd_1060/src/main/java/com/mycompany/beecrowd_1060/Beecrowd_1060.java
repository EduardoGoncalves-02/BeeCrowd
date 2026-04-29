/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1060;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1060 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contagem = 0;
        
        for (int i = 0; i < 6; i++) {
            double n = scan.nextDouble();
            if(n > 0){
                contagem ++;
            }
        }
        System.out.println(contagem + " valores positivos");
    }
}
