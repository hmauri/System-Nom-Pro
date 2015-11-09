package Varios.object;

import Varios.object.componentes.Boton;
import Varios.object.componentes.Etiqueta;
import Varios.object.componentes.Input;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexita malcriadita on 07/11/2015.
 */
public class Vent_fili_Provee extends JFrame implements ActionListener {

    private JComboBox combo ;
    private JComboBox comb_tip_doc_ben;
    private JComboBox comb_tip_id_benef;



    /**
     * contenedor de componentes de la ventana
     */
    private Container contenedor;


    /**
     * Ventana
     */
    private  Vent_fili_Provee miVent_fili_Provee;


    /**
     * encapsulamiento de boton para poder usarlo en clases externas
     */
    private Boton boton_Afi_Prove;

    public JComboBox getCombo() {
        return combo;
    }

    public void setCombo(JComboBox combo) {
        this.combo = combo;
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

    public Boton getBoton_regresar() {
        return boton_regresar;
    }

    public void setBoton_regresar(Boton boton_regresar) {
        this.boton_regresar = boton_regresar;
    }

    private Boton boton_regresar;


    /**
     * Nombre:                  Ventana_Principal
     * Descripcion:             constructor de la clase
     *
     * @throws HeadlessException
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */
    public Vent_fili_Provee() throws HeadlessException
    {

        iniciarComponentes();
        setTitle( "Afiliacion De Proveedores" );
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
         * Agrego un Boton, Afiliar Proveedor
         */
        boton_Afi_Prove = new Boton();
        boton_Afi_Prove.setText( "Registrar" );
        boton_Afi_Prove.setBounds( 250, 400, 140, 23 );
        boton_Afi_Prove.addActionListener (new ActionListener() {


            public void actionPerformed(ActionEvent e) {
              // new
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

        /**
         * Agrego una Etiqueta Titulo
         */
        Etiqueta titulo = new Etiqueta( "Afiliacion de Proveedores" );
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
        Etiqueta eti_tip_id_pag  = new Etiqueta( "Tipo De Identificacion del Pagador :" );
        eti_tip_id_pag.setBounds(220, 40, 250, 60);

        /**
         * Agrego un CombBox Tipo de Identificcion del pagador
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
         * Agrego una Caja de texto de Correo Electronico
         */

        Input correo_elec = new Input();
        correo_elec.setBounds(460, 320, 360, 20);


        /**Agregamos los componentes al Contenedor*/
        contenedor.add( eti_tip_id_pag );
        contenedor.add(boton_Afi_Prove );
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
        contenedor.add(titulo);
        contenedor.add(boton_regresar);




    }

    /**
     * Nombre:                  actionPerformed
     * Descripcion:             metodo que escucha el click del boton y genera accion
     *
     * @param e evento
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */


    @Override
    public void actionPerformed(ActionEvent e) {

        /**
         * ACa deberias llamar a otra ventana dependiendo del boton al q se halla seleccionado
         */

    }

    public  Vent_fili_Provee getMiVent_fili_Provee()
    {
        return miVent_fili_Provee;
    }

    public void setMiVent_fili_Provee(  Vent_fili_Provee miVent_fili_Proveel )
    {
        this.miVent_fili_Provee = miVent_fili_Provee;
    }

    public Container getContenedor()
    {
        return contenedor;
    }

    public void setContenedor( Container contenedor )
    {
        this.contenedor = contenedor;
    }

    public Boton getBoton_Afi_Prove() {
        return boton_Afi_Prove;
    }

    public void setBoton_Afi_Prove(Boton boton_Afi_Prove) {
        this.boton_Afi_Prove = boton_Afi_Prove;
    }
}





