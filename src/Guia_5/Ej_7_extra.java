package Guia_5;

import java.util.Scanner;

public class Ej_7_extra {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese cuantos numeros quiere ver.");
        int[] vector = new int[consola.nextInt()];
        int num = 1, num1 = 0, res = 0;
        fibonacci(num, num1, res, vector);
        mostrarFibonacci(vector);

    }

    public static void fibonacci(int num1, int num0, int res, int[] fibo) {
        for (int i = 0; i < fibo.length; i++) {
            fibo[i] = num1;
            res = num1 + num0;
            num0 = num1;
            num1 = res;
        }
    }

    public static void mostrarFibonacci(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("(" + vector[i] + ") ");
        }
        
    }
}
