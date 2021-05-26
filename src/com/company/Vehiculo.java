package com.company;

import java.util.Scanner;


public class Vehiculo {

    public final String referencia;
    private final int velocidadMaxima;
    private Color color;

    Scanner color_seleccionado = new Scanner(System.in);
    int seleccion_c;

    public Vehiculo(String referencia, int velocidadMaxima) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;

        do{
            System.out.println("Seleccione el color para el vehiculo");
            System.out.println("[1]NEGRO - [2]BLANCO - [3]AZUL - [4]VERDE - [5]GRIS");
            seleccion_c = color_seleccionado.nextInt();

            if (seleccion_c == 1) {
                this.color = Color.NEGRO;
            } else if (seleccion_c == 2) {
                this.color = Color.BLANCO;
            } else if (seleccion_c == 3) {
                this.color = Color.AZUL;
            } else if (seleccion_c == 4) {
                this.color = Color.VERDE;
            } else if (seleccion_c == 5) {
                this.color = Color.GRIS;
            } else {
                System.out.println("Seleccion incorrecta vuelva a escribir de 1 a 5");
            }
        }while(seleccion_c >5);

    }
    public int getvelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public Color getColor(){
        return this.color;
    }

    public String getReferencia(){
        return this.referencia;
    }

    /* Sobreescritura del .ToString */
    @Override
    public String toString(){
        return "Color: " + color + "\n" +
                "Referencia: " + referencia + "\n" +
                "Velocidad Maxima: " + velocidadMaxima + " km/h";

    }




}

