package prueba_1;

import java.io.IOException;
import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;

public class PanelXML extends JPanel{
	
	private JTextField c_nombre,c_apellido,c_edad;
	private JButton guardar,crear,leer, guardar_doc;
	JTextField id_string;

	public PanelXML() throws ParserConfigurationException, IOException {
		// TODO Auto-generated constructor stub
		
		setLayout(new EnColumnas());
		
		JLabel nombre = new JLabel("Nombre: ");
		JLabel apellido = new JLabel("Apellido: ");
		JLabel edad = new JLabel("Edad: ");
		JLabel id_label = new JLabel("ID: ");
		id_string = new JTextField("1");
		c_nombre = new JTextField();
		c_apellido = new JTextField();
		c_edad = new JTextField();
		guardar = new JButton("Guardar"); 
		crear = new JButton("Crear");
		leer = new JButton("Leer");
		guardar_doc = new JButton("Guardar Documento");
		
		this.add(id_label);
		this.add(id_string);
		this.add(nombre);
		this.add(c_nombre);
		this.add(apellido);
		this.add(c_apellido);
		this.add(edad);
		this.add(c_edad);
		this.add(guardar);
		this.add(crear);
		this.add(leer);
		this.add(guardar_doc);
				
	}
	
	public JTextField getFieldNombre(){
		
		return c_nombre;
		
	}
	
	public JTextField getFieldApellido(){
		
		return c_apellido;
		
	}
	
	public JTextField getFieldEdad(){
		
		return c_edad;
		
	}
	
	public JButton getBoton(String nom){
		
		JButton boton=null;
		
		if(nom.equalsIgnoreCase("guardar")){
		
			 boton=guardar;
			
		}else if(nom.equalsIgnoreCase("crear")){
		
			boton= crear;
			
		}else if(nom.equalsIgnoreCase("leer")){
		
			boton= leer;
			
		}else if(nom.equalsIgnoreCase("Guardar Documento")){
		
			boton= guardar_doc;
			
		}
		
		return boton;
		
	}
	
	public JTextField getID(){
		
		return id_string;
	}
}
