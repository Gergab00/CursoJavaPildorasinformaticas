import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1=JOptionPane.showInputDialog("Introduce un n�mero:");
		
		double num2=Double.parseDouble(num1);//Convierte un dato String en una variable double
		
		System.out.print("La ra�z de "+num2+" es ");// El m�todo print no da salto de linea
		
		System.out.printf("%1.5f", Math.sqrt(num2));/*El m�todo printf da formato a los n�meros
		tiene que ir entre comillas con el simbolo de % al inicio y f al final*/

	}

}
