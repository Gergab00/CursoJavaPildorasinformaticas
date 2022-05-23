
public class manipula_cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="Gerardo";
		
		System.out.println("Mi nombre es: "+nombre);
		
		System.out.println("Mi nombre tiene: "+nombre.length()+" letras.");
		//Cuenta el número de letras de una cadena de caracteres
		System.out.println("La primera letra de mi nombre es: "+nombre.charAt(0));
		//Arroja el caracter que esta en una determinada posición empezando de cero
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("La ultima letra es la: "+nombre.charAt(ultima_letra-1));

	}

}
