/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.beecrowd_1016;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Beecrowd_1016 {

    public static void main(String[] args) {

        int tempoQueSeAfastaUmQuilometro = 2;
        
        Scanner scan = new Scanner(System.in);
        int kilometros = scan.nextInt();
        int total = kilometros * tempoQueSeAfastaUmQuilometro;
        System.out.println(total + " minutos");
        
        
    }
}
