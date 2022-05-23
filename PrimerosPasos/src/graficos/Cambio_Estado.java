package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cambio_Estado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarcoEstado marco1=new miMarcoEstado();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarcoEstado extends JFrame{

	public miMarcoEstado(){
		
		setBounds(500,300,250,250);
		
		setTitle("Nombre Ventana");
		
		CambiaEstado nuevoEstado=new CambiaEstado();
		
		addWindowStateListener(nuevoEstado);
		
	}
	
}

class CambiaEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("La ventana a cambiado de estado");
		
	}
	
	
	
}