import java.util.Scanner;//Paquete de clases que si va importar

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);/* Se crea un objeto que recibira información
		de la consola por el System.in*/
		
		System.out.println("Introduce tu nombre por favor:");
		
		String nombre_usuario=entrada.nextLine();// Se tiene que ingresar datos tipo String
		
		System.out.println("Introduce tu edad por favor:");
		
		int edad=entrada.nextInt();//Se tiene que introducir datos tipos int
		
		System.out.println("Hola "+nombre_usuario+" el año que viene tendras "+(edad+1)+" años");

	}

}
