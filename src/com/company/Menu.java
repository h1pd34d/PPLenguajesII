package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    private static Menu menu;
    private final Garaje garaje = new Garaje();
    public int opcion = 0;
        private static void mostrarMenu(){
            System.out.println("\nMENU");
            System.out.println("[1] AGREGAR VEHICULO");
            System.out.println("[2] MOSTRAR VEHICULOS");
            System.out.println("[3] SALIR");
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
                        break;
                }
            } while (opcion != 3);
        }

    public static Menu getInstance(){
        if(null == menu){
            menu = new Menu();
        }
        return menu;
    }

}

