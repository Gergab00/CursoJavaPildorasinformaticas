package poo;

import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche1=new Coche();
		
		micoche1.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		Furgoneta miFurgoneta1=new Furgoneta(7, 580);
		
		miFurgoneta1.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		miFurgoneta1.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero"));
		
		miFurgoneta1.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		
		System.out.println(micoche1.dime_datos_generales());
		
		System.out.println(miFurgoneta1.dime_datos_generales()+"\n"+miFurgoneta1.dimeDatosfurgoneta());
		
		/*Coche Renault=new Coche();//Instanciar una clase. Ejemplar de Clase
		
		System.out.println(Renault.dime_datos_generales());
		
		Coche micoche=new Coche();
		
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.dime_color());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println(micoche.precio_coche());*/
		

	}

}
