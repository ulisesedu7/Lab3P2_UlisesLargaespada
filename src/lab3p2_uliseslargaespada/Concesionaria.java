package lab3p2_uliseslargaespada;

import java.util.*;

public class Concesionaria {
  private String nombreEmpresa;
  private double id;
  private String direccion;
  private ArrayList<Vehiculo> vehiculos = new ArrayList();
  private ArrayList<Cliente> clientes = new ArrayList();
  private float saldo;

  public Concesionaria() {
  }

  public Concesionaria(String nombreEmpresa, double id, String direccion, float saldo) {
    this.nombreEmpresa = nombreEmpresa;
    this.id = id;
    this.direccion = direccion;
    this.saldo = saldo;
  }

  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public double getId() {
    return id;
  }

  public void setId(double id) {
    this.id = id;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public ArrayList<Vehiculo> getVehiculos() {
    return vehiculos;
  }

  public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
    this.vehiculos = vehiculos;
  }

  public ArrayList<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(ArrayList<Cliente> clientes) {
    this.clientes = clientes;
  }

  public float getSaldo() {
    return saldo;
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  @Override
  public String toString() {
    return "Concesionaria{" + "nombreEmpresa=" + nombreEmpresa + ", id=" + id + ", direccion=" + direccion + ", vehiculos=" + vehiculos + ", clientes=" + clientes + ", saldo=" + saldo + '}';
  }
}
