package lab3p2_uliseslargaespada;

public class Bicicleta extends Vehiculo {
  private String descripcion;
  private float radioRueda;
  private String tipo;

  public Bicicleta() {
  }

  public Bicicleta(String descripcion, float radioRueda, String tipo, String color, String marca, int year, float precio, int llantas) {
    super(color, marca, year, precio, llantas);
    this.descripcion = descripcion;
    this.radioRueda = radioRueda;
    this.tipo = tipo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public float getRadioRueda() {
    return radioRueda;
  }

  public void setRadioRueda(float radioRueda) {
    this.radioRueda = radioRueda;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  @Override
  public String toString() {
    return "Bicicleta{" + "descripcion=" + descripcion + ", radioRueda=" + radioRueda + ", tipo=" + tipo + '}';
  }
}
