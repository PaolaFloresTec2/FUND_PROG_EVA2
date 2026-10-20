/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_expresiones_booleanas;

/**
 *
 * @author paola
 */
public class EVA2_13_EXPRESIONES_BOOLEANAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OPERACIONES BOOLEANAS
        //AND --> Y ---->&&
        //NOT --> O ----> ||
        //OR --> NEGACIÓN ---> !
        
        boolean entrarAntro, tieneCredencial = true;
        int edad = 18;
        
        //AND --> PARA QUE SEA VERDAD, AMBAS EXPRESIONES DEBEN SER VERDAD (TRUE)
        entrarAntro = (edad >= 18) && (tieneCredencial == true);
        System.out.println(entrarAntro);
        
        //OR --> PARA QUE SEA VERDAD, SOLO UNA (CUALQUIERA) DEBE SER VERDAD
        boolean estaSoleado = false, tienesDinero = false;
        boolean permisoSalir;
        
        permisoSalir = (estaSoleado == true) || (tienesDinero == true);
        System.out.println("Permiso para salir de paseo: " + permisoSalir);
        
        
    }
    
}
