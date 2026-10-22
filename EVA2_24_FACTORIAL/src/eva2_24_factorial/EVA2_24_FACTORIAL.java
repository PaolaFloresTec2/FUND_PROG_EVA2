/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_24_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nume, facto = 1, facto2 = 1;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Valor a calcular: ");
        nume = captu.nextInt();
        
        
        for(int i = nume; i >= 1; i--){
            System.out.println("Secuencia 1= " + i);
            facto = facto * i;
            
        }    
        System.out.println("Factorial de " + nume + " = " + facto);
        
        for(int i = 1; i <= nume; i++){
            System.out.println("Secuencia 2= " + i);
            facto2 = facto2 * i;
            
        }    
        System.out.println("Factorial de " + nume + " = " + facto2);
        
            
        
    }
    
}
