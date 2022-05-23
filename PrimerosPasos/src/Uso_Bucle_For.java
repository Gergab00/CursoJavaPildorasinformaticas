import javax.swing.JOptionPane;

public class Uso_Bucle_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for(int i=1;i<11;i++){
			
			System.out.println(i+".- Gerardo");
			
		}*/

		int arroba=0;
		boolean punto=false;
		
		String email=JOptionPane.showInputDialog("Introduce tu mail");
		
		for(int i=0;i<email.length();i++){
			
			if(email.charAt(i)=='@'){
				
				arroba++;
			}
			
			if(email.charAt(i)=='.'){
				
				punto=true;
				
			}
			
		}
		if(arroba==1 && punto==true){
			
			System.out.println("Es correcto");
			
		}else{
			
			System.out.println("No es correcto");
			
		}
		
		
	}

}
