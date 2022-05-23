/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioacertarnumero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


/**
 *
 * @author Gerardo
 */
public class EjercicioAcertarNumero {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Random rnd = new Random();
        int a = rnd.nextInt(101);
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        int b;
        String salir = "";
        
        do{ 
            System.out.print("Escribe un número del 0 al 100 para continuar:");
            b = Integer.parseInt(br.readLine());
            if(a == b){System.out.println("Felicidades acertaste el número que eligio la maquina");
            }else
            {
            if( b < a){System.out.println("Tu número es menor que el de la maquina.");
            }else
            {
            System.out.println("Tu número es mayor que el de la maquina.");
            }
            System.out.print("Deseas ingresar otro número?? (s|n):");
            salir = br.readLine();}
        }while((a != b) && ( salir.equals("s")));
        
    }
}    
