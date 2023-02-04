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

      // Reiniciar scanner
      entry.nextLine();

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

          if (clientes.isEmpty()) {
            System.out.println("No puedes borrar si no hay para mostrar \n");
          } else {
            System.out.print("Seleccione al cliente que deseas eliminar: ");
            int select = entry.nextInt();

            clientes.remove(select);

            System.out.println("--Cliente eliminado--");
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

      // Reiniciar scanner
      entry.nextLine();

      switch (option) {
        case 1 -> {
          System.out.println("Ahora vamos a crear un vehiculo");

          System.out.print("Ingrese el color del vehiculo: ");
          String color = entry.nextLine();

          System.out.print("Ingrese la marca del vehiculo: ");
          String marca = entry.nextLine();

          System.out.print("Ingrese el anio del vehiculo: ");
          int year = entry.nextInt();

          System.out.print("Ingrese el precio del vehiculo: ");
          float precio = entry.nextFloat();

          System.out.println("Selecciones la opcion del numero de llantas");
          System.out.println("1) Bicicleta o Motocicleta - 2 llantas");
          System.out.println("2) 4 llantas (Carro, Camion o bus)");
          int llantas = entry.nextInt();

          if (llantas == 1) {
            System.out.println("Ahora Seleccione si es una bicicleta o Motocicleta");
            System.out.println("1 - Bicicleta");
            System.out.println("2 - Motocicleta");
            int tipo = entry.nextInt();

            switch (tipo) {
              case 1 -> {
                System.out.println("Has seleccionado una bicicleta, ahora selecciona sus parametros");

                // Reiniciar scanner
                entry.nextLine();

                System.out.print("Ingresa su descripcion: ");
                String descripcion = entry.nextLine();

                System.out.print("Ingrese el radio de la rueda: ");
                float radio = entry.nextFloat();

                System.out.println("Seleccione su tipo: ");
                System.out.println("1 - BMX");
                System.out.println("2 - De Calle");
                int tipoBici = entry.nextInt();

                if (tipoBici == 1) {
                  Bicicleta bicicletaNueva1 = new Bicicleta(descripcion, radio, "BMX", color, marca, year, precio, 2);
                  vehiculos.add(bicicletaNueva1);

                  System.out.println("Bicicleta Agregada Exitosamente!");
                } else {
                  Bicicleta bicicletaNueva2 = new Bicicleta(descripcion, radio, "De Calle", color, marca, year, precio, 2);
                  vehiculos.add(bicicletaNueva2);
                  System.out.println("Bicicleta Agregada Exitosamente!");

                }
              }

              case 2 -> {
                System.out.println("Has seleccionado una motocicleta, ahora selecciona sus parametros");

                // Reiniciar scanner
                entry.nextLine();

                System.out.print("Ingresa el desplazamiento del motor: ");
                String desMotor = entry.nextLine();

                System.out.println("Confirme si la motocicleta es electrica o no: ");
                System.out.println("1 - Si es electrica");
                System.out.println("2 - No es electrica");
                int electric = entry.nextInt();

                boolean check;

                if (electric == 1) {
                  check = true;
                } else {
                  check = false;
                }

                Motocicleta motoNueva = new Motocicleta(desMotor, check, color, marca, year, precio, 2);
                vehiculos.add(motoNueva);
                System.out.println("Motocicleta Agregada Exitosamente!");

              }
            }
          } else {
            System.out.println("Ahora selecciona si es Carro, Camion o Bus");
            System.out.println("1 - Carro");
            System.out.println("2 - Camion");
            System.out.println("3 - Bus");
            int tipo = entry.nextInt();

            switch (tipo) {
              case 1 -> {
                System.out.println("Has seleccionado carro, ahora indica sus propiedades");

                System.out.print("Ingrese la cantidad de puertas: ");
                int puertas = entry.nextInt();

                // Reiniciar scanner
                entry.nextLine();

                System.out.print("Ingrese la descripcion del motor: ");
                String desMotor = entry.nextLine();

                System.out.print("Ingrese la velocidad maxima: ");
                float topSpeed = entry.nextFloat();

                Carro carroNuevo = new Carro(puertas, desMotor, topSpeed, color, marca, year, precio, 4);

                vehiculos.add(carroNuevo);
                System.out.println("Carro Agregada Exitosamente!");
              }

              case 2 -> {
                System.out.println("Has seleccionado camion, ahora indica sus propiedades");

                System.out.print("Ingrese la cantidad de volumen maximo de carga: ");
                float volMax = entry.nextFloat();

                System.out.print("Ingrese la altura: ");
                float altura = entry.nextFloat();

                System.out.println("Confirme si tiene retroescavadora o no: ");
                System.out.println("1 - Si tiene retroescavadora");
                System.out.println("2 - No tiene retroescavadora");
                int retro = entry.nextInt();

                boolean check;

                if (retro == 1) {
                  check = true;
                } else {
                  check = false;
                }

                Camion camionNuevo = new Camion(volMax, altura, check, color, marca, year, precio, 4);

                vehiculos.add(camionNuevo);
                System.out.println("Camion Agregada Exitosamente!");
              }

              case 3 -> {
                System.out.println("Has seleccionado bus, ahora indica sus propiedades");

                System.out.print("Ingrese la cantidad de pasajeros: ");
                int pasajeros = entry.nextInt();

                Bus busNuevo = new Bus(pasajeros, color, marca, year, precio, 4);

                vehiculos.add(busNuevo);
                System.out.println("bus Agregada Exitosamente!");
              }
            }
          }
        }

        case 2 -> {
          listarArrayList(3);
        }

        case 3 -> {
        }

        case 4 -> {
          System.out.println("En esta seccion podras eliminar vechiculos!");
          System.out.println("Primero veras la lista de vehiculos para luego seleccionar el que deseas eliminar \n");

          listarArrayList(3);

          if (vehiculos.isEmpty()) {
            System.out.println("No puedes borrar si no hay para mostrar \n");
          } else {
            System.out.print("Seleccione el vehiculo que deseas eliminar: ");
            int select = entry.nextInt();

            vehiculos.remove(select);

            System.out.println("--Vehiculo eliminado--");
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
