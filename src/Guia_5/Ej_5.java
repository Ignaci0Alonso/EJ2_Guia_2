
package Guia_5;

import java.util.Scanner;

public class Ej_5 {

    public static void main(String[] args) {
        
        int[][] matriz = new int [3][3];
                
        rellenar(matriz);
      
        transpuesta(matriz);
            
            
    }
    public static void rellenar(int[][] A) {
        Scanner consola = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = consola.nextInt();
            }
        }
    }
    public static void transpuesta(int[][] A) {
        boolean trn = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j] + -A[j][i] == 0) {
                    trn = true;
                }else {
                    trn= false; 
                    break;
                }
            }
        }
        if (trn) {
            System.out.println("antisimetrica.");
            
        }else{
            System.out.println("no es antisimetrica.");
        }
        
    }
}
