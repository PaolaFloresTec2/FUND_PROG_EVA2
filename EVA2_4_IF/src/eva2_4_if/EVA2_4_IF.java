/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_if;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_4_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int salario;
        double bono1, resu;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Nombre del empleado");
        nombre = captu.nextLine();
        System.out.println("Salario del empleado");
        salario = captu.nextInt();
        

        
        if(salario < 12000){
            bono1 = (salario * 0.1);}
        else{
            System.out.println("El bono será del 5%");
            bono1 = (salario * 0.05);}
        
        resu = salario + bono1;
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario = " + salario);
        System.out.println("Bono = " + bono1);
        System.out.println("Salario final = " + resu);
    }
    
}
