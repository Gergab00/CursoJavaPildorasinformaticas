package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jefatura jefe_RRHH=new Jefatura("Gabriel González",125000,2000,06,11);
		
		jefe_RRHH.estableceIncentivo(12000);
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados [0]=new Empleado("Nohemi Moreno", 85000,2009,04,14);
		
		misEmpleados [1]=new Empleado("Gerardo Gonzalez", 95000,2006,10,19);
		
		misEmpleados [2]=new Empleado("Maria Velazquez", 65000,2010,01,22);
		
		misEmpleados [3]=new Empleado("Azul Gonzalez");
		
		misEmpleados [4]=jefe_RRHH;/*Polimorfismo o principio de sustición. El array espera un objeto
		de tipo empleado pero se agrega el objeto tipo Jefatura*/
		
		misEmpleados [5]=new Jefatura("Jaime Moreno",110000,2010,01,24);
		
		Jefatura jefeFinanzas=(Jefatura)misEmpleados[5];
		
		jefeFinanzas.estableceIncentivo(55000);
		
		System.out.println(jefeFinanzas.tomar_decisiones("Dar más días de vacaciones a los empleados"));
		
		System.out.println("El jefe"+ jefeFinanzas.dameNombre()+" tiene un bonus de "+ jefeFinanzas.establece_bonus(500));
		
		for(Empleado e: misEmpleados){
			
			e.subeSueldo(5);
			
		}
		
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados){
			
			System.out.println("ID: "+e.dameID()+" Nombre: "+e.dameNombre()+". Sueldo: "+e.dameSueldo()
			+". Fecha de Alta: "+e.dameFechaContrato()+".");
			
		}
		
	}

}

class Empleado implements Comparable, Trabajadores {
	
	public Empleado(String nom, double sue, int agno, int mes, int dia){
		
		nombre=nom;
		
		sueldo=sue;
		
		GregorianCalendar Calendario=new GregorianCalendar(agno,(mes-1),dia);
		
		altaContrato=Calendario.getTime();
		
		++IdSiguiente;
		
		Id=IdSiguiente;
		
		
	}
	
	public double  establece_bonus(double gratificacion){
		
		return Trabajadores.bonus_base+gratificacion;
		
	}
	
	public Empleado(String nom){
		
		this(nom, 3000,2000,01,01);//El this llama al otro constructor
		
	}
	
	public String dameNombre(){ //GETTER
		
		return nombre;
		
	}
	
	public double dameSueldo(){ //GETTER
		
		return sueldo;
		
	}
	
	public Date  dameFechaContrato(){ //GETTER
		
		return altaContrato;
		
	}
	
	public void subeSueldo(double porcentaje){ //SETTER
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
	
	}
	
	public int dameID(){
		
		return Id;
		
	}
	
	public int compareTo(Object miObjeto){ /*Tiene que retornar un numero negativo positivo o cero*/ 
		
		Empleado otroEmpleado=(Empleado) miObjeto;/*Refundición o casting. Convierte un elemento
		de un tipo a otro*/
		
		if(this.sueldo<otroEmpleado.sueldo){
			
			return-1;
			
		}if(this.sueldo>otroEmpleado.sueldo){
			
			return 1;
			
		}
		
		return 0;
		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
	
	private static int IdSiguiente;
	
	private int Id;
	
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia){
		
		super(nom, sue, agno, mes, dia);
		
	}
	
	public String tomar_decisiones(String decision){/*Se tiene que generar el metodo de la interface*/
		
		return "Un miembro de la dirección ha tomado la decision de: "+decision;
		
	}
	
	public double establece_bonus(double gratificacion){
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}
	
	public void estableceIncentivo(double b){
		
		incentivo=b;
		
	}
	
	public double dameSueldo(){
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
		
	}
	
	private double incentivo;
	
}
