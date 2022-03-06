package cap6;

import javax.swing.JFrame;

public class PrubaDibujarCaraSonriente {
	public static void main(String[] args) {
		DibujarCaraSonriente panel = new DibujarCaraSonriente();
		JFrame aplicacion = new JFrame();

		aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacion.add(panel);
		aplicacion.setSize(230, 260);
		aplicacion.setVisible(true);
	}

}
