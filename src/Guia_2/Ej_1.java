package Guia_2;

import java.util.Scanner;

public class Ej_1 {

    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Ingrese un numero");
        Scanner leer = new Scanner(System.in);
        num1 = leer.nextByte();
        System.out.println("Ingrese otro numero");
        num2 = leer.nextByte();
        int suma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + suma);
    }
}
