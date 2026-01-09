# Operar 


```java
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
```

Persona mayor = personas.get(0);
