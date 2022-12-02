package com.mycompany.docewhileconif;

/**
 *
 * @author cisco
 */
public class DoceWhileConIF {

    public static void main(String[] args) {
        
        // Imprimir los numeros pares
        int n = 1;
        while (n <= 10){
            int resultado = n % 2;
            if(resultado == 0){
                System.out.println(n + " Este numero es par");
            }
            n++;
        }
    }
}