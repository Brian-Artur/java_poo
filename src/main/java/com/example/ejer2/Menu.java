package com.example.ejer2;

import com.example.utils.Input;

public class Menu {

  public static void mostrarMenu() {
    Input input = new Input();

    System.out.print("MENÚ PRINCIPAL\n1 - Triángulo\n2 - Cuadrado\n3 - Rectángulo \n4 - Rombo");
    System.out.println("👉 Elige una opción: ");

    int option = input.askNumberInRange("👉 Elige una opción: ", 0, 4);

    switch (option) {
      case 1:
        new Triangulo().run();
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
        System.exit(0);
      default:
        System.out.println("❌ Opción no válida");
        Menu.mostrarMenu();
    }

  }
}