/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1012;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1012 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Double A = scan.nextDouble();
        Double B = scan.nextDouble();
        Double C = scan.nextDouble();
        Double RaioC  = Math.pow(C,2);
        
        Double Triangulo = (A*C)/2;
        Double Circulo = 3.14159 * RaioC;
        Double Trapezio = ((A+B)*C)/2;
        Double Quadrado = B*B;
        Double Retangulo = A*B;
        
       System.out.printf("TRIANGULO: %.3f\n", Triangulo);
       System.out.printf("CIRCULO: %.3f\n", Circulo);
       System.out.printf("TRAPEZIO: %.3f\n", Trapezio);
       System.out.printf("QUADRADO: %.3f\n", Quadrado);
       System.out.printf("RETANGULO: %.3f\n", Retangulo);
    }
}
