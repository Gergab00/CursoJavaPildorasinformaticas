
public class Declaracion_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a=5;
		short b;
		b=7;
		double c=b+a;
		c++;// Se incrementa en uno la variable
		
		System.out.println(c);
		
		c+=6;//Se incrementa en 6 la variable
		System.out.println(c);
		
		c=a/b;
		
		System.out.println(c);
		
		final byte d=5; //Declaración de una constante
		
		System.out.println(d);
		
		final double apulgadas=2.54;
		
		double cm=6;
		
		double resultado=cm/apulgadas;
		
		System.out.println("En "+cm+" cm hay "+resultado+" pulgadas");

		int operador1, operador2, resultado2; //Es posible declarar varias variables del mismo tipo en una linea 
		
		operador1=8;
		
		operador2=7;
		
		resultado2=operador1+operador2;
		
		System.out.println(resultado2);
	}

}
