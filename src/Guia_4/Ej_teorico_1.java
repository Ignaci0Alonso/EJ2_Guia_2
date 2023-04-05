package Guia_4;

import java.util.Scanner;

public class Ej_teorico_1 {

    /*a@
e#
i$
o%
u*

     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese una oracion.");
        reemplazo(consola.nextLine());
    }

    public static void reemplazo(String vocales) {
        String rempl, letra = "", vocal=vocales.toLowerCase();
        for (int i = 0; i < (vocales.length()); i++) {
             switch (vocal.substring(i, i+1)){
                case "a":
                    rempl = vocal.substring(i, i+1).replace("a", "@");
                    letra = letra.concat(rempl);
                    break;
                case "e":
                    rempl = vocal.substring(i, i+1).replace("e", "#");
                    letra = letra.concat(rempl);
                    break;
                case "i":
                    rempl = vocal.substring(i, i+1).replace("i", "$");
                    letra = letra.concat(rempl);
                    break;
                case "o":
                    rempl = vocal.substring(i, i+1).replace("o", "%");
                    letra = letra.concat(rempl);
                    break;
                case "u":
                    rempl = vocal.substring(i, i+1).replace("u", "*");
                    letra = letra.concat(rempl);
                    break;
                default:
                    letra = letra.concat(vocal.substring(i, i+1));
                    break;
        }
        }
        System.out.println(letra);
                
    }
}
