/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

public class punto {
    public int x;
    public int y;

    public punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public punto() {
        this.x=0;
        this.y=0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    public void imprimir(){
        System.out.println("Este punto se encuentra en la poscion: "+x+","+y);
    }
    
    public static double distancia(punto p1,punto p2){
        int distanciaX = p2.getX() - p1.getX();
        int distanciaY = p2.getY() - p1.getY();
        double distancia = Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
        return distancia;
    }
}
