package com.example.ejer3;

import com.example.utils.Input;

public class Menu {

  public static void mostrarMenu() {
    Input input = new Input();
    while (true) {

      System.out.print("MENÚ PRINCIPAL\n1 - Triángulo\n2 - Cuadrado\n3 - Rectángulo \n4 - Rombo");
      System.out.println("👉 Elige una opción: ");

      int option = input.askNumberInRange("👉 Elige una opción: ", 0, 4);

      switch (option) {
        case 1:
          new CuentaCorriente();
          break;
        case 2:
          new Cuadrado().run();
          break;
        case 3:
          new Rectangulo().run();
          break;
        case 4:
          new Rombo().run();
          break;
        case 0:
          System.out.println("👋 Hasta luego!");
          return;
      }
    }
  }
}