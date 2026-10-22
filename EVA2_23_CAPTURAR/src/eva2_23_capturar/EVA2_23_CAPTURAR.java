/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_capturar;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_23_CAPTURAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SOLICITAR LAS CALIFICACIONES Y PROMEDIAR
        int cant, califa = 0;
        double promedio;

        Scanner captu = new Scanner(System.in);
        System.out.println("Cuántas calificaciones vas a capturar? ");
        cant = captu.nextInt();
        captu.nextLine();
        
        for(int i = 1; i <= cant; i++){
            System.out.println("Captura la calificación: ");
            califa = califa + captu.nextInt();//acomulador
            captu.nextLine();
        }
        System.out.println("acomulado = " + califa);
        promedio = califa / (cant * 1.0);
        System.out.println("Promedio = " + promedio);
    }
    
}
