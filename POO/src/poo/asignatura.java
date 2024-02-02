/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Diego Sevillano
 */
public class asignatura {
    String nombre;
    int codigo;
    int curso;

    public asignatura(String nombre, int codigo, int curso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.curso = curso;
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+nombre);
        System.out.println("codigo: "+codigo);
        System.out.println("curso: "+curso);
    }
    
}
