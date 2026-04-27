/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1070;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1070 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int consecutivo = 0;
        
        while(consecutivo < 6){
            if(x % 2 != 0){
                consecutivo ++;
                System.out.println(x);
                x ++;
            }
            x++;
        }
        
        
    }
}
