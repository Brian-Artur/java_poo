package com.example.ejer2;

public class Triangulo {
  private int base;
  private int altura;

  public Triangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
  }

  protected double calcularArea() {
    return (this.base * this.altura) / 2;
  }
}
