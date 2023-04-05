
package Guia_5;

import java.util.Scanner;

public class Ej_1_extra {
    /*
    Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
    con los valores ingresados por el usuario.
    */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = consola.nextInt();
                suma += matriz[i][j]; 
                
            }
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("(" + matriz[i][j] + ")" + " ");
            }
            System.out.println();
        }
        System.out.println("La suma de los elementos es = " + suma);
    }
}
