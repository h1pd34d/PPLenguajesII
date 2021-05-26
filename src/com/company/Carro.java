package com.company;

public class Carro extends Vehiculo {
    private String tipo;
    private int numeroDePuertas;


    public Carro(String referencia, int velocidadMaxima) {
        super(referencia, velocidadMaxima);
        this.tipo = CarroBuilder.tipo;
        this.numeroDePuertas = CarroBuilder.numeroDePuertas;
    }

    @Override
    public String toString() {
        return "Tipo de Vehiculo: "+ tipo + " \n"
                + super.toString() + " \n" +
                "Numero de puertas " + numeroDePuertas + "\n";

    }

    public static class CarroBuilder{
        public static String tipo = "Carro";
        public static int numeroDePuertas;
        private String referencia;
        private int velocidadMaxima;
        private Color color;

        public CarroBuilder tipo(String tipo){
            this.tipo = tipo;
            return this;
        }

        public CarroBuilder numeroDePuertas(int numeroDePuertas){
            this.numeroDePuertas = numeroDePuertas;
            return this;
        }

        public CarroBuilder referencia(String referencia){
            this.referencia = referencia;
            return this;
        }

        public CarroBuilder velocidadMaxima(int velocidadMaxima){
            this.velocidadMaxima = velocidadMaxima;
            return this;
        }


        public Carro build(){
            return new Carro(referencia,velocidadMaxima);
        }
    }

    public String getReferencia(){
        return this.referencia;
    }

}
