package com.company;

public class Avion extends Vehiculo {
    public String tipo = "Avion";
    public int altitudMaxima;

    public Avion( String referencia, int velocidadMaxima, int altitudMaxima) {
        super( referencia, velocidadMaxima);
        this.tipo = tipo;
        this.altitudMaxima = altitudMaxima;
    }


    public int getAltitudMaxima() {

        return altitudMaxima;
    }

    @Override
    public String toString() {
        return "Tipo de Vehiculo: "+ tipo + " \n"
                + super.toString() + " \n" +
                "Altitud Maxima " + altitudMaxima + " ft de altura " + "\n";

    }
}
