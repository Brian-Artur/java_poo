package com.example.ejer3;

import java.util.ArrayList;
import java.util.List;

public class Banco {

  protected List<CuentaCorriente> cuentas = new ArrayList<>();
  private CuentaCorriente cuentaActiva;

  public void creaCuentaCorriente(String iban, double porcComision) {
    CuentaCorriente cuenta = new CuentaCorriente(iban, porcComision);
    cuentas.add(cuenta);
    // return cuenta;
  }

  public void seleccionarCuenta(int indice) {
    this.cuentaActiva = cuentas.get(indice);
  }

  public CuentaCorriente getCuentaActiva() {
    return this.cuentaActiva;
  }

  public void listarCuentas() {
    int i = 0;
    for (CuentaCorriente cuenta : cuentas) {
      System.out.printf("%d - Cuenta: %s\n", i, cuenta.getIban());
      i++;
    }
  }
}
