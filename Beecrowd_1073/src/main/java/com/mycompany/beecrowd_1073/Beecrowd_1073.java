/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1073;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1073 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                System.out.println(i + "^2 = " + (int) Math.pow(i,2));
            }
        }
        
        
    }
}
