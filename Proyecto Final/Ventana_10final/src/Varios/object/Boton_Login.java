package Varios.object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by WINDOWS XP on 09/11/15.
 */
public class Boton_Login implements ActionListener {


    Ventana_Principal vent = new Ventana_Principal();



    @Override
    public void actionPerformed(ActionEvent e) {


        vent.setVisible(true);
    }


}
