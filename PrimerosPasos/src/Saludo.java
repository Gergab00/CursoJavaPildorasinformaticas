
import javax.swing.JOptionPane;

public class Saludo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Gerardo Gonz�lez";
		
		int edad_a�os=28;
		
		String estudios= "Administrador de empresas";
		
		String alma_mater="Escuela Bancaria y Comercial";
		
		String programacion="Estoy estudiando programaci�n por mi cuenta, ya tenia conocimientos de pascal y pseudocodigo. ";
		
		String plataforma= "Eclipse y NetBeans";
		
		JOptionPane.showMessageDialog(null, "Hola mi nombre es "+nombre+" tengo "+edad_a�os+" a�os.");
		JOptionPane.showMessageDialog(null, "Estudie "+estudios+" en "+alma_mater);
		JOptionPane.showMessageDialog(null, programacion+"Uso los interpretes "+plataforma);

	}

}
