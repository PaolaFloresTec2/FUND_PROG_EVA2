/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_califas;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_2_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuál es tu calificación?");
        califa = captu.nextInt();
        
        if(califa >= 70){
            System.out.println("Felicidades, acreditaste la materia");}
        else{
            System.out.println("No pudiste acreditar la materia");
            
        }
    }
    
}
