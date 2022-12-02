package com.mycompany.diezforejemplo;

/**
 *
 * @author cisco
 */
public class DiezForEjemplo {

    public static void main(String[] args) {
        
        int numero = 7;
        
        for(int n = 1; n <= 10; n++){
            
            int resultado = numero * n;
            System.out.println(numero + " * " + n + " = " + resultado);
        }
    }
}