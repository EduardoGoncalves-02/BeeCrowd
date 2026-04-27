/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1078;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1078 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (2 < n && n < 1000) {
            for (int i = 1; i <= 10; i++) {
                int produto = n * i;
                System.out.println(i + " x " + n + " = " + produto);
            }
        }
    }
}
