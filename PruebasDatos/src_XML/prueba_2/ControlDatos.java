package prueba_2;

import java.util.ArrayList;

public class ControlDatos{

	private ArrayList<RegistroDatos> datos;
	//private int i;
	
	public ControlDatos() {
		// TODO Auto-generated constructor stub
		datos = new ArrayList<RegistroDatos>();
		
	}
	public void creaDatos(String st1, String st2, String st3, String st4){
		datos.add(new RegistroDatos(st1,st2,st3,st4));
	}
	
	public void leerDatos(int i){
			System.out.println(datos.get(i).dameDatos());
	}
	public RegistroDatos leerArray(int i){
		
		return datos.get(i);
	}

}
