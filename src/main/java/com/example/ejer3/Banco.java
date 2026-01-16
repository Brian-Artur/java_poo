package com.example.ejer3;

import java.util.ArrayList;
import java.util.List;

public class Banco {

  private List<CuentaCorriente> cuentas = new ArrayList<>();
  private CuentaCorriente cuentaActiva;

  public void agregarCuenta(CuentaCorriente cuenta) {
    cuentas.add(cuenta);
  }

  public void seleccionarCuenta(int indice) {
    this.cuentaActiva = cuentas.get(indice);
  }

  public CuentaCorriente getCuentaActiva() {
    return this.cuentaActiva;
  }
}
