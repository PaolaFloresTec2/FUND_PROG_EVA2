/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_expresiones_booleanas_2;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_14_EXPRESIONES_BOOLEANAS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //BECA
        //promedio >=95
        //esta en un equipo representativo
        //CAPTURA
        
        String beca, equipo;
        double promedio;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Pertenece a equipos representativos (S/N)? ");
        equipo = captu.nextLine();
        System.out.println("Cuál es tu promedio? ");
        promedio = captu.nextDouble();
        
        if ((promedio >= 95) || equipo.equals("S")) {
            System.out.println("Tienes beca");
            
        }else {
            System.out.println("No tienes beca");
        }
    }
    
}
