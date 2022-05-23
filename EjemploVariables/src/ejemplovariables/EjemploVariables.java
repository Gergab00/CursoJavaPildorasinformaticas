/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplovariables;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Gerardo
 */
public class EjemploVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    int a;
    int b;
    double c;
    double d;
    a = 5;
    c = a;
    a = (int)c;
    
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    
    String s = br.readLine();
    
        System.out.println("La variable s vale: "+s);
    
    b = Integer.parseInt(s);
    c = Double.parseDouble(s);
    
    System.out.println(a+b+c);
    System.out.println(a-b-c);
    System.out.println(a*b*c);
    System.out.println(b/c);
    }
    
}
