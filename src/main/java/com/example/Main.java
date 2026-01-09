package com.example;

import com.example.Persona;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Persona pers1 = new Persona("Jose", "Rodriguez Mata", "1965-01-15", 165);
    Persona pers2 = new Persona("María", "Sanchez Gómez", "1980-12-26", 170);
    Persona pers3 = new Persona("Alejandro", "Gómez Gómez", "2001-11-01", 190);
    Persona pers4 = new Persona("Jose Manuel", "Pérez Pons", "2010-05-01", 127);

    pers4.mostrarDatos();

    Persona pers5 = new Persona("Lorena", "Remeseiro Neira", 25);
    Persona pers6 = new Persona("Patricia", "Seoane Álvarez", 62);

    pers6.obtenerEdad();
  }

  public Persona mayorEdad(ArrayList<Persona> personas) {
    Persona mayor = personas.get(0);
    for (int i = 0; i < personas.size(); i++) {
      Persona persActual = personas.get(i);

      if (persActual.obtenerEdad() > mayor.obtenerEdad()) {
        mayor = persActual;
      }
    }

    return mayor;
  }
}