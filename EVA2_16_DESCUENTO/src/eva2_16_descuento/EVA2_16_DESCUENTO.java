/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_16_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        String estudiante, credencial, insen ;
      
      
       Scanner captu = new Scanner (System.in);
       
       System.out.println("Cuál es tu edad?");
       edad = captu.nextInt();
       captu.nextLine();
       
       if (edad < 18){
       
       System.out.println("Si aplica descuento, por ser menor");
       
       }else if ((edad >= 18) && (edad < 60)){
       
       System.out.println("Eres estudiante?(si/no)");
       estudiante = captu.nextLine();
       
       if (estudiante.equals("si")){
       
       System.out.println("Tienes credencial vigente?(si/no)");
       credencial = captu.nextLine();
       
       if (estudiante.equals("si") && (credencial.equals("si"))){
           System.out.println("Si aplica descuento");
       
       }else if (estudiante.equals("si") && (credencial.equals("no"))){
               System.out.println("No aplica descuento");
       }
       }else if (estudiante.equals("no")){
           System.out.println("No aplica descuento");
     
       }
       }else if (edad >= 60){
       
       System.out.println("Tienes credencial del INSEN?(si/no)");
       insen = captu.nextLine();
       
       if (insen.equals("si")){
       System.out.println("Si aplica descuento");

       }else if (insen.equals("no")){
           System.out.println("No aplica descuento");
       }
       
       }
           
     
         
       
       
       
       }
       
      
    }
    


