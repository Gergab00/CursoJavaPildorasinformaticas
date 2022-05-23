package Varios;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Marco_Principal extends JFrame {
	
	public Marco_Principal(){
		
		setTitle("Tech360");
		
		setBounds(900,100,300,200);
		
		Lamina_Principal laminaMenuPrincipal=new Lamina_Principal();
		
		add(laminaMenuPrincipal);
		
	}

}
