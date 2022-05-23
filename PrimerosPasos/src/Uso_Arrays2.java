import javax.swing.*;

import javax.swing.JOptionPane;

public class Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[]paises=new String[8];
		
		for(int i=0;i<8;i++){
			
			paises[i]=JOptionPane.showInputDialog("Introduce Pais "+(i+1));
		}
		
		for(String elemento:paises){
			
			System.out.println("País "+elemento);
			
		}

	}

}
