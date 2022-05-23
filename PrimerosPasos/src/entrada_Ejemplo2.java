import javax.swing.*;

public class entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre por favor:");
		
		String edad=JOptionPane.showInputDialog("Hola "+nombre_usuario+" introduce tu edad por favor:");
		//Genera un cuadro de dialogo externo a la consolo
		
		System.out.println("Entonces "+nombre_usuario+" tienes "+edad+" años.");
		
		int edad_usuario=Integer.parseInt(edad);//Transforma un dato tipo String en uno entero
		
		System.out.println("Oye "+nombre_usuario+" el proximo año tendras "+(edad_usuario+1)+" años.");

	}

}
