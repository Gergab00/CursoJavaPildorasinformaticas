
public class Calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raiz=Math.sqrt(9);
		
		System.out.println(raiz);
		
		double num1=5.85;
		
		int resultado=(int)Math.round(num1); /*Convierte una variable de tipo double
		en un entero redondenando. Refundición*/
		
		System.out.println(resultado);
		
		double base=5;
		
		double exponente=3;
		
		int resultado2=(int) Math.pow(base, exponente);
		
		System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+resultado2);

	}

}
