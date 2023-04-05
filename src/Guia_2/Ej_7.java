
package Guia_2;

import java.util.Scanner;

public class Ej_7 {

    public static void main(String[] args) {
        /*Escriba un programa que permita al usuario ingresar el valor de dos variables numéricas de
tipo entero. Posteriormente, el programa debe intercambiar los valores de ambas variables y
mostrar el resultado final por pantalla.
Por ejemplo, si el usuario ingresa los valores num1 = 9 y num2 = 3, la salida a del programa
deberá mostrar: num1 = 3 y num2 = 9
Ayuda: Para intercambiar los valores de dos variables se debe utilizar una variable auxiliar.
*/
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = consola.nextInt();
        System.out.println("Ingrese otro valor para que intercambien lugares");
        int num1 = consola.nextInt();
        int num2 = num;
        num=num1;
        num1=num2;
        System.out.println("El primer número inresado ahora vale: " + num);
        System.out.println("El segundo número ingresado ahora vale " + num1);
                
                
    }
    

}
