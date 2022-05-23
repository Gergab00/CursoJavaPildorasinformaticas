package Varios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Lamina_Principal extends JPanel {
	
	private JButton boton_cerrar;
	
	private	JButton boton_nuevo;

	public Lamina_Principal(){
		
		boton_nuevo=new JButton("Calculadora");
		
		add(boton_nuevo);
		
		boton_cerrar=new JButton("Cerrar Todo");
		
		add(boton_cerrar);
		
		OyenteCalculadora oyenteCalculadora=new OyenteCalculadora();
		
		boton_nuevo.addActionListener(oyenteCalculadora);
		
		
	}
	
	private class OyenteCalculadora implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_Calculadora_Basica calculadora=new Marco_Calculadora_Basica(boton_cerrar,boton_nuevo);
			
			calculadora.setVisible(true);
			
		}
		
	}

}
