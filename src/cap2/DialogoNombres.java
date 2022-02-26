package cap2;

import javax.swing.JOptionPane;

public class DialogoNombres {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
		String mensaje = String.format("Bienvenido, %s, a la programacion en Java!", nombre);
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
