/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_20_EJERCICIO_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULADORA:
        //PEDIR DOS VALORES ENTEROS.
        //PEDIR LA OPERACIÓN: USAR SWITCH
        //1 SUMA
        //2 RESTA
        //3 MULTIPLICACIÓN
        //4 DIVISIÓN
        //CUALQUIER OTRO VALOR --> OPERACIÓN INVÁLIDA
        //REGRESAR EL RESULTADO
        
        double valor1, valor2, resu;
        int operacion;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("      CALCULADORA");
        System.out.println("CUÁL ES EL PRIMER NÚMERO? ");
        valor1 = captu.nextDouble();
        System.out.println("CUÁL ES EL SEGUNDO NÚMERO? ");
        valor2 = captu.nextDouble();
        System.out.println("ESCOGE QUE OPERACIÓN VAS A REALIZAR (SUMA = 1 RESTA = 2 MULTIPLICACIÓN = 3 DIVISIÓN = 4");
        
        operacion = captu.nextInt();
        
        switch(operacion){
            case 1:
                resu = (valor1 + valor2);
                System.out.println("RESULTADO :" + resu);
                break;
            case 2:
                resu = (valor1 - valor2);
                System.out.println("RESULTADO :" + resu);
                break;
            case 3:
                resu = (valor1 * valor2);
                System.out.println("RESULTADO :" + resu);
                break;
            case 4:
                resu = (valor1 / valor2);
                System.out.println("RESULTADO :" + resu);
                break;
            default: 
                System.out.println("Opción inválida");
        }
        
    }
    
}
