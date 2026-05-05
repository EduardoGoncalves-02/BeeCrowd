/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1175;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1175 {

    public static void main(String[] args) {
        int[] n = new int[20];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            n[i] = scan.nextInt();
        }

        int j = 19;
        for (int i = 0; i < 10; i++) {
            int aux = n[i];
            n[i] = n[j];
            n[j] = aux;
            j--;
        }
        
        for(int i = 0; i < 20; i++){
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}
