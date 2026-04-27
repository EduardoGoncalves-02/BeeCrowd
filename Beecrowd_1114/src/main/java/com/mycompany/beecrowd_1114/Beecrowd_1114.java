/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.beecrowd_1114;

import java.util.Scanner;

/**
 *
 * @author Adri
 */
public class Beecrowd_1114 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int senhaCorreta = 2002;

        while (1 < 2) {
            int senha = scan.nextInt();
            if (senha != senhaCorreta) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
                break;
            }
        }
    }
}
