package lab3p2_uliseslargaespada;

public class Vehiculo {
  protected String color;
  protected String marca;
  protected int year;
  protected float precio;
  protected int llantas;  

  public Vehiculo() {
  }

  public Vehiculo(String color, String marca, int year, float precio, int llantas) {
    this.color = color;
    this.marca = marca;
    this.year = year;
    this.precio = precio;
    this.llantas = llantas;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public float getPrecio() {
    return precio;
  }

  public void setPrecio(float precio) {
    this.precio = precio;
  }

  public int getLlantas() {
    return llantas;
  }

  public void setLlantas(int llantas) {
    this.llantas = llantas;
  }

  @Override
  public String toString() {
    return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", year=" + year + ", precio=" + precio + ", llantas=" + llantas + '}';
  }
}
