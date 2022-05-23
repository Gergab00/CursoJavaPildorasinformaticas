package prueba_2;

import javax.swing.JFrame;

public class miMarco extends JFrame {

	private static final long serialVersionUID = 1L;

	public miMarco() {
		// TODO Auto-generated constructor stub
		System.out.println("¡Marco Creado!");
		miPanel nuevoPanel = new miPanel();
		this.add(nuevoPanel);
		
	}

}
