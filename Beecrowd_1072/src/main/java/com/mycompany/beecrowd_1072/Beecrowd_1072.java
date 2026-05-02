/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1072;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1072 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int contadorIn = 0;
        int contadorOut = 0;

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            if (x >= 10 && x <= 20) {
                contadorIn++;
            }else{
                contadorOut++;
            }
        }
        System.out.println(contadorIn + " in");
        System.out.println(contadorOut + " out");
    }
}
