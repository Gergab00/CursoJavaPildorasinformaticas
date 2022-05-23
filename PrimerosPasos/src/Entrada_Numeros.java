import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1=JOptionPane.showInputDialog("Introduce un número:");
		
		double num2=Double.parseDouble(num1);//Convierte un dato String en una variable double
		
		System.out.print("La raíz de "+num2+" es ");// El método print no da salto de linea
		
		System.out.printf("%1.5f", Math.sqrt(num2));/*El método printf da formato a los números
		tiene que ir entre comillas con el simbolo de % al inicio y f al final*/

	}

}
