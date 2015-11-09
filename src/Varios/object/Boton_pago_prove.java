package Varios.object;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexita malcriadita on 07/11/2015.
 */
public  class Boton_pago_prove implements ActionListener {

    Vent_pago_prove vent_prove = new Vent_pago_prove();

    @Override
    public void actionPerformed(ActionEvent e) {


        vent_prove.setVisible(true);

    }
}
