/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1013;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1013 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a, b, c, maiorAB, maior;
        
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        maiorAB = ((a+b)+Math.abs(a-b))/2;
        maior = ((maiorAB+c)+Math.abs(maiorAB-c))/2;
        
        System.out.println(maior + " eh o maior");
        
    }
}
