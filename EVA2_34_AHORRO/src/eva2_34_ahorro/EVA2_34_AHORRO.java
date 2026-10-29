/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_ahorro;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_34_AHORRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VAMOS A DEPOSITAR HASTA LLEGAR A LA META
        Scanner captu = new Scanner(System.in);
        
        int ahorro = 15000;
        int deposito;
        int acum = 0;
        while(true){
            System.out.println("Introduce el deposito: ");
            deposito = captu.nextInt();
            captu.nextLine();            
            //VERIFICAR SI NO ESTAMOS PASANDO
            if((acum + deposito) > 15000){
                System.out.println("Te pasaste de la meta");
                continue;
            }
            acum += deposito;
            System.out.println("Cuenta = " + acum);
            if(acum == 15000){
                System.out.println("LLEGAMOS A LA META!!");
                break;
            }
        }
    }
    
}
