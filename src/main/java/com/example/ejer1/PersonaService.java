package com.example.ejer1;

import java.util.List;

public class PersonaService {

  public Persona mayorEdad(List<Persona> personas) {
    Persona mayor = personas.get(0);

    // ^ for (int i = 0; i < personas.size(); i++) {
    // ^ Persona persActual = personas.get(i);
    for (Persona p : personas) {
      if (p.obtenerEdad() > mayor.obtenerEdad()) {
        mayor = p;
      }
    }
    return mayor;
  }
}
