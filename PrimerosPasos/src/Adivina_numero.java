import java.util.*;

public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100);/*Con random creamos un número aleatorio del 0 al 1
		lo multiplicamos por 100 y lo refundimos(convertimos) en un entero*/
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		
		int intentos=0;
		
		while(numero!=aleatorio){
			
			intentos++;
			
			System.out.println("Introduce un número por favor");
			
			numero=entrada.nextInt();
			
			if(aleatorio<numero){
				
				System.out.println("El número que hay que encontrar es mas bajo");
				System.out.println("Intentos: "+intentos);
			}
			else if(aleatorio>numero){
				
				System.out.println("El número que tienes que encontrar es mas alto");
				System.out.println("Intentos: "+intentos);
			}
		}
		
		System.out.println("El número que escogiste es igual al de la maquina");
		System.out.println("Lo conseguiste en "+intentos+" intentos.");

	}

}
