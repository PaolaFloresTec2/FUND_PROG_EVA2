/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author paola
 */
public class EVA2_17_COVID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LOS POLLITOS DICEN, PIO, PIO, PIO
        double peso, imc, altura;
        int edad;
        String cronica;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Cuál es tu edad? ");
        edad = captu.nextInt();
        
        if(edad < 65){
            System.out.println("No tienes riesgo alguno");
        }else if(edad >= 65){
            System.out.println("Cuál es tu altura en metros? (ejemplo: 1.50)");
            altura = captu.nextDouble();
            
            System.out.println("Cuál es tu peso en kilogramos? (ejemplo: 50");
            peso = captu.nextDouble();
            captu.nextLine();
            
            System.out.println("Tienes alguna enfermedad crónica?(si/no)");
            cronica = captu.nextLine();
            imc = (peso / (altura * altura));
            
        if(cronica.equals("si") || (imc >= 25)){
            System.out.println("Si tienes riesgo de tener covid");
        }else if(cronica.equals("no") || (imc < 25)){
            System.out.println("No tienes riesgo de tener covid");
        
        }else{
            System.out.println("si presentas riesgo de tener covid");
            
            
        }
        }
    }
    
}
