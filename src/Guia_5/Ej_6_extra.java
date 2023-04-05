package Guia_5;

import java.util.Random;
import java.util.Scanner;

public class Ej_6_extra {

    public static void main(String[] args) {
        String[] vector = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[][] sopa = new String[20][20];
        insertarPalabra(sopa);
        rellenarSopa(vector, sopa);
        mostrarSopa(sopa);
    }

    public static void rellenarSopa(String[] letra, String[][] sopa) {
        Random aleatorio = new Random();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j].equals("*")) {
                    int num = aleatorio.nextInt(25 - 1 + 1) + 1;
                    sopa[i][j] = letra[num];
                }else{
                    //        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 20; j++) {
//                if(sopa[i][j].equals(".")){
//                abc = (char) (Math.random() * (122 - 97 + 1) + 97);
//                sopa[i][j] = String.valueOf(abc);
//                }
//            }
//
//        }
                }
            }
        }
    }

    public static void insertarPalabra(String[][] sopa) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j] = "*";
            }
        }
        Scanner consola = new Scanner(System.in);
        Random aleatorio = new Random();
        String respuesta;
        int num, num1;
        do {
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese una palabra de hasta 5 letras. \n -Letra por letra \n -Si tiene menos de 5 letras ingrese una letra aleatoria en los espacios vacios.");
                do {
                    num = aleatorio.nextInt(14 - 0 + 1) + 0;
                    num1 = aleatorio.nextInt(14 - 0 + 1) + 0;

                } while (!sopa[num][num1].equals("*") && i != 0);

                for (int j = 0; j < 5; j++) {

                    if (i == 0) {
                        System.out.println("Ingrese una letra de su palabra.");
                        sopa[num][num1] = consola.next();
                        num1++;
                    }
                    if (i == 1) {
                        System.out.println("Ingrese una letra de su palabra.");
                        sopa[num][num1] = consola.next();
                        num++;
                    }
                    if (i == 2) {
                        System.out.println("Ingrese una letra de su palabra.");
                        sopa[num][num1] = consola.next();
                        num++;
                        num1++;
                    }
                }

            }
            System.out.println("Desea ingresar 3 palabras más? \n Escriba no/NO para detenerse.");
            respuesta = consola.next();
        } while (!respuesta.equalsIgnoreCase("no"));
    }

    public static void mostrarSopa(String[][] sopa) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
