/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1007;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1007 {

    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int DIFERENCA;
        
        Scanner scan = new Scanner(System.in);
        
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        D = scan.nextInt();
        
        DIFERENCA = (A*B)-(C*D);
        
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}

