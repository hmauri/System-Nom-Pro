package Varios.object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Varios.object.componentes.Boton;

/**
 * Created by alexita malcriadita on 07/11/2015.
 */
public class Boton_Afi_Prove implements ActionListener {

    Vent_fili_Provee vent_prove = new Vent_fili_Provee();


    @Override
    public void actionPerformed(ActionEvent e) {

       // if (e.getSource() == Boton_Afi_Prove )

            vent_prove.setVisible(true);
    }
}
