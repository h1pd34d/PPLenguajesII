package com.company;

public class Yate extends Vehiculo {
    public String tipo = "Yate";
    public float pesoMaximo;

    public Yate( String referencia, int velocidadMaxima, int pesoMaximo) {
        super(referencia, velocidadMaxima);
        this.tipo = tipo;
        this.pesoMaximo = pesoMaximo;
    }

    public float getPesoMaximo() {
        return pesoMaximo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Tipo de Vehiculo: "+ tipo + " \n"
                + super.toString() + " \n" +
                "Peso Maximo " + pesoMaximo + " Kilos " + "\n";

    }
}
