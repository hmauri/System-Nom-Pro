package Varios.object;


import Varios.object.componentes.Boton;
import Varios.object.componentes.Etiqueta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


/**
 * Created by Administrador on 19/09/06.
 */
public class Ventana_Principal extends JFrame {

    /**
     * Declrcion del CombBox
     */


    /**
     * contenedor de componentes de la ventana
     */
    private Container contenedor;


    /**
     * Ventana
     */
    private Ventana_Principal miVentanaPrincipal;


    /**
     * Nombre:                  Ventana_Principal
     * Descripcion:             constructor de la clase
     *
     * @throws HeadlessException
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */
    public Ventana_Principal() throws HeadlessException {

        iniciarComponentes();
        setTitle("System Nom-Pro");
        setSize(1070, 1100);
        setLocationRelativeTo(null);
    }


    /**
     * Nombre:                  iniciarComponentes
     * Descripcion:             metodo que inicia los componentes de la pantalla
     *
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */
    private void iniciarComponentes() {
        /**
         * inicio mi contenedor
         */
        contenedor = getContentPane();

        /**
         * medidas d la pantalla
         */
        contenedor.setLayout(null);

        /**
         * Agrego un Boton, Afiliar Proveedor
         */
        Boton boton_Afi_Prove = new Boton();
        boton_Afi_Prove.setText("Afiliar Proveedor");
        boton_Afi_Prove.setBounds(210, 250, 140, 23);
        boton_Afi_Prove.addActionListener(new Boton_Afi_Prove());

        /**
         * Agrego un Boton, Afiliar Nomina
         */
        Boton boton_Afi_Nomina = new Boton();
        boton_Afi_Nomina.setText("Afiliar Nomina");
        boton_Afi_Nomina.setBounds(370, 250, 140, 23);
        boton_Afi_Nomina.addActionListener(new Boton_Afi_nomin());

        /**
         * Agrego un Boton, Pago Proveedor
         */
        Boton boton_Pag_Prove = new Boton();
        boton_Pag_Prove.setText("Pago Proveedor");
        boton_Pag_Prove.setBounds(530, 250, 140, 23);
        boton_Pag_Prove.addActionListener(new Boton_pago_prove());

        /**
         * Agrego un Boton, Pago Nomina
         */
        Boton boton_Pag_Nomina = new Boton();
        boton_Pag_Nomina.setText("Pago Nomina");
        boton_Pag_Nomina.setBounds(690, 250, 140, 23);
        boton_Pag_Nomina.addActionListener(new Boton_pago_nomin());

//AKI A CADA BOTON AHORA LE COLOCAL LA LECTURA DEL EVENTO Y QUE CUANDO LE DE CLICK INSTANCIE UNA NUEV ENTANA
        //FINO?? :D bien  oks est bien grcis profesor reiniciar la maquina para que te mate ese virus de alli
        /**
         * Agrego una Etiqueta Sub Titulo
         */
        Etiqueta etiqueta = new Etiqueta("System Nom - Pro");
        etiqueta.setBounds(455, 140, 250, 60);

        /**
         * Agrego una Etiqueta Titulo
         */
        Etiqueta etiqueta2 = new Etiqueta("BURDEL  EL  PELON");
        etiqueta2.setBounds(455, 120, 250, 60);


        /**Agregamos los componentes al Contenedor*/
        contenedor.add(etiqueta);
        contenedor.add(boton_Afi_Prove);
        contenedor.add(boton_Afi_Nomina);
        contenedor.add(boton_Pag_Prove);
        contenedor.add(boton_Pag_Nomina);
        contenedor.add(etiqueta2);

    }


    public Ventana_Principal getMiVentanaPrincipal() {
        return miVentanaPrincipal;
    }

    public void setMiVentanaPrincipal(Ventana_Principal miVentanaPrincipal) {
        this.miVentanaPrincipal = miVentanaPrincipal;
    }

    public Container getContenedor() {
        return contenedor;
    }

    public void setContenedor(Container contenedor) {
        this.contenedor = contenedor;
    }







    }

