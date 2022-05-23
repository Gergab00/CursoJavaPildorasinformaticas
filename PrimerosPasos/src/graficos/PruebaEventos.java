package graficos;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco2 marco1=new miMarco2();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco2 extends JFrame{

	public miMarco2(){
		
		setBounds(500,300,250,250);
		
		setTitle("Mi Ventana");
		
		Lamina2 miLamina = new Lamina2();
		
		add(miLamina);
		
	}
	
}

class Lamina2 extends JPanel implements ActionListener {
	
	JButton botonAzul=new JButton("Azul");
	JButton botonAmarillo=new JButton("Amarillo");
	JButton botonRojo=new JButton("Rojo");
		
	public Lamina2(){
		
		add(botonAzul);
		botonAzul.addActionListener(this);
		
		add(botonAmarillo);
		botonAmarillo.addActionListener(this);
		
		add(botonRojo);
		botonRojo.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object botonPulsado=e.getSource();
		
		if(botonPulsado==botonAzul){
		
		setBackground(Color.blue);
		
		}else if (botonPulsado==botonAmarillo){
			
			setBackground(Color.yellow);
			
		}else{
			
			setBackground(Color.red);
			
		}
		
	}
	
}

class M_Ventana implements WindowListener{

	public void windowActivated(WindowEvent e) {}

	public void windowClosed(WindowEvent e) {}

	public void windowClosing(WindowEvent e) {}

	public void windowDeactivated(WindowEvent e) {}

	public void windowDeiconified(WindowEvent e) {}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana Minimizada");
		
	}

	public void windowOpened(WindowEvent e) {}
	
	
	
}