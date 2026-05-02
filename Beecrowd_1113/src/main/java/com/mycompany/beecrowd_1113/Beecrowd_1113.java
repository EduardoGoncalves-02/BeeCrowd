/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1113;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1113 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;

        do {
            x = scan.nextInt();
            y = scan.nextInt();

            if (x > y) {
                System.out.println("Decrescente");
            }
            if (x < y)  {
                System.out.println("Crescente");
            }
        } while (x != y);
    }
}
