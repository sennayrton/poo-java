/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion;

import java.util.Scanner;

/**
 *
 * @author sergio
 */
public class ej9 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Introduce un número:");
        num = entrada.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
