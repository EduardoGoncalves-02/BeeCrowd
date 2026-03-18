/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1011;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1011 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double pi = 3.14159;
        double raio = scan.nextDouble();
        double raioAoCubo = Math.pow(raio,3);
        double formula = (4/3.0) * pi * raioAoCubo;
        
        System.out.printf("VOLUME = %.3f\n", formula);
        
    }
}
