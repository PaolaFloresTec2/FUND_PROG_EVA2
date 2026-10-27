/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_while;

/**
 *
 * @author paola
 */
public class EVA2_26_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //WHILE --> mientras(que?)
        //CERO --> N VECES
        
        //while(/*condición*/){//se repite mientras la condición sea verdad
            
        //IMPRIMIR LOS NÚMEROS DEL 1 AL 10
        int i = 1; 
        while(i <= 10){//se repite mientras la condición sea verdadera
            System.out.print(i + " - ");
            i++;
        }
        System.out.println("");
        //AHORA DEL 10 AL 1
        i = 10;
        while(i >= 1){
            System.out.print(i + " - ");
            i--;
        }
    }
    
}
