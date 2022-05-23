package GUI;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;


public class prueba_GUI {

	private JFrame frmCarnetdigivet;
	private JTextField textField, textField_1,textField_2,textField_3,textField_4;
	private JPanel panelColonia,panelTelefono,panelEmail;
	private JPanel panelSelMasc;
	private JComboBox comboBox;
	private JPanel panelMenu;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JTabbedPane datosMascota;
	private JPanel infoMascota;
	private JPanel historial;
	private JLabel lblNewLabel;
	private JTextField textField_5;
	private JLabel lblFechaNacimiento;
	private JTextField textField_6;
	private JLabel lblRaza;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					prueba_GUI window = new prueba_GUI();
					window.frmCarnetdigivet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public prueba_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int colTF=20;
		
		frmCarnetdigivet = new JFrame();
		frmCarnetdigivet.setIconImage(Toolkit.getDefaultToolkit().getImage("GUI/Imagenes/icono_huella.png"));
		frmCarnetdigivet.setBackground(SystemColor.window);
		frmCarnetdigivet.setTitle("CarnetDigiVet");
		frmCarnetdigivet.setForeground(Color.WHITE);
		frmCarnetdigivet.setBounds(100, 100, 694, 489);
		frmCarnetdigivet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setMinimumSize(new Dimension(195, 0));
		panelDatos.setPreferredSize(new Dimension(195, 0));
		frmCarnetdigivet.getContentPane().add(panelDatos, BorderLayout.WEST);
		panelDatos.setLayout(new GridLayout(6, 1, 0, 0));
		panelDatos.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Datos Propietario", TitledBorder.TOP, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		
		JPanel panelNombre = new JPanel();
		panelNombre.setOpaque(false);
		panelNombre.setForeground(SystemColor.textHighlight);
		panelDatos.add(panelNombre);
		panelNombre.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nombre", TitledBorder.LEFT, TitledBorder.ABOVE_BOTTOM, null, new Color(0, 0, 0)));
		panelNombre.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		panelNombre.add(textField);
		textField.setColumns(colTF);
		
		JPanel panelDireccion = new JPanel();
		panelDireccion.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Direcci\u00F3n", TitledBorder.LEFT, TitledBorder.ABOVE_BOTTOM, null, new Color(0, 0, 0)));
		panelDatos.add(panelDireccion);
		
		textField_1 = new JTextField();
		panelDireccion.add(textField_1);
		textField_1.setColumns(colTF);
		
		panelColonia = new JPanel();
		panelColonia.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Colonia", TitledBorder.LEFT, TitledBorder.ABOVE_BOTTOM, null, new Color(0, 0, 0)));
		panelDatos.add(panelColonia);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		panelColonia.add(textField_2);
		textField_2.setColumns(colTF);
		
		panelTelefono = new JPanel();
		panelDatos.add(panelTelefono);
		panelTelefono.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Teléfono/Celular", TitledBorder.LEFT, TitledBorder.ABOVE_BOTTOM, null, new Color(0, 0, 0)));
		
		textField_3 = new JTextField();
		textField_3.setText("");
		panelTelefono.add(textField_3);
		textField_3.setColumns(colTF);
		
		panelEmail = new JPanel();
		panelDatos.add(panelEmail);
		panelEmail.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "E-mail", TitledBorder.LEFT, TitledBorder.ABOVE_BOTTOM, null, new Color(0, 0, 0)));
		
		textField_4 = new JTextField();
		panelEmail.add(textField_4);
		textField_4.setColumns(colTF);
		
		panelSelMasc = new JPanel();
		panelDatos.add(panelSelMasc);
		panelSelMasc.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mascota", TitledBorder.LEFT, TitledBorder.ABOVE_BOTTOM, null, new Color(0, 0, 0)));
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(new Rectangle(0, 0, 25, 5));
		comboBox.setAutoscrolls(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tobit", "Nuby", "Jero"}));
		comboBox.setMaximumRowCount(100);
		panelSelMasc.add(comboBox);
		
		panelMenu = new JPanel();
		frmCarnetdigivet.getContentPane().add(panelMenu, BorderLayout.NORTH);
		panelMenu.setLayout(new BorderLayout(0, 0));
		
		menuBar = new JMenuBar();
		panelMenu.add(menuBar);
		
		mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("New menu");
		menuBar.add(mnNewMenu_1);
		
		mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		datosMascota = new JTabbedPane(JTabbedPane.TOP);
		frmCarnetdigivet.getContentPane().add(datosMascota, BorderLayout.CENTER);
		
		infoMascota = new JPanel();
		datosMascota.addTab("Datos Mascota", null, infoMascota, null);
		GridBagLayout gbl_infoMascota = new GridBagLayout();
		gbl_infoMascota.columnWidths = new int[] {100, 100, 50, 100, 100, 25};
		gbl_infoMascota.rowHeights = new int[] {14, 14, 15, 0};
		gbl_infoMascota.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		gbl_infoMascota.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		infoMascota.setLayout(gbl_infoMascota);
		
		lblNewLabel = new JLabel("Nombre Mascota");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		infoMascota.add(lblNewLabel, gbc_lblNewLabel);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridwidth = 3;
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 1;
		infoMascota.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		GridBagConstraints gbc_lblFechaNacimiento = new GridBagConstraints();
		gbc_lblFechaNacimiento.anchor = GridBagConstraints.EAST;
		gbc_lblFechaNacimiento.insets = new Insets(0, 0, 0, 5);
		gbc_lblFechaNacimiento.gridx = 0;
		gbc_lblFechaNacimiento.gridy = 2;
		infoMascota.add(lblFechaNacimiento, gbc_lblFechaNacimiento);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 0, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 2;
		infoMascota.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		lblRaza = new JLabel("Raza");
		GridBagConstraints gbc_lblRaza = new GridBagConstraints();
		gbc_lblRaza.anchor = GridBagConstraints.EAST;
		gbc_lblRaza.insets = new Insets(0, 0, 0, 5);
		gbc_lblRaza.gridx = 2;
		gbc_lblRaza.gridy = 2;
		infoMascota.add(lblRaza, gbc_lblRaza);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 0, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 3;
		gbc_textField_7.gridy = 2;
		infoMascota.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		historial = new JPanel();
		datosMascota.addTab("Historial Mascota", null, historial, null);
		
	}

}
