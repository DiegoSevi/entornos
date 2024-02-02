/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package golosinas;

import java.util.Scanner;

/**
 *
 * @author Diego Sevillano
 */
public class Golosinas {

    Scanner scanner = new Scanner(System.in);
    String[][] nombresGolosinas = {
        {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
        {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
        {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
        {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
    };
    double[][] precio = {
        {1.1, 0.8, 1.5, 0.9},
        {1.8, 1, 1.2, 1},
        {1.8, 1.3, 1.2, 0.8},
        {1.5, 1.1, 1.1, 1.1}
    };
    int[][] cantidad = {
        {5, 5, 5, 5, 5},
        {5, 5, 5, 5, 5},
        {5, 5, 5, 5, 5},
        {5, 5, 5, 5, 5},
    };

    public void menu(){
        int opcion;

        do {
            System.out.println("**** Menú ****");
            System.out.println("1. PEDIR GOLOSINA");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (1-4): ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("INTRODUCE EL NUMERO DE LA GOLOSINA");
                    pedir();
                    
                    break;
                case 2:
                    System.out.println("Seleccionaste la Opción 2");
                    // Lógica para la Opción 2
                    break;
                case 3:
                    System.out.println("Seleccionaste la Opción 3");
                    // Lógica para la Opción 3
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
    
    public void pedir(){
        int numero;
        numero=scanner.nextInt();
        int num1= numero/10;
        int num2= numero%10;
        if (num1<4 && num2<4) {
            System.out.println("no disponemos de esa golosina");
        }
        cantidad[num1][num2]--;
        System.out.println("El numero "+numero+" es la golosina"+nombresGolosinas[num1][num2]);
        System.out.println( "Cantidad de golosinas disponible: "+cantidad[num1][num2]);
    }

    public static void main(String[] args) {
      Golosinas p = new Golosinas();
      p.menu();
      
}
}


