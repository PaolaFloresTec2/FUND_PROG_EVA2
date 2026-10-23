/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_ejercicios_3;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_25_EJERCICIOS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nume, resu = 1;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Dime un número");
        nume = captu.nextInt();
        
        System.out.println("TABLA DE MULTIPLICACIÓN DEl " + nume);
        for(int i = 0; i <= 10; i++){
            
            resu = i * nume;
            System.out.println("Resultados: " + nume + " x " + i + " = " + resu);
        }
    }
    
}
