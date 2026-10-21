/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_ciclos_bucles;

/**
 *
 * @author paola
 */
public class EVA2_21_CICLOS_BUCLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //REPETICIÓN DE INSTRUCCIONES
        
        //FOR --> CUANDO SABEMOS EL # DE REPETICIONES
        //WHILE --> PUEDEN SER CERO O N REPETICIONES
        //DO WHILE --> PUEDEN SER 1 O N REPETICIONES
        
        //acceso por indices -->i
        // IMPRIMIR UN LISTADO DEL 1 AL 10
        //3 parámetros (punto de partida, condicion para detenerse, avance)
        //avance de uno en uno
        
        
        for(int i = 1; i <= 10; i++){
            //INSTRUCCIONES A REPETIR
            System.out.print(i + " - ");     
        }
        System.out.println();
        //20 22 24 26 28 30 32 34 36 38
        for(int i = 20; i <= 38; i+=2){
            System.out.print(i + " - ");
        }
        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.print(i + " - ");
        }
        //del 10 al 1
        //PARES ENTRE 0 Y 20
        
        System.out.println();
        for(int i = 10; i >= 1; i--){
            System.out.print(i + " - ");
        } 
        System.out.println();
        for(int i = 0; i <=  20; i++){
            System.out.print(i + " - ");
        }
    }
    
}
