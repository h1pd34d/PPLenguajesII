package com.company;
import com.company.factory.ColorFactory;




public abstract class  Vehiculo extends ColorFactory {

    private final String referencia;
    private final int velocidadMaxima;
    private Color color;

    public Vehiculo(String referencia, int velocidadMaxima, Color color) {
        super(color);
        this.color = getColor();
        this.referencia = referencia;
        this.velocidadMaxima = velocidadMaxima;

    }


    /* Sobreescritura del .ToString */
    @Override
    public String toString(){
        return "Color: " + color + "\n" +
                "Referencia: " + referencia + "\n" +
                "Velocidad Maxima: " + velocidadMaxima + " km/h";

    }




}

