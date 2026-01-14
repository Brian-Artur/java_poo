package com.example.ejer2;

import com.example.utils.Input;

public class Rectangulo {
  private int base;
  private int altura;

  public Rectangulo() {
    this.base = Input.askNumber("Base: ");
    this.altura = Input.askNumber("Altura: ");
  }

  protected void run() {
    Rectangulo rectangulo = new Rectangulo();
    rectangulo.calcularArea(this.base, this.altura);
  }

  public double calcularArea(int base, int altura) {
    return base * altura;
  }
}
