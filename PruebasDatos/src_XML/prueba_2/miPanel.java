package prueba_2;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class miPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public miPanel() {
		// TODO Auto-generated constructor stub
		System.out.println("¡Panel Creado!");
		
//Creación de elementos---------------------------------------------------------------------------------------------------
		//Paneles
		JPanel botones = new JPanel();
		JPanel campos = new JPanel();
		JPanel control = new JPanel();
		
		//Etiquetas
		JLabel newLabel = new JLabel("ID:");
		JLabel newLabel2 = new JLabel("Nombre:");
		JLabel newLabel3 = new JLabel("Apellido:");
		JLabel newLabel4 = new JLabel("Telefono:");
		JLabel newLabel5 = new JLabel("Ruta del archivo:");
		
		//Campos
		JTextField newField = new JTextField("1",25);
		JTextField newField2 = new JTextField(25);
		JTextField newField3 = new JTextField(25);
		JTextField newField4 = new JTextField(25);
		JTextField newField5 = new JTextField(20);
		
		//Botones
		JButton newBoton = new JButton();
		JButton newBoton2 = new JButton();
		JButton newBoton3 = new JButton();
		JButton newBoton4 = new JButton();
		JButton newBoton5 = new JButton();
		
		//Oyentes
		miOyente newOyente = new miOyente();
		
		//Array
		ControlDatos nuevoControl = new ControlDatos();
		newOyente.obtenArray(nuevoControl);

//Configuración de elementos----------------------------------------------------------------------------------------------
		//Laminas
		this.setLayout(new BorderLayout());
		campos.setLayout(new GridLayout(4,2,5,15));
		control.setBorder(new TitledBorder("Herramientas Archivo"));
		campos.setBorder(new TitledBorder("Campos de llenado"));
		botones.setBorder(new TitledBorder("Herramientas de XML"));
		
		//Campos
		newField.setName("ID");
		newField2.setName("Nombre");
		newField3.setName("Apellido");
		newField4.setName("Telefono");
		newField5.setName("Ruta");
		
		//Botones
		newBoton.setName("Guardar");
		newBoton.setText("Guardar");
		newBoton2.setName("Nuevo");
		newBoton2.setText("Nuevo");
		newBoton3.setName("Leer");
		newBoton3.setText("Leer");
		newBoton4.setName("Cerrar");
		newBoton4.setText("Cerrar");
		newBoton5.setName("Crear Archivo");
		newBoton5.setText("Crear Archivo");
		
		//Oyentes
		newBoton.addActionListener(newOyente);
		newBoton2.addActionListener(newOyente);
		newBoton3.addActionListener(newOyente);
		newBoton4.addActionListener(newOyente);
		newBoton5.addActionListener(newOyente);
		newOyente.obtenCampos(newField,newField2,newField3,newField4,newField5);
		
//Agregado de elementos---------------------------------------------------------------------------------------------------
		//Paneles
		this.add(botones,BorderLayout.SOUTH);
		this.add(campos,BorderLayout.CENTER);
		this.add(control,BorderLayout.NORTH);
		
		//Etiquetas y campos
		control.add(newLabel5);
		control.add(newField5);
		campos.add(newLabel);
		campos.add(newField);
		campos.add(newLabel2);
		campos.add(newField2);
		campos.add(newLabel3);
		campos.add(newField3);
		campos.add(newLabel4);
		campos.add(newField4);
		
		//Botones
		botones.add(newBoton);
		botones.add(newBoton2);
		botones.add(newBoton3);
		botones.add(newBoton4);
		control.add(newBoton5);
		
	}

}
