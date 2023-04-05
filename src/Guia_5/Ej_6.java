
package Guia_5;

import java.util.Scanner;

public class Ej_6 {

    public static void main(String[] args) {
        int[][] matriz = new int [3][3];
        rellenar(matriz);
        validar(matriz);
    }
    public static void rellenar(int[][] matriz) {
        Scanner consola = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println("Ingrese un numero:");
                    matriz[i][j] = consola.nextInt();
                    if (matriz[i][j]>9 || matriz[i][j]<1) {
                        System.out.println("Numero no valido, intente denuevo.");
                    }
                } while (matriz[i][j]>9 || matriz[i][j]<1);
            }
        }
    }
    public static void validar(int[][] matriz) {
       int vector[] = new int[3];
       int  valido = 0, cont = 0, contf=0;
       
        for (int i = 0; i < 3; i++) {
            int suma=0;
            for (int j = 0; j < 3; j++) {
                if (i==0) {
                    vector[j] = matriz[i][j];
                    valido = vector[j]+valido;
                }else{
                vector[j] = matriz[i][j]; 
                suma = vector[j]+suma;
                }
            }
            if (i!=0 && suma==valido) {
                cont++;
            }else{
                contf++;
            }
        }
        if (contf>1) {
            System.out.println("no es valida.");
        }else{
            System.out.println("es valida.");
        }
            
    }
}
