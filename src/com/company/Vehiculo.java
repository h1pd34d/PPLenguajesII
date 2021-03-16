package com.company;
import java.util.Scanner;



public class Vehiculo {
    Scanner color_seleccionado = new Scanner(System.in);
    int seleccion;
    private Color color;
    private final String referencia;
    private final int velocidadMaxima;


    public Vehiculo(String referencia, int velocidadMaxima) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;

        System.out.println("Seleccione el color para el vehiculo");
        System.out.println("[1]NEGRO - [2]BLANCO - [3]AZUL - [4]VERDE - [5]GRIS");
        seleccion = color_seleccionado.nextInt();

        if (seleccion == 1){
            this.color = Color.NEGRO;
        }
        else if (seleccion == 2){
            this.color = Color.BLANCO;
        }
        else if (seleccion == 3){
            this.color = Color.AZUL;
        }
        else if (seleccion == 4){
            this.color = Color.VERDE;
        }
        else if (seleccion == 5){
            this.color = Color.GRIS;
        }
        else{
            System.out.println("Seleccion Invalida");
        }

    }

    /* Sobreescritura del .ToString */
    @Override
    public String toString(){
        return "Color: " + color + "\n" +
                "Referencia: " + referencia + "\n" +
                "Velocidad Maxima: " + velocidadMaxima + " km/h";

    }

    public Color getColor() {
        return color;
    }

    public String getReferencia() {
        return referencia;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}

