package graficos;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class graficos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujosYColor miMarco = new MarcoConDibujosYColor();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujosYColor extends JFrame{
	
	public MarcoConDibujosYColor(){
		
		setTitle("Prueba de Dibujo");
		
		setSize(400,400);
		
		LaminaConFiguras miLamina = new LaminaConFiguras();
		
		add(miLamina);
		
		miLamina.setBackground(SystemColor.window);
		
	}
	
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);
		
		g2.draw(new Line2D.Double(100, 100, 300, 250));
		
		double CentroEnX=rectangulo.getCenterX();
		
		double CentroEnY=rectangulo.getCenterY();
		
		double radio=150;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		
		circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX+radio,CentroEnY+radio );
		
		g2.setPaint(new Color(90, 140, 55));
		
		g2.fill(circulo);
		
		g2.setPaint(Color.BLUE);
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);
		
		g2.setPaint(Color.WHITE);
		
		g2.fill(elipse);
		
		
		/*g.drawRect(50, 50, 200, 200);
		
		g.drawLine(100, 100, 300, 200);
		
		g.drawArc(50, 100, 100, 200, 120, 150);*/
		
	}
	
}