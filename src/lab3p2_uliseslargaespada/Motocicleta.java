package lab3p2_uliseslargaespada;

public class Motocicleta extends Vehiculo {
  private String desplazamientoMotor;
  private boolean electric;

  public Motocicleta() {
  }

  public Motocicleta(String desplazamientoMotor, boolean electric, String color, String marca, int year, float precio, int llantas) {
    super(color, marca, year, precio, llantas);
    this.desplazamientoMotor = desplazamientoMotor;
    this.electric = electric;
  }

  public String getDesplazamientoMotor() {
    return desplazamientoMotor;
  }

  public void setDesplazamientoMotor(String desplazamientoMotor) {
    this.desplazamientoMotor = desplazamientoMotor;
  }

  public boolean isElectric() {
    return electric;
  }

  public void setElectric(boolean electric) {
    this.electric = electric;
  }

  @Override
  public String toString() {
    return "Motocicleta{" + "desplazamientoMotor=" + desplazamientoMotor + ", electric=" + electric + '}';
  }
}
