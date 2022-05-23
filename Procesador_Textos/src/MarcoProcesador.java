import javax.swing.JFrame;

public class MarcoProcesador extends JFrame {

	public MarcoProcesador() {

		setBounds(120, 120, 550, 350);

		LaminaProcesador miLamina = new LaminaProcesador();

		add(miLamina);

		setVisible(true);

	}

}
