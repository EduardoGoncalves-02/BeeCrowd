/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1066;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1066 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            if (n != 0) {
                if (n > 0) {
                    positivo++;
                } else {
                    negativo++;
                }
            }
        }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    }
}
