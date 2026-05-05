/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1174;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1174 {

    public static void main(String[] args) {
        double[] a = new double [100];
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 100; i++){
            a[i] = scan.nextDouble();
            if(a[i] <= 10){
                System.out.println("A[" + i + "] = " + a[i]);
            }
        }
    }
}
