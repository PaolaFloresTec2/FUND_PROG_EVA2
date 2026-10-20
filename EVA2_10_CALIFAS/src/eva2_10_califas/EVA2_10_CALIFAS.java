/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_10_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double prome;
        
        Scanner captu = new Scanner(System.in);
        System.out.println("Cuál es el promedio?");
        prome = captu.nextDouble();
        
        if(prome <= 0)
            System.out.println("Dato inválido, has algo bien");
        else if(prome < 70)
            System.out.println("Insuficiente, vayase ya para su casa");
        else if(prome <= 80)
            System.out.println("Aceptable, echele más ganitas, please");
        else if(prome <= 90)
            System.out.println("Bueno, pero puede mejorar");
        else if(prome <= 100)
            System.out.println("Sobresaliente, pase por su título my friend");
        else if(prome > 100)
            System.out.println("Dato inválido");
    }
    
}
