package com.company;
import java.util.Scanner;



public abstract class  Vehiculo  {
    Scanner color_seleccionado = new Scanner(System.in);
    int seleccion_c;
    private Color color;
    private final String referencia;
    private final int velocidadMaxima;


    public Vehiculo(String referencia, int velocidadMaxima) {
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;

        System.out.println("Seleccione el color para el vehiculo");
        System.out.println("[1]NEGRO - [2]BLANCO - [3]AZUL - [4]VERDE - [5]GRIS");
        seleccion_c = color_seleccionado.nextInt();

        if (seleccion_c == 1){
            this.color = Color.NEGRO;
        }
        else if (seleccion_c == 2){
            this.color = Color.BLANCO;
        }
        else if (seleccion_c == 3){
            this.color = Color.AZUL;
        }
        else if (seleccion_c == 4){
            this.color = Color.VERDE;
        }
        else if (seleccion_c == 5){
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


}

