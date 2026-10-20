/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_switch;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_18_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el número del día (1 - 7");
        int dia = captu.nextInt();
        
        switch(dia){ //EVALUA ENTEROS: INT, SHORT, BYE. TEXTO: String ENUM: 
            case 1:
                System.out.println("Domingo");
                //aqui podemos poner cuantas instrucciones necesitamos
                break;//TERMINA EL CASO Y EL SWITCH
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default: //opcional: que hago cuando no es niguna opción anterior
                System.out.println("No es una opción válida");
                
        }
    }
    
}
