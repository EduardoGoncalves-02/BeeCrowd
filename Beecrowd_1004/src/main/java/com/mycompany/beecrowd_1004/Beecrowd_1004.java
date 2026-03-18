/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1004;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1004 {

    public static void main(String[] args) {
        
        int A;
        int B;
        int PROD;
        
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        B = scan.nextInt();
        PROD = A*B;
        
        System.out.println("PROD = " + PROD);
    }
}

