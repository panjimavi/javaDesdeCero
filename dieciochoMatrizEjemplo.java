package com.mycompany.dieciochomatrizejemplo;

/**
 *
 * @author cisco
 */
public class DieciochoMatrizEjemplo {

    public static void main(String[] args) {
        
        int[][] numero = new int[10][10];
        
        for(int i = 0; i < 10; i++){
            
            for(int j = 0; j < 10; j++){
                
                numero[i][j] = (int) (Math.random() *9);
                System.out.print(numero[i][j] + " ");
            }
            
            System.out.println();
        }
        
        System.out.println("El numero en la posición Fila [2] Columna [5] es: " + numero[2][5]);
    }
}