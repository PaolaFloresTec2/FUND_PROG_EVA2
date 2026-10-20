/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_9_ESTACIONAMIENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, resu;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("ESTACIONAMIENTO");
        System.out.println("¿Horas usadas?");
        horas = captu.nextInt();
        
        if(horas <= 2){
            resu = (horas * 25);
            System.out.println("$25 por hora");
            System.out.println("Tarifa total = " + resu);
        }else if(horas <= 5){
            resu = (horas * 20);
            System.out.println("$20 por hora");
            System.out.println("Tarifa total = " + resu);
        }else if(horas <= 10){
            resu = (horas * 15);
            System.out.println("$15 por hora");
            System.out.println("Tarifa total = " + resu);
        }else if(horas > 10)
            System.out.println("Tarifa fija de $150");
    }
    
}
