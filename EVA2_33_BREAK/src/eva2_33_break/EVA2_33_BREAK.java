/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_33_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        
        int nume;
        int valor = 10;
        
        while(true){//TRUE --> es un ciclo infinito aunque pongas la respuesta correcta
            System.out.println("Introdcue un valor");
            nume = captu.nextInt();
            captu.nextLine();
            
            
            if(nume == valor){//EL USUARIO ADIVIMO Y GANÓ, TERMINA EL JUEGO
                System.out.println("ADIVINASTE, EL VALOR ES 10, GANASTE!!!");
                break;// detiene el ciclo por completo
            }
        }
    }
    
}
