package com.example.ejer3;

import com.example.utils.Input;

public class CuentaCorriente {
  public String iban;
  private double saldo;
  private double porcentajeComision;
  private int contadorIngresos = 0;

  public CuentaCorriente(String iban, double porcComision) {
    this.saldo = 0;
    this.iban = iban;
    this.porcentajeComision = porcComision;
  }

  public CuentaCorriente crearCuenta() {
    double comision = 0.03;
    String iban = Input.ask("Numero de IBAN: ");
    return new CuentaCorriente(iban, comision);
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

}
