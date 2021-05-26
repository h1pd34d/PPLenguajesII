package com.company;
import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    private static Menu instancia;

    private Menu(){

    }

    private final Garaje garaje = new Garaje();
    public int opcion = 0;
        private static void mostrarMenu(){
            System.out.println("\nMENU");
            System.out.println("[1] AGREGAR VEHICULO");
            System.out.println("[2] MOSTRAR VEHICULOS");
            System.out.println("[3] MOSTRAR VEHICULO DE MAYOR VELOCIDAD");
            System.out.println("[4] MOSTRAR VEHICULO DE MENOR VELOCIDAD");
            System.out.println("[5] MOSTRAR VEHICULOS ORDENADOS POR VELOCIDAD (MAX TO MIN)");
            System.out.println("[6] MOSTRAR VEHICULOS FILTRADOS POR COLOR(NEGRO O AZUL)");
            System.out.println("[7] MOSTRAR REFERENCIAS DE VEHICULOS COLOR(BLANCO O VERDE)");
            System.out.println("[0] SALIR");
        }

        public void ejecutarMenu() {

            do {

                mostrarMenu();

                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        try{
                            garaje.agregar_vehiculo();
                            break;
                        }catch(InputMismatchException ex){
                            break;
                    }
                    case 2:
                        garaje.verGaraje();
                        break;

                    case 3:
                        garaje.velocidadMax();
                        break;

                    case 4:
                        garaje.velocidadMin();
                        break;

                    case 5:
                        garaje.vehiculos_ordenados();
                        break;

                    case 6:
                        garaje.filtro_color();
                        break;

                    case 7:
                        garaje.referencias();
                        break;

                    case 8:
                        break;

                }
            } while (opcion != 0);
        }

    public static Menu getInstance(){
        if(null == instancia){
            return new Menu();
        }
        return instancia;
    }

}

