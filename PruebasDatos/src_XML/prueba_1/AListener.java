package prueba_1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;
import javax.xml.parsers.*;

public class AListener implements ActionListener {

	private JPanel panel;
	private JTextField c_nombre,c_apellido,c_edad;
	private JButton boton1,boton2;
	private static int i=1;

	public AListener() {
		// TODO Auto-generated constructor stub

	}
	
	public AListener(JPanel panel) {
		// TODO Auto-generated constructor stub
		this.panel=panel;
	}

	public AListener(JPanel panel, JTextField c_nombre, JTextField c_apellido, JTextField c_edad) {
		// TODO Auto-generated constructor stub
		this.panel=panel;
		this.c_nombre=c_nombre;
		this.c_apellido=c_apellido;
		this.c_edad=c_edad;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
