package com.example;

import java.time.LocalDate;

import java.time.Period;

public class Persona {
  private String nombre;
  private String apellidos;
  private LocalDate fechaNacimiento;
  private int estatura;

  public Persona(String nom, String apel, String fechN, int est) {
    this.nombre = nom;
    this.apellidos = apel;
    this.fechaNacimiento = LocalDate.parse(fechN);
    this.estatura = est;
  }

  public Persona(String nom, String apel, int edad) {
    this.nombre = nom;
    this.apellidos = apel;

    this.fechaNacimiento = LocalDate.now().minusYears(edad);
  }

  public void mostrarDatos() {
    System.out.printf("Nombre: %s", this.nombre);
    System.out.printf("Apellids: %s", this.apellidos);
    System.out.printf("Fecha: %s", this.fechaNacimiento.toString());
    System.out.printf("Estatura: %d", this.estatura);
  }

  public int obtenerEdad() {
    int edad = Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    System.out.println(edad);

    return edad;
  }
}
