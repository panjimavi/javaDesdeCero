package com.mycompany.dieciseisarrays2;

/**
 *
 * @author cisco
 */
public class DieciseisArrays2 {

    public static void main(String[] args) {
        
        int[] datos = new int[10];
        int resultado = 0;
        
        for(int i = 0; i < 10; i++){
            
            datos[i] = (int) (Math.random() * 9); // Math.random nos entrega numeros al azar 
            resultado = resultado + datos[i];
            System.out.println(datos[i]);
        }
        
        System.out.println("La suma de los valores es: " + resultado);
    }
}