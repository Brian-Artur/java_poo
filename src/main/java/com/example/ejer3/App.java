package com.example.ejer3;

public class App {

          Banco banco = new Banco();
        banco.agregarCuenta(new CuentaCorriente("ES01", 1000));
        banco.agregarCuenta(new CuentaCorriente("ES02", 500));

        Menu menu = new Menu(banco);
        menu.mostrar();
}
