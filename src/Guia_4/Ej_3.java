
package Guia_4;

import java.util.Scanner;

public class Ej_3 {
/*
    * 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

    */
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        boolean end = true;
        while(end){
            System.out.println("Ingrese un total de euros.");
            double euros = consola.nextDouble();
            System.out.println("Menu:");
            System.out.println("1) Convertir a libras");
            System.out.println("2) Convertir a dolar");
            System.out.println("3) Convertir a yenes");
            System.out.println("Otro) Salir");
            int op = consola.nextInt();
            switch(op){
                case 1: 
                    conlibra(euros);
                    break;
                case 2:
                    condolar(euros);
                    break;
                case 3:
                    conyen(euros);
                    break;
                default:
                    end = false;
                    
            }
        }
        
        
    }
    public static void conlibra(double euro){
        double libra = euro * 0.86;
        String libras = Double.toString(libra);
        System.out.println(euro + " euros = " + libras + " libras.");
    }
    public static void condolar(double euro){
        double dolar = euro * 1.28611;
        String dolares = Double.toString(dolar);
        System.out.println(euro + " euros = " + dolares + " dolares.");
    }
    public static void conyen(double euro){
        double yenes = euro * 129.852;
        String yen = Double.toString(yenes);
        System.out.println(euro + " euros = " + yen + " yenes. ");
        
    }

}
