package Guia_3;

import java.util.Scanner;

public class Ejercicio_7 {

    /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario.
Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X 
y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java 
     */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String contra;
        int correcto = 0;
        int incorrecto = 0;
        int intentos = 3;
        do {
            System.out.println("Ingrese una contraseña:");
            System.out.println("- De 5 o menos caracteres");
            System.out.println("- Que comienze con X/x");
            System.out.println("- Que termine con O/o");
            System.out.println("- Ingrese - &&&&& - para terminar");
            contra = consola.nextLine();
            if ("&&&&&".equalsIgnoreCase(contra)) {
                break;
            }
            if (contra.length()<=5 && contra.substring(0, 1).equalsIgnoreCase("x") && contra.substring(contra.length()-1,contra.length()).equalsIgnoreCase("o")){
              correcto++;  
            }else{
              incorrecto++;
            }
            /*if (contra.length() > 5 && !"X".equalsIgnoreCase(contra.substring(0, 0)) && !"O".equalsIgnoreCase(contra.substring(contra.length(), contra.length()))) {
                incorrecto = incorrecto + 1;
            } else {
                correcto = correcto + 1;
            }*/

        } while (!"&&&&&".equalsIgnoreCase(contra));
        System.out.println("Correctos: " + correcto);
        System.out.println("Incorrecto: " + incorrecto);
    }

}
/*public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        
        while (true) {
            System.out.print("Ingrese una cadena: ");
            String cadena = leer.nextLine();
            
            if (cadena.equals("&&&&&")) {
                break;
            }
            
            if (verificarFormato(cadena)) {
                correctas++;
            } else {
                incorrectas++;
            }
        }
        
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
        
        leer.close();
    }
    
    private static boolean verificarFormato(String cadena) {
        if (cadena.length() > 5 && cadena.charAt(0) != 'x' && cadena.charAt(cadena.length()) != 'o') {
            return false;
        }
        return true;
    }
}
 */
