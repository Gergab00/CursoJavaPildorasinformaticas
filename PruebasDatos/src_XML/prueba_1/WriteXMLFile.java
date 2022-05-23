package prueba_1;

import java.io.*;
import java.util.Properties;

import javax.swing.JOptionPane;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class WriteXMLFile {

	private String nom, id_string;
	private DocumentBuilder docBuilder;
	private Element rootElement,empleado;
	private Document doc;
	//private boolean tf;
	
	public WriteXMLFile() throws ParserConfigurationException {
		// TODO Auto-generated constructor stub
		
	}
	
	public void NuevoDocumento() throws ParserConfigurationException{
		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		docBuilder = docFactory.newDocumentBuilder();
		
		
	}
	
	public void NuevaRaiz() throws ParserConfigurationException, SAXException, IOException{
		// elemento nom
		doc = docBuilder.newDocument();
		rootElement = doc.createElement("raiz");
		doc.appendChild(rootElement);
		
	}

	public void NuevosCampo(String n_string, String a_string, String e_string,int id) {
		// TODO Auto-generated method stub
		
		id_string=Integer.toString(id);
		
		// empleado
		empleado = doc.createElement("empleado");
		rootElement.appendChild(empleado);
		
 
		// atributo del elemento empleado
		Attr attr = doc.createAttribute("id");
		attr.setValue(id_string);
		empleado.setAttributeNode(attr);
 
		// nombre
		Element nombre = doc.createElement("nombre");
		nombre.appendChild(doc.createTextNode(n_string));
		empleado.appendChild(nombre);
 
		// apellidos
		Element apellidos = doc.createElement("appellidos");
		apellidos.appendChild(doc.createTextNode(a_string));
		empleado.appendChild(apellidos);
 
		// edad
		Element edad = doc.createElement("edad");
		edad.appendChild(doc.createTextNode(e_string));
		empleado.appendChild(edad);
 
		// salario
		/*Element salario = doc.createElement("salario");
		salario.appendChild(doc.createTextNode("1000"));
		empleado.appendChild(salario);*/	

	}

	public void creacionDocumento() throws IOException {
		// TODO Auto-generated method stub
		//this.tf=tf;
		// escribimos el contenido en un archivo .xml
		try {
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(doc,id_string);
		StreamResult result = new StreamResult(new File("src/creadorXML/archivo.xml"));
		
		
		//StreamResult result = new StreamResult(new File("archivo.xml"));
			 
		// Si se quiere mostrar por la consola...
		//StreamResult result = new StreamResult(System.out);
		transformer.transform(source, result);
		
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			 
		JOptionPane.showMessageDialog(null, "Archivo guardado!");
		
	}
	
	public void agregadoID(String ident){
		
		Attr attr = doc.createAttribute("id");
		attr.setValue(ident);
		empleado.setAttributeNode(attr);
		
	}
	
	public void agregadoNombre(String n_string){
		
		Element nombre = doc.createElement("nombre");
		nombre.appendChild(doc.createTextNode(n_string));
		empleado.appendChild(nombre);
	}
	
	public void agregadoApellido(String a_string){
		
		Element apellidos = doc.createElement("appellidos");
		apellidos.appendChild(doc.createTextNode(a_string));
		empleado.appendChild(apellidos);
		
	}
	
	public void agregadoEdad(String e_string){
		
		Element edad = doc.createElement("edad");
		edad.appendChild(doc.createTextNode(e_string));
		empleado.appendChild(edad);
		
	}
	
}
