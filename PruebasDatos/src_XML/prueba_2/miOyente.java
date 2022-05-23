package prueba_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class miOyente implements ActionListener {
	
	private JTextField textField, textField2, textField3, textField4, textField5;

	private ControlDatos controlDatos;
	
	private static int id=0;

	public miOyente() {
		// TODO Auto-generated constructor stub
	}
	
	public void obtenArray(ControlDatos controlDatos){
		this.controlDatos=controlDatos;
	}
	public void obtenCampos(JTextField textField, JTextField textField2, JTextField textField3, JTextField textField4, JTextField textField5){
		this.textField=textField;
		this.textField2=textField2;
		this.textField3=textField3;
		this.textField4=textField4;
		this.textField5=textField5;
	}
	
	public int devuelveID(){
		
		return id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
		if(e.getActionCommand()=="Guardar"){
			controlDatos.creaDatos(textField.getText(),textField2.getText(),textField3.getText(),textField4.getText());
		}else if(e.getActionCommand()=="Nuevo"){
			id++;
			String id_string=Integer.toString(id);
			textField.setText(id_string);
			textField2.setText("");
			textField3.setText("");
			textField4.setText("");
			textField5.setText("");
		}else if(e.getActionCommand()=="Cerrar"){
			System.exit(1);
		}else if(e.getActionCommand()=="Crear XML"){
			System.out.println("XML Creado");
		}else if(e.getActionCommand()=="Leer"){
			controlDatos.leerDatos((Integer.parseInt(textField.getText()))-1);
			textField2.setText(controlDatos.leerArray((Integer.parseInt(textField.getText()))-1).getNombre());
			textField3.setText(controlDatos.leerArray((Integer.parseInt(textField.getText()))-1).getNombre());
			textField4.setText(controlDatos.leerArray((Integer.parseInt(textField.getText()))-1).getNombre());
		}else if(e.getActionCommand()=="Crear Archivo"){
			System.out.println("Exito");
		}

	}

}
