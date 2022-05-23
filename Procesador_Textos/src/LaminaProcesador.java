import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.JComponent;
import javax.swing.JEditorPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class LaminaProcesador extends JPanel {

	public LaminaProcesador() {

		setLayout(new BorderLayout());

		JPanel laminaMenu = new JPanel();

		JMenuBar miBarra = new JMenuBar();

		// Elementos del menú----------------------------------

		fuente = new JMenu("Fuente");

		estilo = new JMenu("Estilo");

		tamagno = new JMenu("Tamaño");

		guardar = new JMenu("Guardar");

		// Creación de objetos de menu fuente----------------------------------

		configura_menu("Arial", "Fuente", "Arial", 9, 10);

		configura_menu("Courier", "Fuente", "Courier", 9, 10);

		configura_menu("Verdana", "Fuente", "Verdana", 9, 10);

		// Creación de objetos de menu estilos----------------------------------

		configura_menu("Negrita", "Estilo", "", Font.BOLD, 1);

		configura_menu("Cursiva", "Estilo", "", Font.ITALIC, 1);

		// Creación de objetos de menu tamaño----------------------------------

		configura_menu("12", "Tamaño", "", 9, 12);

		configura_menu("14", "Tamaño", "", 9, 14);

		configura_menu("16", "Tamaño", "", 9, 16);

		configura_menu("18", "Tamaño", "", 9, 18);

		// Creación de objetos de menu Guardar----------------------------------

		configura_menu("Guardar...", "Guardar", "", 9, 12);

		// Agregado de elementos de la lamina---------------------------

		miBarra.add(fuente);

		miBarra.add(estilo);

		miBarra.add(tamagno);

		miBarra.add(guardar);

		laminaMenu.add(miBarra);

		add(laminaMenu, BorderLayout.NORTH);

		areaTexto = new JEditorPane();

		add(areaTexto, BorderLayout.CENTER);

	}

	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {

		JMenuItem elem_menu = new JMenuItem(rotulo);

		if (menu == "Fuente") {

			fuente.add(elem_menu);

		} else if (menu == "Estilo") {

			estilo.add(elem_menu);
		} else if (menu == "Tamaño") {

			tamagno.add(elem_menu);
		} else if (menu == "Guardar") {

			guardar.add(elem_menu);
		}

		elem_menu.addActionListener(new gestionaEventos(rotulo, tipo_letra, estilos, tam));

	}

	private class gestionaEventos implements ActionListener {

		String tipo_texto, menu;

		int estilo_letra, tamagno_letra;

		public gestionaEventos(String elemento, String texto2, int estilo2, int tam_letra) {
			// TODO Auto-generated constructor stub

			tipo_texto = texto2;

			estilo_letra = estilo2;

			tamagno_letra = tam_letra;

			menu = elemento;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			letras = areaTexto.getFont();

			textoArea = areaTexto.getText().toString();

			if (menu == "Arial" || menu == "Courier" || menu == "Verdana") {

				estilo_letra = letras.getStyle();

				tamagno_letra = letras.getSize();

				// System.out.println(textoArea);

			} else if (menu == "Cursiva" || menu == "Negrita") {

				if (letras.getStyle() == 1 || letras.getStyle() == 2) {

					estilo_letra = 3;
				}

				tipo_texto = letras.getFontName();

				tamagno_letra = letras.getSize();

				// System.out.println(textoArea);

			} else if (menu == "12" || menu == "14" || menu == "16" || menu == "18") {

				estilo_letra = letras.getStyle();

				tipo_texto = letras.getFontName();

				// System.out.println(textoArea);

			} else if (menu == "Guardar...") {

				try {
					FileWriter fw = new FileWriter("src/Datos/Datos.txt");

					fw.write(textoArea, 0, 3);

					fw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

			areaTexto.setFont(new Font(tipo_texto, estilo_letra, tamagno_letra));
		}

	}

	private JEditorPane areaTexto;

	JMenu fuente, estilo, tamagno, guardar;

	Font letras;

	String textoArea;

}
