/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1176;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1176 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        
        long [] fibonacci = new long[61];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i = 2; i <= 60 ; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        
        for(int i = 0; i < t; i++){
            int n = scan.nextInt();
            System.out.println("Fib(" + n + ") = " + fibonacci[n]);
        }
    }
}
