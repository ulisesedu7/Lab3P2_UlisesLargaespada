package lab3p2_uliseslargaespada;

import java.util.*;

public class Cliente {
  private double id;
  private String nombre;
  private ArrayList<Vehiculo> vehiculos = new ArrayList();
  private float saldo;

  public Cliente() {
  }

  public Cliente(double id, String nombre, float saldo) {
    this.id = id;
    this.nombre = nombre;
    this.saldo = saldo;
  }

  public double getId() {
    return id;
  }

  public void setId(double id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public ArrayList<Vehiculo> getVehiculos() {
    return vehiculos;
  }

  public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
    this.vehiculos = vehiculos;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", vehiculos=" + vehiculos + ", saldo=" + saldo + '}';
  }
}
