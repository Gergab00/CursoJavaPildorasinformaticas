import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Gerardo";
		String pass="";
		
		while(clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduce la contrase�a por favor:");
			
			if(clave.equals(pass)==false){
				
				JOptionPane.showMessageDialog(null, "Contrase�a incorrecta");
				System.out.println("Contrase�a incorrecta");
			}
		
		}
		
		JOptionPane.showMessageDialog(null, "Contrase�a correcta. Acceso permitido");
		System.out.println("Contrase�a correcta. Acceso permitido");

	}

}
