package prueba_1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class FrameXML extends JFrame {

	private WriteXMLFile file;
	private PanelXML datosPanel;
	private menuPanel panelMenu;
	private static int i;

	public FrameXML() throws ParserConfigurationException, IOException, SAXException {
		// Inicio variables-----------------------------------------------------
		i=1;
		
		//Creacion de elementos-------------------------------------------------
		
		JPanel principal=new JPanel();
		principal.setLayout(new BorderLayout());
		datosPanel=new PanelXML();
		panelMenu=new menuPanel();
		WL oyenteVentana = new WL();
		Listener oyente = new Listener();
		file = new WriteXMLFile();
		file.NuevoDocumento();
		file.NuevaRaiz();
		
		//Agregado de elementos----------------------------------------------------
		
		this.add(principal);
		principal.add(datosPanel, BorderLayout.CENTER);
		principal.add(panelMenu, BorderLayout.NORTH);
		datosPanel.getBoton("Guardar").addActionListener(oyente);
		datosPanel.getBoton("Crear").addActionListener(oyente);
		datosPanel.getBoton("Leer").addActionListener(oyente);
		datosPanel.getBoton("Guardar Documento").addActionListener(oyente);
		this.addWindowListener(oyenteVentana);
		
		//Configuracion de frame------------------------------------------------
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private class Listener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getActionCommand().equalsIgnoreCase("Crear")){
				datosPanel.getFieldNombre().setText("");
				datosPanel.getFieldApellido().setText("");
				datosPanel.getFieldEdad().setText("");
				
				i++;
				datosPanel.getID().setText(Integer.toString(i));
			}else if(e.getActionCommand().equalsIgnoreCase("Guardar")){
				file.NuevosCampo(datosPanel.getFieldNombre().getText(),
				datosPanel.getFieldApellido().getText(),datosPanel.getFieldEdad().getText(), i);

				JOptionPane.showMessageDialog(datosPanel, "Registro guardado");
			}else if(e.getActionCommand().equalsIgnoreCase("Leer")){
				ReaderXML newRead = new ReaderXML();
				newRead.leerDocumento();
				newRead.leerArchivo();
				//newRead.volcarArchivo();
				//i=newRead.obtenerID();
				//datosPanel.id_string.setText(Integer.toString(i));
			}else if(e.getActionCommand().equalsIgnoreCase("Guardar Documento")){
				
				try {
					file.creacionDocumento();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}

	}
	private class WL implements WindowListener{

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent wc) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent wcing) {
			// TODO Auto-generated method stub
			
			//System.out.println("cerrado");
			
			/*try {
				file.creacionDocumento();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
}
