/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_endes;

import java.util.Scanner;

/**
 *
 * @author Gervasio
 */
public class proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long factorial=1;
        int n;
        Scanner numero = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        n = numero.nextInt();
        for (int i = n; i > 0; i--) {
            factorial*=i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}
