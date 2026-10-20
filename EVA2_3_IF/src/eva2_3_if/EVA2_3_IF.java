/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double descuento = 0, compra, total, subtotal;
        int precio;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("¿Cuál es el precio?");
        precio = captu.nextInt();
        System.out.println("¿Qué cantidad compraste?");
        compra = captu.nextDouble();
        
        subtotal = (precio * compra);
        
        if(subtotal >= 1000){
            descuento = (subtotal * 0.1);}
        total = subtotal - descuento;
        System.out.println("Subtotal = " + subtotal);
        System.out.println("Descuento = " + descuento);
        System.out.println("Total = " + total);
    }
    
}
