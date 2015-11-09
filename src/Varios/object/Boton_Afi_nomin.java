package Varios.object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexita malcriadita on 07/11/2015.
 */
public class Boton_Afi_nomin implements ActionListener {

    Vent_fili_nomin vent_nomin = new Vent_fili_nomin();

    @Override
    public void actionPerformed(ActionEvent e) {

        vent_nomin.setVisible(true);

    }
}
