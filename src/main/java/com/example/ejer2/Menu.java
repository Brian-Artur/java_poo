package com.example.ejer2;

import java.util.Scanner;

public class Menu {
  private static Scanner sc = new Scanner(System.in);

  public static int mostrarMenu() {
    System.out.print("MENÚ PRINCIPAL\n1 - Triángulo\n2 - Cuadrado\n3 - Rectángulo \n4 - Rombo");
    System.out.println("👉 Elige una opción: ");

    int option = sc.nextInt();
    switch (option) {
      case '1':
        new ModuleA().run();
        break;
      case '2':
        new ModuleB().run();
        break;
      case '0':
        System.out.println("👋 Hasta luego!");
        process.exit(0);
      default:
        System.out.println("❌ Opción no válida");
        this.show();
    }

  public static String obtenerCadena(String msg) {
    System.out.print(msg);
    return Menu.sc.nextLine().trim();
  }

}
