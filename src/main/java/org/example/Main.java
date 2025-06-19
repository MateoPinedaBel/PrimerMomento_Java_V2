package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*
        PROBLEMA:
        Si se suponen años de 365 días y se genera una edad de una persona *** Aleatoriamente ***
        entre 18 y 50 años, mostrar la edad en meses y días.
         */

        // Instanciar Clases

        Random random = new Random();

        // Datos de Entrada

        byte edadAnos;

        // Datos de Salida

        short edadMeses;
        short edadDias;

        // Constantes

        byte ANO_A_MES = 12;
        short ANO_A_DIA = 365;

        // Proceso

        // random.nextInt(33) genera un número entre 0 y 32. Al sumarle 18, el rango resultante es de 18 a 50.
        edadAnos = (byte) (random.nextInt(33) + 18);

        // Convertir Años a Meses y Años a Días.

        edadMeses = (short) (edadAnos * ANO_A_MES);
        edadDias =  (short) (edadAnos * ANO_A_DIA);

        // Visualización para el Usuario

        System.out.print("\n La Edad Generada es: "+edadAnos+" Años.");
        System.out.print("\n En meses, "+edadMeses + " Meses.");
        System.out.print("\n Y en Días, "+edadDias + " Dias.");

    }
}