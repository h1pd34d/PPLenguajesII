package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Garaje {
    private Set<Vehiculo> garaje = new HashSet<>();

    Scanner teclado = new Scanner(System.in);
    private Object Vehiculo;


    public void agregar_vehiculo(){
        int seleccion;

        if(garaje.size() < 10){

            System.out.println("Seleccione el tipo de vehiculo");
            System.out.println("[1]Carro - [2]Yate - [3]Avion");
            seleccion = teclado.nextInt();

            if(seleccion == 1){

                Vehiculo carro = new recibirInformacion().empezar(1);
                if (carro != null) {
                    garaje.add(carro);
                }

            }
            else if(seleccion == 2){

                Vehiculo yate = new recibirInformacion().empezar(2);
                if (yate != null) {
                    garaje.add(yate);
                }
            }
            else if (seleccion == 3){

                Vehiculo avion = new recibirInformacion().empezar(3);
                if (avion != null) {
                    garaje.add(avion);
                }

            }
            else{
                System.out.println("No selecciono una opcion correcta");
            }

        }
        else{
            System.out.println("El Garaje esta lleno");
        }

    }

    public void verGaraje(){
        if(!garaje.isEmpty()) {
            for (Vehiculo  vehiculo: garaje){
                System.out.println("-------------------------------");
                System.out.println(vehiculo.toString());
                System.out.println("-------------------------------");
            }
        }
        else{
            System.out.println("El Garaje esta vacio");
        }
    }

    public void velocidadMax(){
        if(!garaje.isEmpty()){
            Optional<Vehiculo> vehmax = garaje.stream()
                    .max(Comparator.comparing(vehiculo -> vehiculo.getvelocidadMaxima()));

            System.out.println("--------------------------------------");
            System.out.println("VEHICULO CON MAYOR VELOCIDAD DENTRO DEL GARAJE");
            System.out.println(vehmax.toString());
            System.out.println("--------------------------------------");

        }
        else{
            System.out.println("El Garaje esta vacio");
        }
    }

    public void velocidadMin(){
        if(!garaje.isEmpty()){
            Optional<Vehiculo> vehmin = garaje.stream()
                    .min(Comparator.comparing(vehiculo -> vehiculo.getvelocidadMaxima()));


            System.out.println("--------------------------------------");
            System.out.println("VEHICULO CON MENOR VELOCIDAD DENTRO DEL GARAJE");
            System.out.println(vehmin.toString());
            System.out.println("--------------------------------------");

        }
        else{
            System.out.println("El Garaje esta vacio");
        }
    }

    public void vehiculos_ordenados(){
        if(!garaje.isEmpty()){
            List<Vehiculo> veh_ordenados = garaje.stream()
                    .sorted(Comparator.comparing(vehiculo -> vehiculo.getvelocidadMaxima(), Comparator.reverseOrder()))
                    .collect(Collectors.toList());

            veh_ordenados.forEach(vehiculo -> System.out.println(vehiculo.toString()));
        }
        else{
            System.out.println("El Garaje esta vacio");
        }
    }

    public void filtro_color(){
        if(!garaje.isEmpty()){
            List<Vehiculo> filtrados = garaje.stream()
                    .filter(vehiculo -> vehiculo.getColor() == Color.NEGRO || vehiculo.getColor() == Color.AZUL)
                    .collect(Collectors.toList());

            System.out.println("VEHICULOS QUE CUMPLEN CON COLOR NEGRO O AZUL \n");
            filtrados.forEach(vehiculo -> System.out.println(vehiculo.toString()));


        }
        else{
            System.out.println("El Garaje esta vacio");
        }
    }

    public void referencias(){
        if(!garaje.isEmpty()){
            String filtrados = garaje.stream()
                    .filter(vehiculo -> vehiculo.getColor() == Color.BLANCO || vehiculo.getColor() == Color.VERDE)
                    .map(vehiculo -> vehiculo.getReferencia())
                    .reduce("", (str, acc) -> str + " " + acc);

            System.out.println("STRING DE REFERENCIAS");
            System.out.println(filtrados);

        }
        else{
            System.out.println("El Garaje esta vacio");
        }
    }

}
