/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprobadosuspendido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo
 */
public class EjercicioAprobadoSuspendido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.print("Escribe la calificacion del 0 al 10: ");
        int calificacion = Integer.parseInt(br.readLine());
    switch (calificacion)
    {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Reprobado");
                break;
            case 6:
            case 7:
                System.out.println("Notable");
                break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Error 01: La calificacion no es correcta");
    }
    }
}
   