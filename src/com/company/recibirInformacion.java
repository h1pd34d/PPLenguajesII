package com.company;


import java.util.InputMismatchException;
import java.util.Scanner;

public class  recibirInformacion {

    Scanner teclado = new Scanner(System.in);
    String referencia;
    int velocidadMaxima;

    public Vehiculo empezar(int seleccion) {
        switch (seleccion) {
            case 1: {
                try {
                    int numeroDePuertas;

                    System.out.println("Escriba la referencia del carro");
                    referencia = teclado.next();

                    System.out.println("Escriba la velocidad maxima del carro (int)");
                    velocidadMaxima = teclado.nextInt();

                    System.out.println("Escriba el numero de puertas del carro (int)");
                    numeroDePuertas = teclado.nextInt();
                    Carro carro = new Carro.CarroBuilder().referencia(referencia).velocidadMaxima(velocidadMaxima).numeroDePuertas(numeroDePuertas).build();

                    return carro;

                } catch (InputMismatchException ex) {
                    System.out.println("no escribio un entero");
                    break;
                }
            }
            case 2: {
                int pesoMaximo;

                System.out.println("Escriba la referencia del Yate");
                referencia = teclado.next();
                try {
                    System.out.println("Escriba la velocidad maxima del yate (int)");
                    velocidadMaxima = teclado.nextInt();

                    System.out.println("Escriba el peso maximo del Yate (int)");
                    pesoMaximo = teclado.nextInt();

                    Yate yate = new Yate.YateBuilder().referencia(referencia).velocidadMaxima(velocidadMaxima).pesoMaximo(pesoMaximo).build();
                    return yate;

                } catch (InputMismatchException ex) {
                    System.out.println("no escribio un entero");
                    break;
                }
            }
            case 3: {
                int altitudMaxima;

                System.out.println("Escriba la referencia del Avion");
                referencia = teclado.next();
                try {
                    System.out.println("Escriba la velocidad maxima del Avion (int)");
                    velocidadMaxima = teclado.nextInt();

                    System.out.println("Escriba la altitud maxima del Avion (int)");
                    altitudMaxima = teclado.nextInt();

                    Avion avion = new Avion.AvionBuilder().referencia(referencia).velocidadMaxima(velocidadMaxima).altitudMaxima(altitudMaxima).build();
                    return avion;

                } catch (InputMismatchException ex) {
                    System.out.println("no escribio un entero");
                    break;
                }

            }

        }
        System.out.println("No selecciono una opcion correcta");
        return null;
    }
}