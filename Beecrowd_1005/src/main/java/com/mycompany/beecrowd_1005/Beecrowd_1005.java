/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1005;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1005 {

    public static void main(String[] args) {
        double notaA;
        double notaB;
        double media;   
        
        Scanner scan = new Scanner(System.in);
        
        notaA = scan.nextDouble();
        notaB = scan.nextDouble();
        
        media = ((notaA*3.5)+(notaB*7.5))/11;
        
        System.out.printf("MEDIA = %.5f\n",media);
    }
}

