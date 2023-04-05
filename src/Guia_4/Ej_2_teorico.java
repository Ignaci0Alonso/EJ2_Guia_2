package Guia_4;

import java.util.Scanner;

public class Ej_2_teorico {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese dos numeros.");
        int num = consola.nextInt(), num1 = consola.nextInt();
        if (verificarMultiplos(num, num1)) {
            System.out.println("El primero es multiplo del segundo.");
        } else {
            System.out.println("No son multiplos.");
        }

    }

    public static boolean verificarMultiplos(int num, int num1) {
        return num % num1 == 0;

    }
}
