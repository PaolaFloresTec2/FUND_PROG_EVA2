/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_switch2;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_19_SWITCH2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String carrera;
        System.out.println("Introduce la carrera (SISTEMAS, INFOMRMÁTICA, ADMINISTRACIÓN): ");
        carrera = captu.nextLine();
        
        switch(carrera){ //if(carrera.equals("SISTEMAS"))
            case "SISTEMAS":
                System.out.println("Tu carrera es ISC");
                break;
            case "INFORMÁTICA":
                System.out.println("Tu carrera es INF");
                break;
            case "ADMINISTRACIÓN":
                System.out.println("Tu carrera es LA");
                break;
                
        }
    }
    
}
