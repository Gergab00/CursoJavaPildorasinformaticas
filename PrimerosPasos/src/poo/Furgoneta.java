package poo;

public class Furgoneta extends Coche {/*Se usa para llamar a otra clase y generar la herencia, en este
caso Furgoneta es la sub clase y Coche es la super clase*/

	private int capacidad_carga;
	
	private int plazas_extra;
	
	public Furgoneta(int plazas_extra, int capacidad_carga){
		
		super(); /*Llamar al constructor de la clase padre o super clase*/
		
		this.capacidad_carga=capacidad_carga;
		
		this.plazas_extra=plazas_extra;
						
	}
	
	public String dimeDatosfurgoneta(){
		
		return "La capacidad de carga es: "+capacidad_carga+". Y las plazas son: "+plazas_extra;
		
	}

}
