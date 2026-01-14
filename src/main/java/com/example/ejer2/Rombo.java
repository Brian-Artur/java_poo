package com.example.ejer2;

import com.example.utils.Input;

public class Rombo {
  private int di1;
  private int di2;

  public Rombo() {
    this.di1 = Input.askNumber("Diagonal 1: ");
    this.di2 = Input.askNumber("Diagonal 2: ");
  }

  protected void run() {
    Triangulo triangulo = new Triangulo();
    triangulo.calcularArea(this.di1, this.di2);
  }

  public double calcularArea(int di1, int di2) {
    return (di1 * di2) / (double) 2;
  }
}
