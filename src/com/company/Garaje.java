package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Garaje {
    private ArrayList<Vehiculo> garaje = new ArrayList<Vehiculo>();
    Scanner teclado = new Scanner(System.in);
    private Object Vehiculo;

    public void agg(){
        if(garaje.size() < 10){
            int seleccion;
            String referencia;
            int velocidadMaxima;

            System.out.println("Seleccione el tipo de vehiculo /n");
            System.out.println("[1]Carro - [2]Yate - [3]Avion");
            seleccion = teclado.nextInt();
            if(seleccion == 1){
                int numeroDePuertas;

                System.out.println("Escriba la referencia del carro");
                referencia = teclado.next();
                try {
                    System.out.println("Escriba la velocidad maxima del carro (int)");
                    velocidadMaxima = teclado.nextInt();

                    System.out.println("Escriba el numero de puertas del carro (int)");
                    numeroDePuertas = teclado.nextInt();

                    Carro carro = new Carro(referencia,velocidadMaxima,numeroDePuertas);
                    garaje.add(carro);

                }catch (InputMismatchException ex){
                    System.out.println("no escribio un entero");
                }

            }
            else if(seleccion == 2){
                int pesoMaximo;

                System.out.println("Escriba la referencia del Yate");
                referencia = teclado.next();
                try {
                    System.out.println("Escriba la velocidad maxima del yate (int)");
                    velocidadMaxima = teclado.nextInt();

                    System.out.println("Escriba el peso maximo del Yate (int)");
                    pesoMaximo = teclado.nextInt();

                    Yate yate = new Yate(referencia,velocidadMaxima,pesoMaximo);
                    garaje.add(yate);

                }catch (InputMismatchException ex){
                    System.out.println("no escribio un entero");
                }
            }

            else if (seleccion == 3){
                int altitudMaxima;

                System.out.println("Escriba la referencia del Avion");
                referencia = teclado.next();
                try {
                    System.out.println("Escriba la velocidad maxima del Avion (int)");
                    velocidadMaxima = teclado.nextInt();

                    System.out.println("Escriba la altitud maxima del Avion (int)");
                    altitudMaxima = teclado.nextInt();

                    Avion avion = new Avion(referencia,velocidadMaxima,altitudMaxima);
                    garaje.add(avion);


                }catch (InputMismatchException ex){
                    System.out.println("no escribio un entero");
                }


            }
            else{
                System.out.println("No selecciono una opcion correcta");
            }

        }
        else{
            System.out.println("El Garaje esta lleno");
        }

    }

    public void verGaraje(){
        if(garaje.size() > 0) {
            for (Vehiculo  vehiculo: garaje){
                System.out.println("-------------------------------");
                System.out.println(vehiculo);
                System.out.println("-------------------------------");
            }
        }
        else{
            System.out.println("El Garaje esta vacio");
        }
    }

}
