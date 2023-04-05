
package Guia_3;

import java.util.Scanner;

public class EJ_extra_1_dias {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        int dias=0,horas = 0, minutos = consola.nextInt();
        /*if (minutos>=60){
        horas = (minutos/60);
        minutos = minutos - (horas*60);
        }
        if (horas>=24){
            dias = (horas/24);
            horas = horas - (dias*24);
        }
        System.out.println("Son :");*/
        dias=(minutos/1440);
        horas=(minutos%1440)/60;
        minutos=(minutos%1440)%60;
        System.out.println(dias + " dias, " + horas + " horas, " + minutos + "minutos.");
    }
/*Cantidad de días = minutos / 1440 (1 día tiene 1440 minutos)
Cantidad de horas = (minutos % 1440) / 60 (1 hora tiene 60 minutos)*/
}
