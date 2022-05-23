/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciooperaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo
 */
public class EjercicioOperaciones {

    /**
     * @param args the command line arguments
     Hacer un programa que muestre en pantalla todas las operaciones posible
     con dos numeros dados por el usuario que la maquina tiene que pedir.
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int a;
        double b;
        
        System.out.print("Escribe un número entero:");
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String y = br.readLine();
        
        System.out.print("Escribe un número real:");
        String  x = br.readLine();
        
        a = Integer.parseInt(y);
        b = Double.parseDouble(x);
        
        System.out.println("La suma es: "+(a+b));
        System.out.println("La resta es: "+(a-b));
        System.out.println("La multiplicación es: "+(a*b));
        System.out.println("La división es: "+(a/b));
    }
    
}
