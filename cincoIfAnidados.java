package com.mycompany.cincoifanidados;

/**
 *
 * @author cisco
 */
public class CincoIfAnidados {

    public static void main(String[] args) {
        
        int a = 15;
        int b = 26;
        int c = 17;

        // if anidado
        if (a > b) {
            if (a > c) {
                System.out.println("A es mayor");
            } else {
                System.out.println("C es mayor");
            }
        } else if (b > c) {
            System.out.println("B es mayor");
        } else {
            System.out.println("C es mayor");
        }
    }
}