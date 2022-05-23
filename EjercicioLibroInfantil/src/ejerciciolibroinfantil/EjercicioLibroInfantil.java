/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolibroinfantil;

/**
 *
 * @author Gerardo
 */
public class EjercicioLibroInfantil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       LibroInfantil l = new LibroInfantil ();
       
       
       if(l.esRecomendable(7))
            System.out.println("Si es recomendable");
       else
            System.out.println("No es recomendable");
    }
    
}
