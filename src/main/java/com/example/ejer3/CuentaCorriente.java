package com.example.ejer3;

public class CuentaCorriente {

  private String iban;
  private double saldo;
  private double porcentajeComision;
  private int contadorIngresos;

  public CuentaCorriente(String iban, double porcComision) {
    this.iban = iban;
    this.porcentajeComision = porcComision;
    this.saldo = 0;
    this.contadorIngresos = 0;
  }

  protected void ingresar(double importe) {
    this.contadorIngresos++;
    if (this.contadorIngresos == 3) {
      this.contadorIngresos = 0;
      this.saldo += 0.7;
    }
    this.saldo += importe;
  }

  boolean retirar(double importe) {
    this.contadorIngresos = 0;
    if (importe > this.saldo) {
      System.out.printf("Operación no completada. Tu saldo es %f", this.saldo);
      return false;
    } else {
      System.out.printf("Acabas de retirar %f.%nTu saldo actual es %f", importe, this.saldo);
      this.saldo -= importe + (importe * this.porcentajeComision);
      return true;
    }
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setComision(double porcentaje) {
    if (porcentaje < 0) {
      throw new IllegalArgumentException("La comisión no puede ser negativa");
    }
    this.porcentajeComision = porcentaje;
  }

  public double getComision() {
    return this.porcentajeComision;
  }

  public String getIban() {
    return iban;
  }
}
