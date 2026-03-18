/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1014;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1014 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double km, litros, media;
        
        km = scan.nextDouble();
        litros = scan.nextDouble();
        media = km/litros;
        
        System.out.printf("%.3f km/l\n", media);
    }
}
