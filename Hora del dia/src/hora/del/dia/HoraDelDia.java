/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora.del.dia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo
 */
public class HoraDelDia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Horas:");
    int horas = Integer.parseInt(br.readLine());
        System.out.print("Minutos:");
    int minutos = Integer.parseInt(br.readLine());
    /*
    00:00 a 07:00 - Madrugada
    07:01 a 11:59 - Mañana
    12:01 a 21:00 - Tarde
    21:01 a 23:59 - Noche
    
    12:00 - Mediodia
    00:00 - Medianoche
    */
    
    
    if(horas == 12 && minutos == 0)
        System.out.println("Mediodia");
    else
        if(horas == 0 && minutos == 0)
            System.out.println("Medianoche");
        else
            if(horas >= 0 && horas <= 7)
                    System.out.println("Madrugada");
            else
                if(horas > 7 && horas <=12)
                        System.out.println("Mañana");
                else
                    if(horas > 12 && horas <= 21)
                            System.out.println("Tarde");
                    else
                    if(horas > 21 && horas <= 23)
                            System.out.println("Noche");
    
    
}}
