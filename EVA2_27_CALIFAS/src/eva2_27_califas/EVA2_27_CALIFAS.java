/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_califas;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_27_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int califa = 0;
        double promedio;
        while(califa > -1){
            System.out.println("Introduce la calificación a capturar: (-1 para terminar)");
            califa = captu.nextInt();
            captu.nextLine();  
        }
         System.out.println("Total" + califa);
         promedio = captu.nextDouble();
         promedio = califa / ( 4* 1.0);
         System.out.println("Promedio: " + promedio);
         
    }
    
}
