/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1179;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1179 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] pares = new int[5];
        int[] impares = new int[5];

        int contadorPar = 0;
        int contadorImpar = 0;

        for (int i = 0; i < 15; i++) {

            int x = scan.nextInt();

            if (x % 2 == 0) {

                pares[contadorPar] = x;
                contadorPar++;

                if (contadorPar == 5) {

                    for (int j = 0; j < 5; j++) {
                        System.out.println("par[" + j + "] = " + pares[j]);
                    }

                    contadorPar = 0;
                }

            }
            else {

                impares[contadorImpar] = x;
                contadorImpar++;

                if (contadorImpar == 5) {

                    for (int j = 0; j < 5; j++) {
                        System.out.println("impar[" + j + "] = " + impares[j]);
                    }

                    contadorImpar = 0;
                }
            }
        }

        for (int i = 0; i < contadorImpar; i++) {
            System.out.println("impar[" + i + "] = " + impares[i]);
        }

        for (int i = 0; i < contadorPar; i++) {
            System.out.println("par[" + i + "] = " + pares[i]);
        }
    }
}
