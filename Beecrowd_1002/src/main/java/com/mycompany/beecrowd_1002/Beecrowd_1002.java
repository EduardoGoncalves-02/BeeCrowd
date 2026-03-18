/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1002;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1002 {

    public static void main(String[] args) {
        double r;
        double n;
        double rAoQuadrado;
        double area;
        
        Scanner scan = new Scanner(System.in);
        
        n = 3.14159;
        r = scan.nextDouble();
        rAoQuadrado = Math.pow(r, 2);
        
        area = n * rAoQuadrado;
        
        System.out.printf("A=%.4f\n",area);
    }
}

