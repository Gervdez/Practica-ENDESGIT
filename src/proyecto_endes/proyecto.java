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
       factorial();
    }
    
    public static void factorial(){
        long factorial=1;
        int num=4;
        for (int i = num; i > 0; i--) {
            factorial*=i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
