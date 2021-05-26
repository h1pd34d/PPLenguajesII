package com.company;

public class Yate extends Vehiculo {
    private String tipo;
    private int pesoMaximo;

    public Yate(String referencia, int velocidadMaxima) {
        super(referencia, velocidadMaxima);
        this.tipo = YateBuilder.tipo;
        this.pesoMaximo = YateBuilder.pesoMaximo;
    }

    @Override
    public String toString() {
        return "Tipo de Vehiculo: "+ tipo + " \n"
                + super.toString() + " \n" +
                "Peso Maximo " + pesoMaximo + " Kilos " + "\n";

    }

    public static class YateBuilder{
        public static String tipo = "Yate";
        public static int pesoMaximo;
        private String referencia;
        private int velocidadMaxima;
        private Color color;

        public YateBuilder tipo(String tipo){
            this.tipo = tipo;
            return this;
        }

        public YateBuilder pesoMaximo(int pesoMaximo){
            this.pesoMaximo = pesoMaximo;
            return this;
        }

        public YateBuilder referencia(String referencia){
            this.referencia = referencia;
            return this;
        }

        public YateBuilder velocidadMaxima(int velocidadMaxima){
            this.velocidadMaxima = velocidadMaxima;
            return this;
        }


        public Yate build(){
            return new Yate(referencia,velocidadMaxima);
        }
    }

    public String getReferencia(){
        return this.referencia;
    }
}
