package lab3p2_uliseslargaespada;

public class Camion extends Vehiculo{
  private float volumenMax;
  private float altura;
  private boolean retroexcavadora;

  public Camion() {
  }

  public Camion(float volumenMax, float altura, boolean retroexcavadora, String color, String marca, int year, float precio, int llantas) {
    super(color, marca, year, precio, llantas);
    this.volumenMax = volumenMax;
    this.altura = altura;
    this.retroexcavadora = retroexcavadora;
  }

  public float getVolumenMax() {
    return volumenMax;
  }

  public void setVolumenMax(float volumenMax) {
    this.volumenMax = volumenMax;
  }

  public float getAltura() {
    return altura;
  }

  public void setAltura(float altura) {
    this.altura = altura;
  }

  public boolean isRetroexcavadora() {
    return retroexcavadora;
  }

  public void setRetroexcavadora(boolean retroexcavadora) {
    this.retroexcavadora = retroexcavadora;
  }

  @Override
  public String toString() {
    return "Camion{" + "volumenMax=" + volumenMax + ", altura=" + altura + ", retroexcavadora=" + retroexcavadora + '}';
  }
}
