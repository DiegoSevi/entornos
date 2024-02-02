
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Sevillano
 */
public class agendamain {
    private agenda[] ag;
    private int max; // elementos del vector
    private int activos; // numero de elementos que tienen contactos

    public agendamain(int max) {
        this.max = max;
        ag = new agenda[max];
        this.activos = 0;
        
    }
    
    public String añadir(String Nombre,String ap1,String ap2,String tel){
        String salida = "" ;
        if (this.activos<this.max) {
            agenda c = new agenda(Nombre,ap1,ap2,tel);
            ag[activos] =c;
            activos++;
            salida =" Añadiendo contacto...."+c.toString();
        }else{
            salida = "No hay sitio ";
        }
        return salida;
    }
    public boolean haystio(){
        return this.activos<this.max;
    }
    public String mostrar() {
        String salida = "";
        if (this.activos == 0) {
            salida = "no hay contactos en la agenda";
        } else {
            for (int i = 0; i < this.activos; i++) {
                salida = i+") "+ ag[i].toString()+"\n";
            }
        }
        return salida;
    }

    public String borrar(int pos){
        String salida="";
        if (this.posValida(pos)) {
            salida="Borrando"+ag[pos].toString();
            for (int i = pos; i < activos-1; i++) {
                ag[i]=ag[i+1];
            }
            this.activos --;
            return salida;
        }else{
            return "NO PUEDO BORRAR";
        }
    }
    public boolean posValida(int pos){
        return pos >0 && pos<this.activos;
    }
    }
