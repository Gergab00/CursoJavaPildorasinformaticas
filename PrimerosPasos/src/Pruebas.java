

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1=new Empleados("Gerardo");
		
		Empleados trabajador2=new Empleados("Nohemi");
		
		Empleados trabajador3=new Empleados("Gabriel");
		
		Empleados trabajador4=new Empleados("Azul");
		
		trabajador1.cambioSeccion("Contabilidad");
		
		//trabajador1.cambioNombre("Gabriel");
		
		System.out.println(trabajador1.devuelveDatos());
			
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados{
	
	public Empleados(String nom){
		
		nombre=nom;
		
		seccion="Administración";
		
		Id=IdSiguiente;
		
		IdSiguiente++;
		
	}
	
	public void cambioSeccion(String seccion){
		
		this.seccion=seccion;
		
	}
	
	/*public void cambioNombre(String nombre){
		
		this.nombre=nombre;
		
	}*/
	
	public String devuelveDatos(){
		
		return "El nombre es: "+nombre+" la sección es "+seccion+" el Id es "+Id+".";
	}
	
	public static String dameIdSiguiente(){
		
		return "El IdSiguiente es: "+IdSiguiente;
	}
	
	private final String nombre;
	
	private String seccion;
	
	private int Id;
	
	private static int IdSiguiente=1;
}