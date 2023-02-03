package lab3p2_uliseslargaespada;

import java.util.*;

public class Lab3P2_UlisesLargaespada {

  public static ArrayList<Vehiculo> vehiculos = new ArrayList();
  public static ArrayList<Cliente> clientes = new ArrayList();
  public static ArrayList<Concesionaria> concesionarias = new ArrayList();

  public static void main(String[] args) {
    // Calling main meun method
    mainMenu();
  }

  // Main Menu method
  public static void mainMenu() {
    // Initialize scanner
    Scanner entry = new Scanner(System.in);

    System.out.println("-- Bienvenido al Laboratorio #3 de Program II --");
    System.out.println("En este laboratorio vamos a tener la oportunidad de manejar el registro y control de empresas, vehiculos y clientes para la AMDC");

    System.out.println("¿Cómo te llamas?");
    String nombre = entry.nextLine();

    System.out.println("Mucho gusto " + nombre + "\n");

    do {
      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - CRUD Concensionaria");
      System.out.println("2 - CRUD Clientes");
      System.out.println("3 - CRUD Vehiculos");
      System.out.println("4 - Compra/Venta de vehiculos por parte de un cliente");
      System.out.println("5 - Salir \n");

      System.out.print("Ingrese la opción: ");
      int option = entry.nextInt();
      
      switch (option) {
        case 1 -> {
        }

        case 2 -> {
        }

        case 3 -> {
        }

        case 4 -> {
        }

        case 5 -> {
          System.out.println("Ten un buen dia " + nombre);
        }

        default ->
          System.out.println("Elija una opcion de las anteriores");
      }

      // Salir del programa 
      if (option == 5) {
        break;
      }
    } while (true);
  }

  // Method for the CRUD
}
