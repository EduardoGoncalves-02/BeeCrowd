/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1173;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1173 {

    public static void main(String[] args) {
        int [] n = new int [10];
        Scanner scan = new Scanner(System.in);
        n[0] = scan.nextInt();
        
        System.out.println("N[0] = " + n[0]);
        for(int i = 1; i < 10; i++){
            n[i] = n[i-1] * 2;
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}
