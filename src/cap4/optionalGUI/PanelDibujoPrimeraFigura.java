package cap4.optionalGUI;

import javax.swing.*;
import java.awt.*;

public class PanelDibujoPrimeraFigura extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int anchura = getWidth();
        int altura = getHeight();

        int pasoH = anchura/ 15;
        int pasoV = altura / 15;

        for(int i = 1; i <= 15; i++){
            g.drawLine(pasoH * i , altura - (pasoV* i),0,0);
        }


    }
}
