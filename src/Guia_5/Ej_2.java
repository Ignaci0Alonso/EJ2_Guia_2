
package Guia_5;

import java.util.Random;
import java.util.Scanner;

public class Ej_2 {

    public static void main(String[] args) {
        int[] num;
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el largo del vector:");
        num = new int[consola.nextInt()];
        numeros(num);
        System.out.println("Ingrese el numero que desea buscar:");
        int op = consola.nextInt();
        adivinar(op,num);
    }
    public static void numeros(int[] num){
        Random aleatorio = new Random();
        
        for (int i = 0; i < num.length; i++) {
            num[i] = aleatorio.nextInt(10 - 1 + 1) + 1;
            System.out.print(num[i] + " ");
        }
        System.out.println("");
    }
    public static void adivinar(int op,int[] num) {
        int cont = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == op) {
                cont++;
                System.out.println("El numero se encontro en: vector[" + i + "]");
            }
        }
        if (cont==0){
            System.out.println("El numero no se encontraba en el arreglo.");
        }
        System.out.println("Fue encontrado " + cont + " veces");
    }
}
