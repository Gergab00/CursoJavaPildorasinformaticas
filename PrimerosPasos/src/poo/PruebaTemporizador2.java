package poo;

import javax.swing.*;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reloj miReloj = new Reloj(/*3000,true*/);
		
		miReloj.enMarcha(3000,true);
		
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para Terminar");

	}

}

class Reloj{
	
	/*public Reloj(int intervalo, boolean sonido){
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
		
	}*//* Se puede prescindir del constructor con una clase local interna*/
	
	public void enMarcha(int intervalo, final boolean sonido){
		
		class DameLaHora2 implements ActionListener{/*Clase Interna Local, solo puede acceder el metodo
		donde se desarrolla*/
				
				public void actionPerformed(ActionEvent evento){
					
					Date ahora = new Date();
					
					System.out.println("Te pongo la hora cada 3 segundos" + ahora);
					
					if(sonido==true){
						
						Toolkit.getDefaultToolkit().beep();
						
					}
					
				}
				
			}
		
		ActionListener oyente = new DameLaHora2();
		
		Timer miTemporizador = new Timer(intervalo, oyente);
		
		miTemporizador.start();
		
	}
	
	/*private int intervalo; /*Se puede prescindir de estas variables*//*
	
	private boolean sonido;
	
	private class DameLaHora2 implements ActionListener{
		public void actionPerformed(ActionEvent evento){
			
			Date ahora = new Date();
			
			System.out.println("Te pongo la hora cada 3 segundos" + ahora);
			
			if(sonido==true){
				
				Toolkit.getDefaultToolkit().beep();
				
			}
			
		} 
	
	}/*Clase interna puede acceder los campos ejemplar
	de la clase principal sin necesidad metodos getter y setter*/
	
}