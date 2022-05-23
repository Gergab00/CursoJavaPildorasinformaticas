package Varios;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Marco_Calculadora_Basica extends JFrame {
	
	private JButton boton_calculadora;
	
	public Marco_Calculadora_Basica(JButton boton_cerrar, JButton boton_abrir){
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		LaminaCalculadora miLamina = new LaminaCalculadora();
		
		add(miLamina);
		
		boton_calculadora=boton_abrir;
		
		boton_calculadora.setEnabled(false);
		
		CierraTodos oyenteCerrarTodos=new CierraTodos();
		
		boton_cerrar.addActionListener(oyenteCerrarTodos);
		
	}

private class CierraTodos implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		dispose();
		//System.out.println(e.getActionCommand());
	
		boton_calculadora.setEnabled(true);
		
		}
	
	}
}
@SuppressWarnings("serial")
class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora(){
		
		principio=true;
		
		setLayout(new BorderLayout());
		
		pantalla=new JButton("0");
		
		pantalla.setEnabled(false);

		add(pantalla, BorderLayout.NORTH);
		
		milamina2 = new JPanel();
		
		milamina2.setLayout(new GridLayout(4,6));
		
		ActionListener insertar=new InsertaNumero();
		ActionListener orden=new AccionOrden(); 
		
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
		ponerBoton("/",orden);
		ponerBoton("√",orden);
		ponerBoton("C",insertar);
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
		ponerBoton("*",orden);
		JButton botonInactivo3=new JButton("");
		milamina2.add(botonInactivo3);
		ponerBoton("Ce",insertar);
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
		ponerBoton("-",orden);
		JButton botonInactivo=new JButton("");
		milamina2.add(botonInactivo);
		botonInactivo.setEnabled(false);
		ponerBoton("0",insertar);
		ponerBoton(".",orden);
		ponerBoton("=",orden);
		ponerBoton("+",orden);
		JButton botonInactivo2=new JButton("");
		milamina2.add(botonInactivo2);
		botonInactivo2.setEnabled(false);
		
		add(milamina2, BorderLayout.CENTER);
		
		ultimaOperacion="=";
		
		
	}
	
	private void ponerBoton(String rotulo, ActionListener oyente){
		
		JButton boton=new JButton(rotulo);
		
		boton.addActionListener(oyente);
		
		milamina2.add(boton);
		
	}
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String entrada=e.getActionCommand();
			
			if(principio){
				
				pantalla.setText("");
				
				principio=false;
				
			}if(entrada.equals("C")){
				
				entrada="0";
				
				resultado=0;
				
				principio=true;
				
			}else if(entrada.equals("Ce")){
				
				pantalla.setText("0");
				
				principio=true;
				
				entrada="";
				
			}
			
			pantalla.setText(pantalla.getText()+entrada);
			
			
			
		}
		
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String operacion=e.getActionCommand();
			//System.out.println(operacion);
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion=operacion;
			
			principio=true;
			
		}
		
		public void calcular(double x){
			
			if(ultimaOperacion.equals("+")){
				
				resultado+=x;
				//System.out.println(resultado);
			}else if(ultimaOperacion.equals("-")){
				
				resultado-=x;
				
			}else if(ultimaOperacion.equals("*")){
				
				resultado*=x;
				
			}else if(ultimaOperacion.equals("/")){
				
				resultado/=x;
				
			}else if(ultimaOperacion.equals("=")){
				
				resultado=x;
				
			}
			
			pantalla.setText(""+resultado);
			
		}
		
	}
	
	private JPanel milamina2;
	
	private JButton pantalla;
	
	private boolean principio;
	
	private double resultado;
	
	private String ultimaOperacion;
	
}
