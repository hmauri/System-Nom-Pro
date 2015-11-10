package Varios.object;

import Varios.object.componentes.Boton;
import Varios.object.componentes.Etiqueta;
import Varios.object.componentes.Input;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by alexita malcriadita on 07/11/2015.
 */
public class Vent_fili_nomin extends JFrame implements ActionListener {

    public JComboBox getCombo() {
        return combo;
    }

    public void setCombo(JComboBox combo) {
        this.combo = combo;
    }

    public Input getNum_id_pag() {
        return num_id_pag;
    }

    public void setNum_id_pag(Input num_id_pag) {
        this.num_id_pag = num_id_pag;
    }

    public Input getCod_serv() {
        return cod_serv;
    }

    public void setCod_serv(Input cod_serv) {
        this.cod_serv = cod_serv;
    }

    public Input getCuen_benef() {
        return cuen_benef;
    }

    public void setCuen_benef(Input cuen_benef) {
        this.cuen_benef = cuen_benef;
    }

    public Input getNem_id_benef() {
        return nem_id_benef;
    }

    public void setNem_id_benef(Input nem_id_benef) {
        this.nem_id_benef = nem_id_benef;
    }

    public Input getNom_benef() {
        return nom_benef;
    }

    public void setNom_benef(Input nom_benef) {
        this.nom_benef = nom_benef;
    }

    public Input getCorreo_elec() {
        return correo_elec;
    }

    public void setCorreo_elec(Input correo_elec) {
        this.correo_elec = correo_elec;
    }

    public JComboBox getComb_tip_doc_ben() {
        return comb_tip_doc_ben;
    }

    public void setComb_tip_doc_ben(JComboBox comb_tip_doc_ben) {
        this.comb_tip_doc_ben = comb_tip_doc_ben;
    }

    public JComboBox getComb_tip_id_benef() {
        return comb_tip_id_benef;
    }

    public void setComb_tip_id_benef(JComboBox comb_tip_id_benef) {
        this.comb_tip_id_benef = comb_tip_id_benef;
    }

    public JComboBox combo ;
    public Input num_id_pag;
    public Input cod_serv;
    public Input cuen_benef;
    public Input nem_id_benef;
    public Input nom_benef;
    public Input correo_elec;
    public JComboBox comb_tip_doc_ben;
    public JComboBox comb_tip_id_benef;

    /**
     * contenedor de componentes de la ventana
     */
    private Container contenedor;


    /**
     * Ventana
     */
    private  Vent_fili_nomin miVent_fili_nomin;


    /**
     * encapsulamiento de boton para poder usarlo en clases externas
     */
    private Boton boton_Afi_nomin;


    /**
     * Nombre:                  Ventana_Principal
     * Descripcion:             constructor de la clase
     *
     * @throws HeadlessException
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */
    public Vent_fili_nomin() throws HeadlessException
    {

        iniciarComponentes();
        setTitle( "Afiliacion De Nomina" );
        setSize( 1070, 1100 );
        setLocationRelativeTo( null );
    }


    /**
     * Nombre:                  iniciarComponentes
     * Descripcion:             metodo que inicia los componentes de la pantalla
     *
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */
    private void iniciarComponentes()
    {
        /**
         * inicio mi contenedor
         */
        contenedor = getContentPane();

        /**
         * medidas d la pantalla
         */
        contenedor.setLayout( null );

        /**
         * Agrego un Boton, Afiliar nomin
         */
        boton_Afi_nomin = new Boton();
        boton_Afi_nomin.setText( "Registrar" );
        boton_Afi_nomin.setBounds( 250, 400, 140, 23 );
        boton_Afi_nomin.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                registrar();
            }
        }) ;

        /**
         * Agrego un Boton, Regresar Proveedor
         */
        Boton boton_regresar = new Boton();
        boton_regresar.setText( "Regresar" );
        boton_regresar.setBounds( 650, 400, 140, 23 );
        boton_regresar.addActionListener (new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                //new
            }
        }) ;

        Etiqueta titulo = new Etiqueta( "Afiliacion de Nomina" );
        titulo.setBounds(450, 5, 250, 60);

        /**
         * Agrego una Etiqueta Numero Identificcion del Pagador
         */
        Etiqueta eti_num_id_pag = new Etiqueta( "Numero Identificacion del Pagador :" );
        eti_num_id_pag.setBounds( 220, 80, 250, 60 );

        /**
         * Agrego una Caja de texto Numero Identificcion del Pagador
         */
        Input num_id_pag = new Input();
        num_id_pag.setBounds(460,103,80,20);



        /**
         * Agrego una Etiqueta Tipo de identificdor del pagador
         */
        Etiqueta eti_tip_id_pag = new Etiqueta( "Tipo De Identificacion del Pagador :" );
        eti_tip_id_pag.setBounds(220, 40, 250, 60);

        /**
         * Agrego un CombBox Tipo de Identificcion del pagador nomina
         */

        combo = new JComboBox();
        combo.addItem("J");
        combo.addItem("G");
        combo.setBounds(460,63,35,25);

        /**
         * Agrego una Etiqueta Codigo del Servicio
         */
        Etiqueta eti_cod_serv = new Etiqueta( "Codigo Servicio :" );
        eti_cod_serv.setBounds( 220, 120, 250, 60 );

        /**
         * Agrego una Caja de texto numero identificcion del pagador
         */

        Input cod_serv = new Input();
        cod_serv.setBounds(460,140,80,20);

        /**
         * Agrego una Etiqueta Cuenta Beneficirio
         */

        Etiqueta eti_cuent_benef = new Etiqueta( "Cuenta Beneficirio :" );
        eti_cuent_benef.setBounds( 220, 150, 250, 60 );

        /**
         * Agrego una Caja de texto Cuenta Beneficiario
         */

        Input cuen_benef  = new Input();
        cuen_benef .setBounds(460, 170, 150, 20);


        /**
         * Agrego una Etiqueta Tipo de Documento del Beneficiario
         */

        Etiqueta eti_tipo_doc_benef = new Etiqueta( "Tipo de Documento del Beneficiario :" );
        eti_tipo_doc_benef .setBounds(220, 180, 250, 60 );

        /**
         * Agrego un CombBox Tipo de Documento del Beneficirio
         */

        comb_tip_doc_ben = new JComboBox();
        comb_tip_doc_ben.addItem("N");
        comb_tip_doc_ben.addItem("J");
        comb_tip_doc_ben.addItem("R");
        comb_tip_doc_ben.setBounds(460,200,35,25);

        /**
         * Agrego una Etiqueta Tipo de Identificacion del Beneficirio
         */

        Etiqueta eti_tipo_id_benef = new Etiqueta( "Tipo de Identificacion del Beneficirio :" );
        eti_tipo_id_benef .setBounds(220, 210, 250, 60 );

        /**
         * Agrego un CombBox Tipo de Identificacion del Beneficirio
         */

        comb_tip_id_benef = new JComboBox();
        comb_tip_id_benef.addItem("V");
        comb_tip_id_benef.addItem("E");
        comb_tip_id_benef.addItem("P");
        comb_tip_id_benef.addItem("J");
        comb_tip_id_benef.addItem("G");
        comb_tip_id_benef.setBounds(460,230,35,25);

        /**
         * Agrego una Etiqueta Numero de Identificacion del Beneficirio
         */

        Etiqueta eti_nem_id_benef= new Etiqueta( " Numero de Identificacion del Beneficirio:" );
        eti_nem_id_benef .setBounds(220, 240, 250, 60 );

        /**
         * Agrego una Caja de texto de Numero Identificcion del Beneficiario
         */

        Input nem_id_benef  = new Input();
        nem_id_benef.setBounds(460, 260, 150, 20);

        /**
         * Agrego una Etiqueta Nombre del Beneficirio
         */

        Etiqueta eti_nom_benef= new Etiqueta( "Nombre del Beneficirio:" );
        eti_nom_benef .setBounds(220, 270, 250, 60 );

        /**
         * Agrego una Caja de texto de Nombre del Beneficiario
         */

        Input nom_benef  = new Input();
        nom_benef.setBounds(460, 290, 360, 20);

        /**
         * Agrego una Etiqueta Correo Electronico
         */

        Etiqueta eti_correo_elec= new Etiqueta( "Correo Electronico:" );
        eti_correo_elec.setBounds(220, 300, 250, 60);

        /**
         * Agrego una Caja de texto de Nombre del Beneficiario
         */

        Input correo_elec = new Input();
        correo_elec.setBounds(460, 320, 360, 20);


        /**Agregamos los componentes al Contenedor*/
        contenedor.add( eti_tip_id_pag );
        contenedor.add(boton_Afi_nomin );
        contenedor.add(combo);
        contenedor.add(eti_num_id_pag );
        contenedor.add( num_id_pag);
        contenedor.add( eti_cod_serv);
        contenedor.add(cod_serv);
        contenedor.add(eti_cuent_benef);
        contenedor.add( cuen_benef);
        contenedor.add( eti_tipo_doc_benef);
        contenedor.add(comb_tip_doc_ben);
        contenedor.add( eti_tipo_id_benef);
        contenedor.add( comb_tip_id_benef);
        contenedor.add( eti_nem_id_benef);
        contenedor.add( nem_id_benef);
        contenedor.add(  eti_nom_benef);
        contenedor.add( nom_benef);
        contenedor.add( eti_correo_elec);
        contenedor.add( correo_elec);
        contenedor.add(boton_regresar);
        contenedor.add(titulo);



    }

    private void registrar() {

        File documento = new File("Afiliacion_Nomina.txt");

        try {

            //si no existe el fichero, se crea
            if (!documento.exists()) {
                documento.createNewFile();
            }

            BufferedWriter escribir = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(documento, true), "utf-8")); // True es por si el
            // existe seguir a?adiendo
            // sin borrar lo que esta


            String _tipo_id_pag = combo.getToolTipText();
            String _num_id_pag = num_id_pag.getText();
            String _cod_ser = cod_serv.getText();
            String _cuen_benef = cuen_benef.getText();
            String _comb_tip_doc_ben = comb_tip_doc_ben.getToolTipText();
            String _nem_id_benef = nem_id_benef.getText();
            String _nom_benef = nom_benef.getText();
            String _correo_elec = correo_elec.getText();


            String cadena =  (_tipo_id_pag + " " +_num_id_pag + " " + _cod_ser + "ABPP"+" "+
                    _cuen_benef + " " + _comb_tip_doc_ben + " " + _nem_id_benef+" "+
                    _nom_benef + " " + _correo_elec);

            escribir.write(cadena + "\r\n");

            num_id_pag.setText(" ");
            cod_serv.setText(" ");
            cuen_benef.setText(" ");
            nem_id_benef.setText(" ");
            nom_benef.setText(" ");
            correo_elec.setText(" ");

            escribir.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    /**
     * Nombre:                  a
     * }ctionPerformed
     * Descripcion:             metodo que escucha el click del boton y genera accion
     *
     * @param e evento
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */


    @Override
    public void actionPerformed(ActionEvent e) {

    }



    public void setMiVent_fili_nomin(  Vent_fili_nomin miVent_fili_nominl )
    {
        this.miVent_fili_nomin = miVent_fili_nomin;
    }

    public Container getContenedor()
    {
        return contenedor;
    }

    public void setContenedor( Container contenedor )
    {
        this.contenedor = contenedor;
    }

    public Boton getBoton_Afi_nomin() {
        return boton_Afi_nomin;
    }

    public void setBoton_Afi_nomin(Boton boton_Afi_nomin) {
        this.boton_Afi_nomin = boton_Afi_nomin;
    }

    public Vent_fili_nomin getMiVent_fili_nomin() {
        return miVent_fili_nomin;
    }
}
