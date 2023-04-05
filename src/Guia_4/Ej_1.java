package Guia_4;

import java.util.Scanner;

public class Ej_1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean end=true;
        System.out.println("Ingrese dos numeros.");
        int num = consola.nextInt(), num1 = consola.nextInt();

        while (end) {
            System.out.println("Menu: ");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.println("Otro) Salir");
            int op = consola.nextInt();
            double res;
            switch (op) {
                case 1:
                    res = sumar(num, num1);
                    System.out.println("El resultado de la operacion es:");
                    System.out.println(num + " + " + num1 + " = " + res);
                    break;
                case 2:
                    res = restar(num, num1);
                    System.out.println("El resultado de la operacion es:");
                    System.out.println(num + " - " + num1 + " = " + res);
                    break;
                case 3:
                    res = multiplicar(num, num1);
                    System.out.println("El resultado de la operacion es:");
                    System.out.println(num + " * " + num1 + " = " + res);
                    break;
                case 4:
                    res = dividir(num, num1);
                    System.out.println("El resultado de la operacion es:");
                    System.out.println(num + " / " + num1 + " = " + res);
                    break;
                default:
                    end = false;
                    break;
            }

        }
    }

    public static int restar(int num, int num1) {
        int res = num - num1;
        return res;
    }

    public static int multiplicar(int num, int num1) {
        int res = num * num1;
        return res;
    }

    public static double dividir(int num, int num1) {
        double res = num / num1;
        return res;
    }

    public static int sumar(int num, int num1) {
        int res = num + num1;
        return res;
    }
}
