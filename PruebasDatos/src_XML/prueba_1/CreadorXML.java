package prueba_1;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

public class CreadorXML {

	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		// TODO Auto-generated method stub
		
		FrameXML newFrame=new FrameXML();
		
		newFrame.setBounds(10,10,800,600);
		
		newFrame.setVisible(true);
		
		newFrame.setResizable(false);

	}	

}