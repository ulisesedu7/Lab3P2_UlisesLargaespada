package lab3p2_uliseslargaespada;

public class Carro extends Vehiculo {

  private int puertas;
  private String desMotor;
  private float topSpeed;

  public Carro() {
  }

  public Carro(int puertas, String desMotor, float topSpeed, String color, String marca, int year, float precio, int llantas) {
    super(color, marca, year, precio, llantas);
    this.puertas = puertas;
    this.desMotor = desMotor;
    this.topSpeed = topSpeed;
  }

  public int getPuertas() {
    return puertas;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  public String getDesMotor() {
    return desMotor;
  }

  public void setDesMotor(String desMotor) {
    this.desMotor = desMotor;
  }

  public float getTopSpeed() {
    return topSpeed;
  }

  public void setTopSpeed(float topSpeed) {
    this.topSpeed = topSpeed;
  }

  @Override
  public String toString() {
    return "Carro{" + "puertas=" + puertas + ", desMotor=" + desMotor + ", topSpeed=" + topSpeed + '}';
  }
}
