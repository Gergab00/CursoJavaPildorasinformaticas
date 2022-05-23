/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofactorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo
 */
public class EjercicioFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Escribe un número entero y positivo:");
        int número = Integer.parseInt(br.readLine());
        int a = número;
    if (número > 0){
        for ( int k = número; k > 1; k--) {
            a = a * (k-1);
        }System.out.println("El factorial de "+número+" es "+a);
    }else{System.out.println("Tú número tiene que ser entero y positivo");
                    }
    
    }
    
}
