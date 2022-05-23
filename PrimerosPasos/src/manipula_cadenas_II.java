
public class manipula_cadenas_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		
		String frase_resumen=frase.substring(29, 57); /* Extrae una parte de la cadena
		de caracteres*/
				
		System.out.println(frase_resumen);
		
		String alumno1, alumno2;
		
		alumno1="Gerardo";
		
		alumno2="gerardo";
		
		System.out.println(alumno1.equals(alumno2));/*Compara dos cadenas de caracteres
		y arroja si son igual o no, tomando en cuenta mayusculas y minisculas*/
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));/*Compara dos cadenas de caracteres
		y arroja si son igual o no, SIN tomar en cuenta mayusculas y minisculas*/

	}

}
