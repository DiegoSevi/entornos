/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;
public class coche {
    public String modelo;
    public String color;
    public boolean metalizado;
    public String matricula;
    public int año;
    public String[]seguro = {"A TODO RIESGO", "A TERCEROS"};

    public coche(String modelo, String color, boolean metalizado, String matricula, int año) {
        this.modelo = modelo;
        this.color = color;
        this.metalizado = metalizado;
        this.matricula = matricula;
        this.año = año;
    }
    
    public void imprimecoche(){
        System.out.println("El modelo del coche es "+modelo);
        System.out.println("El modelo del coche es "+color);
    }    
    
}
