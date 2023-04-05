
package Guia_5;

public class Ej_4 {
/*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
    La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
    */
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        transpuesta(matriz);
    }
    public static void transpuesta(int[][] matriz) {
        int[][] B = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.arraycopy(matriz[i], 0, B[i], 0, 3);
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = B[j][i];
                System.out.print(matriz[i][j] + " ");
                //System.out.println(matriz[j][i]);
            }
            System.out.println("");
        }
    }
}
