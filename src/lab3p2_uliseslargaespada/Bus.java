package lab3p2_uliseslargaespada;

public class Bus extends Vehiculo {
  private int pasajeros;
  private String tipo;

  public Bus() {
  }

  public Bus(int pasajeros, String color, String marca, int year, float precio, int llantas) {
    super(color, marca, year, precio, llantas);
    this.pasajeros = pasajeros;
    if (pasajeros > 50) {
      this.tipo = "De Ruta";
    } else {
      this.tipo = "Rapidito";
    }
  }

  public int getPasajeros() {
    return pasajeros;
  }

  public void setPasajeros(int pasajeros) {
    this.pasajeros = pasajeros;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
  }
}
