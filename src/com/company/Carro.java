package com.company;

public class Carro extends Vehiculo{
    public String tipo = "Carro";
    public int numeroDePuertas;

    public Carro( String referencia, int velocidadMaxima, int numeroDePuertas) {
        super( referencia, velocidadMaxima);
        this.tipo = tipo;
        this.numeroDePuertas = numeroDePuertas;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }
    @Override
    public String toString() {
        return "Tipo de Vehiculo: "+ tipo + " \n"
                + super.toString() + " \n" +
                "Numero de puertas " + numeroDePuertas + "\n";

    }

}
