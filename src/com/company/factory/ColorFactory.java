package com.company.factory;

import com.company.Color;
import java.util.Scanner;

public class ColorFactory {

    Color color;
    Scanner color_seleccionado = new Scanner(System.in);
    int seleccion_c;

    public ColorFactory(Color color) {


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
            System.out.println("Seleccion Invalida");
        }
    }


    public Color getColor() {
        return color;
    }

}
