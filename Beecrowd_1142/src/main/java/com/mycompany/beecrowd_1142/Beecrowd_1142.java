/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1142;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1142 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), i = 1;
        
        while(i <= (n * 4)){
            System.out.println(i + " " + (i+1) + " " + (i + 2) + " PUM");
            i += 4;
        }
    }
}
