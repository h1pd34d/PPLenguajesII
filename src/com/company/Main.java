package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int sw = 0;
        Garaje garaje = new Garaje();

        do {

            System.out.println("\nMENU");
            System.out.println("[1] AGREGAR VEHICULO");
            System.out.println("[2] MOSTRAR VEHICULOS");
            System.out.println("[3] SALIR");

            sw =teclado.nextInt();

            switch (sw) {
                case 1:
                    garaje.agg();
                    sw = 0;
                    break;

                case 2:
                    garaje.verGaraje();
                    sw = 0;
                    break;

                case 3:
                    break;
            }
        }while(sw != 3);

    }



}
