package prueba_1;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class menuPanel extends JPanel {

	public menuPanel() {
		// TODO Auto-generated constructor stub
		JMenuBar barraMenu = new JMenuBar();
		JMenu archivo = new JMenu("Archivo"); 
		this.add(barraMenu);
		barraMenu.add(archivo);
	}

}
