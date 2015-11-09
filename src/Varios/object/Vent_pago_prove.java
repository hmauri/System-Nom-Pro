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
public class Vent_pago_prove extends JFrame implements ActionListener {

    private JComboBox combo ;
    private JComboBox comb_tip_doc_ben;
    private JComboBox comb_tip_id_benef;
    private JComboBox combo_ident_benef;


    /**
     * contenedor de componentes de la ventana
     */
    private Container contenedor;


    /**
     * Ventana
     */
    private  Vent_pago_prove miVent_pago__prove;


    /**
     * encapsulamiento de boton para poder usarlo en clases externas
     */
    private Boton boton_pago_prove;


    /**
     * Nombre:                  Ventana_Principal
     * Descripcion:             constructor de la clase
     *
     * @throws HeadlessException
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */
    public Vent_pago_prove() throws HeadlessException
    {

        iniciarComponentes();
        setTitle( "Pago De Proveedores" );
        setSize(1070, 1100 );
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
        boton_pago_prove = new Boton();
        boton_pago_prove.setText( "Registrar" );
        boton_pago_prove.setBounds( 250, 600, 140, 23 );
        boton_pago_prove.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // new
            }
        }) ;

        Etiqueta titulo = new Etiqueta( "Pago Proveedores" );
        titulo.setBounds(450, 1, 250, 60);


        /**
         * Agrego un Boton, Regresar Proveedor
         */
        Boton boton_regresar = new Boton();
        boton_regresar.setText( "Regresar" );
        boton_regresar.setBounds( 650, 600, 140, 23 );
        boton_regresar.addActionListener (new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                //new
            }
        }) ;

        /**
         * Agrego una Etiqueta Tipo de identificdor del pagador
         */
        Etiqueta eti_tip_id_pag = new Etiqueta( "Tipo De Identificacion del Pagador :" );
        eti_tip_id_pag.setBounds(220, 20, 250, 60);

        /**
         * Agrego un CombBox Tipo de Identificcion del pagador
         */

        combo = new JComboBox();
        combo.addItem("J");
        combo.addItem("G");
        combo.setBounds(460,40,35,25);


        /**
         * Agrego una Etiqueta Numero Identificcion del Pagador
         */
        Etiqueta eti_num_id_pag = new Etiqueta( "Numero Identificacion del Pagador :" );
        eti_num_id_pag.setBounds( 220, 50, 250, 60 );

        /**
         * Agrego una Caja de texto Numero Identificcion del Pagador
         */
        Input num_id_pag = new Input();
        num_id_pag.setBounds(460,80,80,20);


        /**
         * Agrego una Etiqueta de cuenta  debitar
         */

        Etiqueta eti_cuenta_debitar= new Etiqueta( "Numero De Cuenta a Debitar:" );
        eti_cuenta_debitar.setBounds(220, 80, 250, 60);

        /**
         * Agrego una Caja de texto de e cuenta  debitar
         */

        Input cuenta_debitar = new Input();
        cuenta_debitar.setBounds(460, 103, 360, 20);

        /**
         * Agrego una Etiqueta Cantidad de Pagos
         */
        Etiqueta eti_Cantidad_de_Pagos = new Etiqueta( "Cantidad de Pagos :" );
        eti_Cantidad_de_Pagos.setBounds( 220, 105, 150, 60 );

        /**
         * Agrego una Caja de texto Cantidad de Pagos
         */
        Input Cantidad__pagos = new Input();
        Cantidad__pagos.setBounds(460,130,80,20);

        /**
         * Agrego una Etiqueta Monto de Pago
         */
        Etiqueta eti_Monto_de_Pago = new Etiqueta( "Monto de Pago :" );
        eti_Monto_de_Pago.setBounds( 220, 145, 150, 60 );

        /**
         * Agrego una Caja de texto Monto de Pago
         */
        Input Monto_de_Pago = new Input();
        Monto_de_Pago.setBounds(460, 160, 80, 20);

        /**
         * Agrego una Etiqueta Fecha De Pago
         */
        Etiqueta eti_Fecha_De_Pago = new Etiqueta( "Fecha De Pago :" );
        eti_Fecha_De_Pago.setBounds(220, 175, 150, 60);

        /**
         * Agrego una Caja de texto Monto de Pago
         */
        Input Fecha_De_Pago = new Input();
        Fecha_De_Pago.setBounds(460, 190, 80, 20);


        /**
         * Agrego una Etiqueta Codigo del Servicio
         */
        Etiqueta eti_cod_serv = new Etiqueta( "Codigo Servicio :" );
        eti_cod_serv.setBounds( 220, 200, 250, 60 );

        /**
         * Agrego una Caja de texto Codigo Servicio
         */

        Input cod_serv = new Input();
        cod_serv.setBounds(460,210,80,20);


        /**
         * Agrego una Etiqueta Nombre Cliente
         */
        Etiqueta eti_Nombre_Cliente = new Etiqueta( "Nombre Cliente :" );
        eti_Nombre_Cliente.setBounds( 220, 220, 250, 60 );

        /**
         * Agrego una Caja de texto Nombre Cliente
         */

        Input Nombre_Cliente = new Input();
        Nombre_Cliente.setBounds(460,235,80,20);

        /**
         * Agrego una Etiqueta Monto de Pago
         */
        Etiqueta eti_Monto_de_Pago2 = new Etiqueta( "Monto de Pago :" );
        eti_Monto_de_Pago2.setBounds( 220, 245, 150, 60 );

        /**
         * Agrego una Caja de texto Monto de Pago
         */
        Input Monto_de_Pago2 = new Input();
        Monto_de_Pago2.setBounds(460, 260, 80, 20);

        /**
         * Agrego una Etiqueta Detalle del Pago
         */
        Etiqueta eti_Detalle_de_Pago = new Etiqueta( " Detalle del Pago :" );
        eti_Detalle_de_Pago.setBounds( 220, 260, 150, 60 );

        /**
         * Agrego una Caja de texto Detalle del Pago
         */
        Input Detalle_de_Pago = new Input();
        Detalle_de_Pago.setBounds(460, 279, 80, 20);

        /**
         * Agrego una Etiqueta Codigo del Banco de la cuenta abonar
         */
        Etiqueta eti_codigo_cuenta_abonar = new Etiqueta( " Codigo del Banco de la cuenta abonar :" );
        eti_codigo_cuenta_abonar.setBounds( 220, 275, 250, 100 );

        /**
         * Agrego una Caja de texto Codigo del Banco de la cuenta abonar
         */
        Input codigo_cuenta_abonar = new Input();
        codigo_cuenta_abonar.setBounds(460, 310, 80, 20);

        /**
         * Agrego una Etiqueta  Numero de cuenta a abonar
         */
        Etiqueta eti_Numero_cuenta_abonar = new Etiqueta( " Numero de cuenta a abonar :" );
        eti_Numero_cuenta_abonar.setBounds( 220, 300, 250, 100 );

        /**
         * Agrego una Caja de texto  Numero de cuenta a abonar
         */
        Input Numero_cuenta_abonar = new Input();
        Numero_cuenta_abonar.setBounds(460, 340, 80, 20);

        /**
         * Agrego una Etiqueta Correo Electronico
         */

        Etiqueta eti_correo_elec= new Etiqueta( "Correo Electronico:" );
        eti_correo_elec.setBounds(220, 340, 250, 60);

        /**
         * Agrego una Caja de texto de Correo Electronico
         */

        Input correo_elec = new Input();
        correo_elec.setBounds(460, 360, 360, 20);


        /**
         * Agrego una Etiqueta Referencia
         */

        Etiqueta eti_Referencia= new Etiqueta( "Referencia:" );
        eti_Referencia.setBounds(220, 370, 150, 50);

        /**
         * Agrego una Caja de texto de Correo Electronico
         */

        Input Referencia = new Input();
        Referencia.setBounds(460, 385, 200, 20);
        /**
         * Agrego una Etiqueta Identificion Beneficiario
         */

        Etiqueta eti_Ident_Benef= new Etiqueta( "Identificcion Beneficirio:" );
        eti_Ident_Benef.setBounds(220, 400, 150, 50);

        /**
         * Agrego una Caja de texto de Identificcion Beneficirio
         */

        Input Ident_Benef = new Input();
        Ident_Benef.setBounds(460, 420, 200, 20);

        /**
         * Agrego un CombBox Tipo de Identificcion Beneficirio
         */

        combo_ident_benef = new JComboBox();
        combo_ident_benef.addItem("NV");
        combo_ident_benef.addItem("NE");
        combo_ident_benef.addItem("NP");
        combo_ident_benef.addItem("RP");
        combo_ident_benef.addItem("RV");
        combo_ident_benef.addItem("JJ");
        combo_ident_benef.addItem("JG");
        combo_ident_benef.setBounds(400,415,50,25);





        /**Agregamos los componentes al Contenedor*/
        contenedor.add( eti_tip_id_pag );
        contenedor.add(boton_pago_prove );
        contenedor.add(combo);
        contenedor.add(eti_num_id_pag );
        contenedor.add( num_id_pag);
        contenedor.add(boton_regresar);
        contenedor.add(cuenta_debitar);
        contenedor.add( eti_cuenta_debitar);
        contenedor.add(eti_Cantidad_de_Pagos);
        contenedor.add( Cantidad__pagos);
        contenedor.add(eti_Monto_de_Pago);
        contenedor.add( Monto_de_Pago);
        contenedor.add(eti_Fecha_De_Pago);
        contenedor.add( Fecha_De_Pago);
        contenedor.add( eti_cod_serv);
        contenedor.add(cod_serv);
        contenedor.add( eti_Nombre_Cliente);
        contenedor.add(Nombre_Cliente);
        contenedor.add(eti_Monto_de_Pago2);
        contenedor.add( Monto_de_Pago2);
        contenedor.add(eti_Detalle_de_Pago);
        contenedor.add(Detalle_de_Pago);
        contenedor.add(eti_codigo_cuenta_abonar);
        contenedor.add(codigo_cuenta_abonar);
        contenedor.add(eti_Numero_cuenta_abonar);
        contenedor.add(Numero_cuenta_abonar);
        contenedor.add(eti_correo_elec);
        contenedor.add(correo_elec);
        contenedor.add(eti_Referencia);
        contenedor.add(Referencia);
        contenedor.add( eti_Ident_Benef);
        contenedor.add(Ident_Benef);
        contenedor.add(combo_ident_benef);
        contenedor.add(titulo);






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





    public Container getContenedor()
    {
        return contenedor;
    }

    public void setContenedor( Container contenedor )
    {
        this.contenedor = contenedor;
    }

    public Boton getBoton_pago_prove() {
        return boton_pago_prove;
    }

    public void setBoton_pago_prove(Boton boton_pago_prove) {
        this.boton_pago_prove = boton_pago_prove;
    }


    public Vent_pago_prove getMiVent_pago__prove() {
        return miVent_pago__prove;
    }

    public void setMiVent_pago__prove(Vent_pago_prove miVent_pago__prove) {
        this.miVent_pago__prove = miVent_pago__prove;
    }
}
