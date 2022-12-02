package com.mycompany.catorcearrays;

/**
 *
 * @author cisco
 */
public class CatorceArrays {

    public static void main(String[] args) {
        
        /**
         * int[] numero;
         * numero = new int[3];
         * 
         * numero[0] = 16;
         * numero[1] = 26;
         * numero[2] = 36;
         * System.out.println(numero[1]);
         */

        int [] numeros = new int[10]; // Este es un array de 10 contenedores []
        
        for(int i = 0; i < 10; i++){
            
            numeros[i] = i;
            System.out.println(numeros[i]);
        }
    }
}