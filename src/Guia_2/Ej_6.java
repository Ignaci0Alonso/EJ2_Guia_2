package Guia_2;

import java.util.Scanner;

public class Ej_6 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el radio de una circunferencia");
        int radio = consola.nextInt();
        double area = Math.PI * (radio * radio);
        double peri = 2 * Math.PI * radio;

        System.out.println("El area del area de la circunferencia, segun el radio, es: " + area);
        System.out.println("El area del perimetro de la circunferencia, segun el radio, es: " + peri);
    }
    /*Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio de
una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para
calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2
perimetro = 2 * PI * radio
     */
}
