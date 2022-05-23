/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomodelarobjetos;

/**
 *
 * @author Gerardo
 */
public class EjercicioModelarObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Alumno n = new Alumno();
    n.setNombre("Gerardo");
    Alumno a = new Alumno();
    a.setApellidos("Gonzalez");
    Libro t = new Libro();
    t.setTitulo("Don Quijote");
    Libro ac = new Libro();
    ac.abrir();
    }
    
}
