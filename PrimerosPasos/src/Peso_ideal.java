import javax.swing.*;

public class Peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero="";
		
		do{
			
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en centimetros"));
		
		int peso_ideal=0;
		
		if(genero.equalsIgnoreCase("H")){
			
			peso_ideal=altura-110;
		
		}else if(genero.equalsIgnoreCase("M")){
			
			peso_ideal=altura-120;
			
		}
		
		JOptionPane.showMessageDialog(null, "Tu peso ideal es "+peso_ideal+"Kgs");

	}

}
