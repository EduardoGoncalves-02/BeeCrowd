/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1149;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1149 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(), N = scan.nextInt(), soma = 0;

        while (N <= 0) {
            N = scan.nextInt();
        }
        for (int i = 0; i < N; i++) {
            soma = soma + (A + i);
        }
        System.out.println(soma);

    }
}
