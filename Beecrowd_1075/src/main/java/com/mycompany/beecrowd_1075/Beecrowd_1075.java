/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1075;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1075 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for(int i = 0; i <= 10000; i++){
            if(i % n == 2){
                System.out.println(i);
            }
        }
    }
}
