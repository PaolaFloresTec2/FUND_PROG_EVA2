/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_4;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_25_EJERCICIOS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int base, expo, resu = 1;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime un número de base");
        base = captu.nextInt();
        System.out.println("Dime un número de exponente");
        expo = captu.nextInt();
        
        for(int i = 0; i < expo; i++){
            resu = resu * base;
            
            System.out.println("Resultado: " + resu);
        }
    }
    
}
