package poo;

public class Coche {
	
	private int ruedas;//Cuantas ruedas tiene
	
	private int largo;//Que tan largo es
	
	private int ancho;//Que tan ancho es
	
	private int motor;//De cuantos centimetros cubicos tiene
	
	private int peso_plataforma;//Cuanto pesa
	
	private String color;
	
	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	public Coche(){
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;
		
	}
	
	public String dime_datos_generales(){//Método GETTER
		
		return "La plataforma del vehículo tiene "+ruedas+" ruedas. "+
		"\nMide "+largo/1000+" metros con un ancho de "+ancho+
		" cm \ny un peso de plataforma "+peso_plataforma+" kgs. Y el color es "+color;
	}
	
	public void establece_color(String color_coche){//Método SETTER (lleva VOID)
		
		color=color_coche;
		
	}
	
	public String dime_color(){
		
		return "El color del coche es "+color;
	}
	
	public void  configura_asientos(String asientos_cuero){//Setter
		
		if(asientos_cuero.equalsIgnoreCase("si")){
			
			this.asientos_cuero=true;
			
		}else{
			
			this.asientos_cuero=false;
			
		}
	}
	
	public String dime_asientos(){
		
		if(asientos_cuero==true){
		
			return "El coche tiene asientos de cuero";
			
		}else{
			
			return "El coche tiene asientos de serie";
			
		}
	}
	
	public void configura_climatizador(String climatizador){
		
		if(climatizador.equalsIgnoreCase("si")){ //SETTER
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador(){ //GETTER
		
		if(climatizador==true){
			
			return "El coche incorpora climatizador";
		
		}else{
			
			return "El coche lleva aire acondicionado";
					
		}
		
	}
	
	public String dime_peso_coche(){ //SETTER+GETTER
		
		int peso_carroceria=500;
		
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true){
			
			peso_total=peso_total+50;
		}if(climatizador==true){
			
			peso_total=peso_total+20;
			
		}
		
		return "El peso del coche es "+peso_total+"kgs.";
	}
	
	public int precio_coche(){
		
		int precio_final=10000;
		
		if(asientos_cuero==true){
			
			precio_final+=2000;
			
		}if(climatizador==true){
			
			precio_final+=1500;
		
		}
		
		return precio_final;
	}

}
