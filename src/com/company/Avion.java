package com.company;

public class Avion extends Vehiculo {
    private String tipo;
    private int altitudMaxima;


    public Avion(String referencia, int velocidadMaxima, Color color) {
        super(referencia, velocidadMaxima, color);
        this.tipo = AvionBuilder.tipo;
        this.altitudMaxima = AvionBuilder.altitudMaxima;
    }

    @Override
    public String toString() {
        return "Tipo de Vehiculo: "+ tipo + " \n"
                + super.toString() + " \n" +
                "Altitud Maxima " + altitudMaxima + " ft de altura " + "\n";

    }

    public static class AvionBuilder{
        public static String tipo = "Avion";
        public static int altitudMaxima;
        private String referencia;
        private int velocidadMaxima;
        private Color color;

        public AvionBuilder tipo(String tipo){
            this.tipo = tipo;
            return this;
        }

        public AvionBuilder altitudMaxima(int altitudMaxima){
            this.altitudMaxima = altitudMaxima;
            return this;
        }

        public AvionBuilder referencia(String referencia){
            this.referencia = referencia;
            return this;
        }

        public AvionBuilder velocidadMaxima(int velocidadMaxima){
            this.velocidadMaxima = velocidadMaxima;
            return this;
        }

        public Avion build(){
            return new Avion(referencia,velocidadMaxima, color);
        }
    }
}