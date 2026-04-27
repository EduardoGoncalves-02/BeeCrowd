/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1144;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1144 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        
        
        while (i <= n) {
            int iAoQuadrado = (int)Math.pow(i, 2), iAoCubo = (int)Math.pow(i, 3);
            System.out.println(i + " " + iAoQuadrado + " " + iAoCubo);
            System.out.println(i + " " + (iAoQuadrado + 1) + " " + (iAoCubo + 1));
            i++;

        }
    }
}
