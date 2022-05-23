package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco3 marco1=new miMarco3();
		
		marco1.setVisible(true);
		
		marco1.setTitle("Ventana 1");
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco3 marco2=new miMarco3();
		
		marco2.setVisible(true);
		
		marco2.setTitle("Ventana 2");
		
		marco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

}

class miMarco3 extends JFrame{

	public miMarco3(){
		
		setBounds(500,300,250,250);
		
		//setTitle("Nombre Ventana");
		
		MVentana oyenteVentana = new MVentana();
		
		addWindowListener(oyenteVentana);
		
		
		
	}
	
}

class MVentana implements WindowListener{

	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana Activada");
		
	}

	public void windowClosed(WindowEvent e) {
		
		System.out.println("Ventana Cerrada");	
		
	}

	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando Ventana");
		
	}

	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana Desactivada");
		
	}

	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana Restaurada");
		
	}

	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("Ventana Minimizada");
		
	}

	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");
		
	}
	
}