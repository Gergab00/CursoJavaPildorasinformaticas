package prueba_1;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;

import java.io.File;

public class ReaderXML {

	private static File archivo;
	private NodeList nList;
	 
public ReaderXML(){
	
}	
public void leerDocumento(){
	String rutaAlArchivo = "src/creadorXML/archivo.xml";
    
	 	archivo = new File(rutaAlArchivo);
	 	
	 if(archivo.exists()){
		 
		 try{

	 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	 DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	 Document doc = dBuilder.parse(archivo);
	 System.out.println("Elemento Raiz -> " + doc.getDocumentElement().getNodeName());
	 doc.getDocumentElement().normalize();
	 nList = doc.getElementsByTagName("empleado");
	 }catch(Exception e){
		 e.printStackTrace();
		 System.out.println("ERROR: NO EXISTE EL ARCHIVO.");
	 	} 
     }else{
    	 
     }

}
public void leerArchivo(){
    	 
   		 try{
   			 
   			 for (int temp = 0; temp < nList.getLength(); temp++) {
                           	
   				 Node nNode = nList.item(temp);
   				 NamedNodeMap newMap = nNode.getAttributes();
   				                            	
   				 System.out.println("\nElemento Inicial :" + nNode.getNodeName()+" "+newMap.item(0));
                       		
   				 NodeList nList2 = nNode.getChildNodes();
                        		
   				 for (int temp2 = 0; temp2 < nList2.getLength(); temp2++) {
                        		
   					 Node nNode2 = nList2.item(temp2);
                        			
   					 System.out.println("\nElemento Actual :" + nNode2.getNodeName()+": "+nNode2.getTextContent());
    					 
   				 }
   			 }
   		 }catch(Exception e){
   			 e.printStackTrace();
   			 System.out.println("ERROR: LEYENDO ARCHIVO XML." );
    			 
   		 }
	}
public void volcarArchivo(){
 
		 try{
			 
			 WriteXMLFile volcado = new WriteXMLFile();
			 volcado.NuevoDocumento();
			 volcado.NuevaRaiz();
			 
			 for (int temp = 0; temp < nList.getLength(); temp++) {
                      	
				 Node nNode = nList.item(temp);
				 NamedNodeMap newMap = nNode.getAttributes();
				 volcado.agregadoID(newMap.item(0).toString());
				                            	
				 System.out.println("\nElemento Inicial :" + nNode.getNodeName()+" "+newMap.item(0));
                  		
				 NodeList nList2 = nNode.getChildNodes();
                   		
				 for (int temp2 = 0; temp2 < nList2.getLength(); temp2++) {
                   		
					 Node nNode2 = nList2.item(temp2);
					 if(nNode2.getNodeName()=="nombre"){
						 volcado.agregadoNombre(nNode2.getTextContent());
					 }else if(nNode2.getNodeName()=="apellidos"){
						 volcado.agregadoApellido(nNode2.getTextContent());
					 }else if(nNode2.getNodeName()=="edad"){
						 volcado.agregadoEdad(nNode2.getTextContent());
					 }
                   			
					 System.out.println("\nElemento Actual :" + nNode2.getNodeName()+": "+nNode2.getTextContent());
					 
				 }
			 }
		 }catch(Exception e){
			 e.printStackTrace();
			 System.out.println("ERROR: LEYENDO ARCHIVO XML." );
			 
		 }
	}
public int obtenerID(){
	
	int id_int=0;
	
	for (int temp = 0; temp < nList.getLength(); temp++) {
      	
		 Node nNode = nList.item(temp);
		 NamedNodeMap newMap = nNode.getAttributes();
		 id_int=Integer.parseInt(newMap.item(0).toString());
		 }
	
	return id_int;

	}
}
     