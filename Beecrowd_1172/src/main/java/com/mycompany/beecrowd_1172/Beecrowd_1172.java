/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1172;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1172 {

    public static void main(String[] args) {
        int[] x = new int[10];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            x[i] = scan.nextInt();
            if (x[i] < 1) {
                x[i] = 1;
            }
            System.out.println("X[" + i + "] = " + x[i]);
        }
    }
}
