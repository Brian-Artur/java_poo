package com.example.ejer3;

import com.example.utils.Input;

public class Menu {

  public static void mostrarMenu() {

    private static Banco banco = new Banco();

    while (true) {

      System.out.println("""
            MENÚ PRINCIPAL
            1 - Crear cuenta
            2 - Seleccionar cuenta
            3 - Ingresar
            4 - Retirar
            5 - Ver saldo
            6 - Cambiar comisión
            7 - Ver comisión
            0 - Salir
          """);

      int option = Input.askNumberInRange("👉 Elige una opción: ", 0, 7);

      int option = Input.askNumberInRange("👉 Elige una opción: ", 0, 7);

      switch (option) {
        case 1 -> crearCuenta();
        case 2 -> seleccionarCuenta();
        case 3 -> ingresar();
        case 4 -> retirar();
        case 5 -> verSaldo();
        case 6 -> cambiarComision();
        case 7 -> verComision();
        case 0 -> {
          System.out.println("👋 Hasta luego!");
          return;
        }
      }
    }
  }

  private static void crearCuenta() {
    String iban = Input.ask("Introduce IBAN: ");
    double comisión = Input.askDouble("Introduce comisión: ");
    banco.creaCuentaCorriente(iban, comisión);
  }

  private static void seleccionarCuenta() {
    banco.listarCuentas();
    int numCuenta = Input.askNumberInRange(
        "Seleccione su cuenta: ",
        1,
        banco.getNumeroCuentas());
    banco.seleccionarCuenta(numCuenta - 1);
  }
}
/*
 * case 2:
 * banco.listarCuentas();
 * int numCuenta = Input.askNumberInRange("Seleccione su cuenta: ", 1,
 * banco.cuentas.size());
 * banco.seleccionarCuenta(numCuenta);
 * break;
 * case 3:
 * double impIngr = Input.askDouble("Importe: ");
 * banco.getCuentaActiva().ingresar(impIngr);
 * break;
 * case 4:
 * double impReti = Input.askDouble("Importe: ");
 * banco.getCuentaActiva().retirar(impReti);
 * break;
 * case 5:
 * banco.getCuentaActiva().getSaldo();
 * break;
 * case 6:
 * double comision = Input.askDouble("Valor: ");
 * banco.getCuentaActiva().setComision(comision);
 * break;
 * case 7:
 * banco.getCuentaActiva().getComision();
 * break;
 * case 0:
 * System.out.println("👋 Hasta luego!");
 * return;
 * }
 * }
 * }
 * }
 * 
 * 
 * 
 */