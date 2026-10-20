/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_15_BECA {

    /**
       EVA2_15_BECA
       promedio > 80
       Ingresos < 10000
       * AMBAS TIENEN QUE CUMPLIRSE
     */
    public static void main(String[] args) {
        double promedio, ingresos;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuál es tu promedio? ");
        promedio = captu.nextDouble();
        System.out.println("Cuáles son tus ingresos? ");
        ingresos = captu.nextDouble();
        
        if((promedio >= (80)) && (ingresos <=10000)){
            System.out.println("Tienes beca");
            
        }else {
            System.out.println("No tienes beca");}
    }
    
}
