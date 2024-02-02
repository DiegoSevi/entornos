/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Sevillano
 */
public class agenda {
    private String Nombre;
    private String Ap1;
    private String Ap2;
    private String telefono;

    public agenda(String Nombre, String Apellido, String telefono) {
        this.Nombre = Nombre;
        this.Ap1 = Ap1;
        this.Ap2 = Ap2;
        this.telefono = telefono;
    }

    public agenda(String Nombre, String Ap1, String Ap2, String telefono) {
        this.Nombre = Nombre;
        this.Ap1 = Ap1;
        this.Ap2 = Ap2;
        this.telefono = telefono;
    }

    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Ap1;
    }

    public void setApellido(String Apellido) {
        this.Ap2 = Apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String toString(){
        return this.Nombre+", "+this.Ap1+", "+this.Ap2+"-- "+this.telefono;
    }
    
}

