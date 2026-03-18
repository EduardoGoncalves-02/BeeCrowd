/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1001;


import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Beecrowd_1001 {

    public static void main(String[] args) {
        int A;
        int B;
        int X;
        
        Scanner scan = new Scanner(System.in);
        //Importante lembrar que o beecrowd só aceita se não tiver nenhum texto ou espaço em branco nas entradas.
        A = scan.nextInt();
        B = scan.nextInt();
        
        X = A + B;
        
        System.out.println("X = " + X);
        
    }
}
