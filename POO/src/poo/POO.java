/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author Diego Sevillano
 */
public class POO {
    public static void main(String[] args) {
        coche coche1 = new coche("mercedes", "azul", true, "23324", 22);
        coche1.imprimecoche();
        asignatura asignatura1 = new asignatura("matematicas", 1017, 1);
        asignatura1.imprimir();
        punto punto1 = new punto();
        punto punto2 = new punto(5,3);
        punto punto3 = new punto(2,-1);
        punto punto4 = new punto(3,2);
        punto1.imprimir();
        punto2.imprimir();
        punto3.imprimir();
        punto4.imprimir();
        
        
        double distancia = punto.distancia(punto1, punto2);
        System.out.println("distancia entre los puntos "+distancia);
    }
    
}
