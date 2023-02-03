package lab3p2_uliseslargaespada;

import java.util.*;

public class Lab3P2_UlisesLargaespada {

  // Set up scanner as a global variable
  public static Scanner entry = new Scanner(System.in);

  public static ArrayList<Vehiculo> vehiculos = new ArrayList();
  public static ArrayList<Cliente> clientes = new ArrayList();
  public static ArrayList<Concesionaria> concesionarias = new ArrayList();

  public static void main(String[] args) {
    // Calling main meun method
    mainMenu();
  }

  // Main Menu method
  public static void mainMenu() {
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
          crudConcesionaria();
        }

        case 2 -> {
          crudClientes();
        }

        case 3 -> {
          crudVehiculos();
        }

        case 4 -> {
          compraVentasPorCliente();
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

  // Method for the CRUD Concesionaria
  public static void crudConcesionaria() {
    System.out.println("Bienvenido al menu para Concensionarias");
    System.out.println("Aqui usted podra realizar diversas opciones para las concencionarias");

    do {
      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Crear una Concensionaria");
      System.out.println("2 - Ver las Concensionarias disponibles");
      System.out.println("3 - Modificar la direccion de alguna Concensionaria");
      System.out.println("4 - Eliminar cualquier Concensionaria");
      System.out.println("5 - Regresar al Menu Principal \n");

      System.out.print("Ingrese la opción: ");
      int option = entry.nextInt();

      // Reiniciar scanner
      entry.nextLine();

      switch (option) {
        case 1 -> {
          System.out.println("Excelente, vmaos a ingresar una concesionaria! \n");

          Concesionaria nuevaC = new Concesionaria();

          System.out.print("Por vavor, indique el nombre de su empresa: ");
          String nombreC = entry.nextLine();
          nuevaC.setNombreEmpresa(nombreC);

          System.out.print("Ahora, diganos la direccion de su empresa: ");
          String direccion = entry.nextLine();
          nuevaC.setDireccion(direccion);

          System.out.print("Para finalizar, cuanto saldo tendrian su empresa: ");
          float saldo = entry.nextFloat();
          nuevaC.setSaldo(saldo);

          // Establecer el Id
          double id = concesionarias.size() + 1;
          nuevaC.setId(id);

          concesionarias.add(nuevaC);
        }

        case 2 -> {
          listarArrayList(1);
        }

        case 3 -> {
          System.out.println("En esta seccion podras modificar la direccion de una concesionaria");

          if (concesionarias.isEmpty()) {
            System.out.println("No puedes modificar si no hay para mostrar \n");
          } else {
            System.out.print("Seleccione la que deseas modificar: ");
            
            listarArrayList(1);
            
            int select = entry.nextInt();

            System.out.println("Ahora ingresa su nueva direccion");
            entry.nextLine();
            String nuevaDireccion = entry.nextLine();
            
            concesionarias.get(select).setDireccion(nuevaDireccion);

            System.out.println("--Concesionaria modificada correctamente--");
          }
        }

        case 4 -> {
          System.out.println("En esta seccion podras eliminar concesionarias!");
          System.out.println("Primero veras la lista de concesionarias para luego seleccionar la que deseas eliminar \n");

          listarArrayList(1);

          if (concesionarias.isEmpty()) {
            System.out.println("No puedes borrar si no hay para mostrar \n");
          } else {
            System.out.print("Seleccione la que deseas eliminar: ");
            int select = entry.nextInt();

            concesionarias.remove(select);

            System.out.println("--Concesionaria eliminada--");
          }
        }

        case 5 -> {
          System.out.println("Regresando al Menu Principal \n");
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

  // Method for the CRUD Clientes
  public static void crudClientes() {
    System.out.println("Bienvenido al menu para Clientes");
    System.out.println("Aqui usted podra realizar diversas opciones para los clientes");

    do {
      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Crear una Cliente");
      System.out.println("2 - Ver los Clientes existentes");
      System.out.println("3 - Modificar algun Cliente");
      System.out.println("4 - Eliminar a un Cliente");
      System.out.println("5 - Regresar al Menu Principal \n");

      System.out.print("Ingrese la opción: ");
      int option = entry.nextInt();

      switch (option) {
        case 1 -> {
          System.out.println("Excelente, vmaos a ingresar un nuevo cliente! \n");

          Cliente nuevoCl = new Cliente();

          System.out.print("Por vavor, indique el nombre del cliente: ");
          String nombreCl = entry.nextLine();
          nuevoCl.setNombre(nombreCl);


          System.out.print("Para finalizar, cuanto saldo tendrian su cliente: ");
          float saldo = entry.nextFloat();
          nuevoCl.setSaldo(saldo);

          // Establecer el Id
          double id = clientes.size() + 1;
          nuevoCl.setId(id);

          clientes.add(nuevoCl);
        }

        case 2 -> {
          listarArrayList(2);
        }

        case 3 -> {
          System.out.println("No es posible modificar paramestros a los clientes");
        }

        case 4 -> {
          System.out.println("En esta seccion podras eliminar clientes!");
          System.out.println("Primero veras la lista de clientes para luego seleccionar la que deseas eliminar \n");

          listarArrayList(2);

          if (concesionarias.isEmpty()) {
            System.out.println("No puedes borrar si no hay para mostrar \n");
          } else {
            System.out.print("Seleccione la que deseas eliminar: ");
            int select = entry.nextInt();

            concesionarias.remove(select);

            System.out.println("--Concesionaria eliminada--");
          }
        }

        case 5 -> {
          System.out.println("Regresando al Menu Principal \n");
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

  // Method for the CRUD Vehiculos
  public static void crudVehiculos() {
    System.out.println("Bienvenido al menu para Vehiculos");
    System.out.println("Aqui usted podra realizar diversas opciones para los Vehiculos");

    do {
      System.out.println("Elija que opcion deseas: ");
      System.out.println("1 - Agregar un Vehiculo");
      System.out.println("2 - Ver los Vehiculos disponibles");
      System.out.println("3 - Modificar algun Vehiculo");
      System.out.println("4 - Eliminar un Vehiculo");
      System.out.println("5 - Regresar al Menu Principal \n");

      System.out.print("Ingrese la opción: ");
      int option = entry.nextInt();

      switch (option) {
        case 1 -> {
        }

        case 2 -> {
          listarArrayList(2);
        }

        case 3 -> {
        }

        case 4 -> {
        }

        case 5 -> {
          System.out.println("Regresando al Menu Principal \n");
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

  // Metodo para listar cualquier arrayList
  public static void listarArrayList(int option) {
    switch (option) {
      case 1 -> {
        if (concesionarias.isEmpty()) {
          System.out.println("No hay ninguna Concensionaria en lista");
        } else {
          System.out.println("Le mostraremos las concesionarias presentes");
          for (Concesionaria co : concesionarias) {
            System.out.println(concesionarias.indexOf(co) + "- " + co.toString());
          }
        }
      }

      case 2 -> {
        if (clientes.isEmpty()) {
          System.out.println("No hay ningun Cliente en lista");
        } else {
          System.out.println("Le mostraremos los Clientes en lista");
          for (Cliente cl : clientes) {
            System.out.println(clientes.indexOf(cl) + "- " + cl.toString());
          }
        }
      }

      case 3 -> {
        if (vehiculos.isEmpty()) {
          System.out.println("No hay ningun vehiculo disponible");
        } else {
          System.out.println("Le mostraremos los Clientes en lista");
          for (Vehiculo ve : vehiculos) {
            System.out.println(vehiculos.indexOf(ve) + "- " + ve.toString());
          }
        }
      }
    }

    System.out.println();
  }

  // Metodo para la compra/venta por parte de un cliente
  public static void compraVentasPorCliente() {

  }
}
