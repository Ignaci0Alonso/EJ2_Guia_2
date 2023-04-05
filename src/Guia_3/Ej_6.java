package Guia_3;

import java.util.Scanner;

public class Ej_6 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean logoff = false;
        System.out.println("Ingrese dos numeros");
        double num = consola.nextInt();
        double num1 = consola.nextInt();
        String confirm;
        do {
            double res;
            System.out.println("Menu:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int opcion = consola.nextInt();
            switch (opcion) {
                case 1:
                    res = num + num1;
                    System.out.println("La operacion es: " + num + " + " + num1 + " = " + res);
                    break;
                case 2:
                    res = num - num1;
                    System.out.println("La operacion es: " + num + " - " + num1 + " = " + res);
                    break;
                case 3:
                    res = num * num1;
                    System.out.println("La operacion es: " + num + " * " + num1 + " = " + res);
                    break;
                case 4:
                    res = num / num1;
                    System.out.println("La operacion es: " + num + " / " + num1 + " = " + res);
                    break;
                case 5:
                    System.out.println("Seguro que quiere salir? s/n");
                    confirm = consola.next();

                    if (confirm.equalsIgnoreCase("s")) {
                        System.out.println("Adios.");
                        logoff = true;
                    }
                    break;
                default:

                    System.out.println("Opcion no valida");
                    break;
            }
        } while (logoff != true);
    }

}
