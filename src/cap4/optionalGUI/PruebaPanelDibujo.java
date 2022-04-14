package cap4.optionalGUI;

import javax.swing.*;

public class PruebaPanelDibujo {
    public static void main(String[] args) {
        PanelDibujoPrimeraFigura panel = new PanelDibujoPrimeraFigura();

        JFrame aplicacion = new JFrame();

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        aplicacion.add(panel);

        aplicacion.setSize(250,250);
        aplicacion.setVisible(true);

    }
}
