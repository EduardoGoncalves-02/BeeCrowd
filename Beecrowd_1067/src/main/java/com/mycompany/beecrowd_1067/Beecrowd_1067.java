/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1067;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1067 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int i = 1;
       
        if(1 <= x && x <= 1000){
            while(i <= x){
                if(i % 2 != 0){
                    System.out.println(i);
                }
                i++;
            }
    }
    }
}
