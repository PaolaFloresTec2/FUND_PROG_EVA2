/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_1;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_25_EJERCICIOS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nume1, nume2;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        nume1 = captu.nextInt();
        
        System.out.println("Dime el segundo número: ");
        nume2 = captu.nextInt();
        
        for(int i = nume1; i <= nume2; i++){
            System.out.println("Números: " + i);
        }
    }
    
}
