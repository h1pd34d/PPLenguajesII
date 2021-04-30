package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garaje {
    private List<Vehiculo> garaje = new ArrayList<Vehiculo>();
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
        if(garaje.size() > 0) {
            for (Vehiculo  vehiculo: garaje){
                System.out.println("-------------------------------");
                System.out.println(vehiculo.toString().toString());
                System.out.println("-------------------------------");
            }
        }
        else{
            System.out.println("El Garaje esta vacio");
        }
    }

}
