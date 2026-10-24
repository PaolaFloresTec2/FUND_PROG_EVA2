/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_2;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_25_EJERCICIOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nume;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime un número");
        nume = captu.nextInt();
        String cade = "";
        
        for(int i = 1; i <= nume; i++){
            cade = cade + "*";
               System.out.println(cade);    
        }   
    }
    
}
