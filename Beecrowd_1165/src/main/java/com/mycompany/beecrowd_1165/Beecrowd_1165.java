/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1165;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1165 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            boolean primo = true;
                
            for (int j = 2; j <= Math.sqrt(x); j++) {
                if (x % j == 0) {
                    primo = false;
                }

            }
            if (primo && x != 1) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }
    }

}
