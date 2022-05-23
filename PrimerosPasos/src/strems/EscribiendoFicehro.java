package strems;

import java.io.FileWriter;
import java.io.IOException;

public class EscribiendoFicehro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Escribiendo accede_es = new Escribiendo();
	
	accede_es.escribir();

	}

}
class Escribiendo{
	
	public void escribir(){
		String frase="Esto\nes\nuna\nprueba\nde\nescritura";
		
		try {
			FileWriter escritura = new FileWriter("src/strems/archivo.txt");
			
			for(int i=0;i<frase.length();i++){
				
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("El archivo no existe");
			e.printStackTrace();
		}
	}
}
