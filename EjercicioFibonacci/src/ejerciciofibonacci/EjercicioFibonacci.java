/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofibonacci;

import static ejerciciofibonacci.EjercicioFibonacci.fibonacci;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo
 */
public class EjercicioFibonacci {

    static int fibonacci(int f){
        if( f <= 1)
            return 1;
        else
            return fibonacci(f-1)+fibonacci(f-2);
    }
    
   
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Escribe un número entero:");
        int a = Integer.parseInt(br.readLine());
        
        for (int i = a; i > 0; i--) {
        
        fibonacci(i);
        System.out.print("El número Fibonacci de "+i+" es:");
        System.out.println(fibonacci(i));
        
    }   
}
}
