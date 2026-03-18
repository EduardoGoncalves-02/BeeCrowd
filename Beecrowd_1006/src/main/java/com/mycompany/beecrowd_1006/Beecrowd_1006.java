/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1006;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1006 {

    public static void main(String[] args) {
        double A;
        double B;
        double C;
        double media;
        
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextDouble();
        B = scan.nextDouble();
        C = scan.nextDouble();
        
        media = ((A*2)+(B*3)+(C*5))/10;
        
        System.out.printf("MEDIA = %.1f\n", media);
    }
}
