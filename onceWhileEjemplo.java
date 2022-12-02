package com.mycompany.oncewhileejemplo;

/**
 *
 * @author cisco
 */
public class OnceWhileEjemplo {

    public static void main(String[] args) {

        int numero = 5;
        int n = 1;

        while (n <= 10) {
            int resultado = numero * n;
            System.out.println(numero + " * " + n + " = " + resultado);
            n++;
        }
    }
}