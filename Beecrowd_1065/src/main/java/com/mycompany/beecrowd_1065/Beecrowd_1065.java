/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1065;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1065 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            int n = scan.nextInt();
            if (n % 2 == 0) {
                contador++;
            }
        }
        System.out.println(contador + " valores pares");

    }
}
