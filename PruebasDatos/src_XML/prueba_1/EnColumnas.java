/**
 * @License
 */
package prueba_1;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.LayoutManager2;
import java.util.Iterator;

/**
 * @author Gerardo
 * @author PildorasInformaticas
 * {@link www.pildorasinformaticas.es}
 * @comments Agradecimiento a Pildoras Informaticas por los cursos de Programación Java
 */
public class EnColumnas implements LayoutManager, LayoutManager2 {

	private int x=0;
	private int y=0;

	/**
	 * 
	 */
	public EnColumnas() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager2#addLayoutComponent(java.awt.Component, java.lang.Object)
	 */
	@Override
	public void addLayoutComponent(Component comp, Object constraints) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager2#getLayoutAlignmentX(java.awt.Container)
	 */
	@Override
	public float getLayoutAlignmentX(Container target) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager2#getLayoutAlignmentY(java.awt.Container)
	 */
	@Override
	public float getLayoutAlignmentY(Container target) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager2#invalidateLayout(java.awt.Container)
	 */
	@Override
	public void invalidateLayout(Container target) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager2#maximumLayoutSize(java.awt.Container)
	 */
	@Override
	public Dimension maximumLayoutSize(Container target) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager#addLayoutComponent(java.lang.String, java.awt.Component)
	 */
	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager#layoutContainer(java.awt.Container)
	 */
	@Override
	public void layoutContainer(Container miContenedor) {
		// TODO Auto-generated method stub
		int d=miContenedor.getWidth();
		x=d/2;
		int contador=0;
		int n=miContenedor.getComponentCount();
		
		for (int i = 0; i < n; i++) {
			contador++;
			Component c=miContenedor.getComponent(i);
			c.setBounds(x-100, y-40, 100, 20);
			
			x+=100;
			
			if (contador%2==0) {
				
				x=d/2;
				y+=40;
						
			}
			
		}

	}

	/* (EnColumnas.layoutContainer-Javadoc)
	 * @see java.awt.LayoutManager#minimumLayoutSize(java.awt.Container)
	 * @version 1.0-2016
	 * @coments Se usa para alinear automaticamente los elementos del programa en parejas.
	 */
	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager#preferredLayoutSize(java.awt.Container)
	 */
	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.awt.LayoutManager#removeLayoutComponent(java.awt.Component)
	 */
	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub

	}

}
