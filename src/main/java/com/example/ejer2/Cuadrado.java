package com.example.ejer2;

import com.example.utils.Input;

public class Cuadrado {
  private int lado;

  public Cuadrado() {
    this.lado = Input.askNumber("lado: ");
  }

  protected void run() {
    Cuadrado cuatrado = new Cuadrado();
    cuatrado.calcularArea(this.lado);
  }

  public int calcularArea(int lado) {
    return lado * lado;
  }
}
