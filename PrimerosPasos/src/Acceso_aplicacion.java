import javax.swing.*;

public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="Gerardo";
		String pass="";
		
		while(clave.equals(pass)==false){
			
			pass=JOptionPane.showInputDialog("Introduce la contraseņa por favor:");
			
			if(clave.equals(pass)==false){
				
				JOptionPane.showMessageDialog(null, "Contraseņa incorrecta");
				System.out.println("Contraseņa incorrecta");
			}
		
		}
		
		JOptionPane.showMessageDialog(null, "Contraseņa correcta. Acceso permitido");
		System.out.println("Contraseņa correcta. Acceso permitido");

	}

}
