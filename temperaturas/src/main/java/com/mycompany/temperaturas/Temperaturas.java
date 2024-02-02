/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.temperaturas;

/**
 *
 * @author Diego Sevillano
 */
public class Temperaturas {
    int[][] meses = new int[12][31];
    public void generar(){
        for (int i = 0; i < meses.length; i++) {
            int diasEnElMes = (i == 1) ? 28 : 31; 
            for (int j = 0; j < diasEnElMes; j++) {
                meses[i][j] = (int) (Math.random() * 40 -2);
            }
        }
        System.out.println("-----------------------");
        for (int i = 0; i < meses.length; i++) {
            int diasEnElMes = (i == 1) ? 28 : 31; 
            System.out.println("");
            for (int j = 0; j < diasEnElMes; j++) {
                System.out.print(meses[i][j]+" ");
            }
        }
    }
    public void temMinAnual(){
        int tempMin=20;
        for (int i = 0; i < meses.length; i++) {
            for (int j = 0; j < meses[i].length; j++) {
                if (meses[i][j]<tempMin) {
                    tempMin=meses[i][j];
                }
            }
        }
        System.out.println("La temperatura minima  anual es: "+tempMin);
    }
    public void temMinMeses(){
        for (int i = 0; i < meses.length; i++) {
            int diasEnElMes = (i == 1) ? 28 : 31; 
            int dias=0;
            int tempMin=20;
            System.out.println("");
            for (int j = 0; j < diasEnElMes; j++) {
                if (meses[i][j]<tempMin) {
                    tempMin=meses[i][j];
                    dias=j+1;
                }
            }
             System.out.println("La temperatura mas baja de el mes "+(i+1)+" fue de: "+tempMin+"°C y se regristo en el dia "+dias);
        }
    }
    public void TempMedia(){
        for (int i = 0; i < meses.length; i++) {
            int media=0;
            int temperatura=0;
            int diasEnElMes = (i == 1) ? 28 : 31; 
            System.out.println("");
            for (int j = 0; j < diasEnElMes; j++) {
                temperatura+=meses[i][j];
            }
            if (i==1) {
                media=temperatura/28;
                System.out.println("La temperatura media del mes " +i+" es "+media+" °C");
            }else{
                media=temperatura/31;
                System.out.println("La temperatura media del mes " +i+" es "+media+" °C");
            }
        }

    }
 
    public static void main(String[] args) {
        Temperaturas P =new Temperaturas();
        System.out.println("");
        P.generar();
        System.out.println("");
        P.temMinAnual();
        System.out.println("");
        P.temMinMeses();
         System.out.println("");
        P.TempMedia();
        
    }
}
