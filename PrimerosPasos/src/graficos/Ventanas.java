package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventanas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarcoNum marco1=new miMarcoNum();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarcoNum extends JFrame{

	public miMarcoNum(){
		
		setBounds(500,300,250,250);
		
		setTitle("Nombre Ventana");
		
		Lamina2 miLamina = new Lamina2();
		
		add(miLamina);
		
	}
	
}

class LaminaNum extends JPanel {
			
	public LaminaNum(){
		
	
	}
	
}