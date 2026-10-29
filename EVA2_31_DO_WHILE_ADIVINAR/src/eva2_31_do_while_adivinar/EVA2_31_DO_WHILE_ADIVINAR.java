/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_31_DO_WHILE_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PIDE AL USUARIO ADIVINAR UN NÚMERO
        //TERMINA CUANDO ADIVINA EL NÚMERO
        Scanner captu = new Scanner(System.in);
        int num;
        
        do{
            System.out.println("--------ADVINA EL NÚMERO----------");
            num = captu.nextInt();
            System.out.println("OPCIONES");
            System.out.print(" 1 ");
            System.out.print(" 2 ");
            System.out.print(" 3 ");
            System.out.print(" 4 ");
            System.out.print(" 5 ");
            System.out.print(" 6 ");
            System.out.print(" 7 ");
            System.out.print(" 8 ");
            System.out.print(" 9 ");
            System.out.println(" 10 ");
            captu.nextLine();
            System.out.println("Sigue intentando");
        }while(num != 3);
        System.out.println("Felicidades, eres un crack");
    }
    
}
