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
public class Vent_pago_nomin extends JFrame implements ActionListener{

    public JComboBox combo ;

    public JComboBox getCombo_ident_benef() {
        return combo_ident_benef;
    }

    public void setCombo_ident_benef(JComboBox combo_ident_benef) {
        this.combo_ident_benef = combo_ident_benef;
    }

    public Input getNum_id_pag() {
        return num_id_pag;
    }

    public void setNum_id_pag(Input num_id_pag) {
        this.num_id_pag = num_id_pag;
    }

    public Input getCuenta_debitar() {
        return cuenta_debitar;
    }

    public void setCuenta_debitar(Input cuenta_debitar) {
        this.cuenta_debitar = cuenta_debitar;
    }

    public Input getCantidad__pagos() {
        return Cantidad__pagos;
    }

    public void setCantidad__pagos(Input cantidad__pagos) {
        Cantidad__pagos = cantidad__pagos;
    }

    public Input getMonto_de_Pago() {
        return Monto_de_Pago;
    }

    public void setMonto_de_Pago(Input monto_de_Pago) {
        Monto_de_Pago = monto_de_Pago;
    }

    public Input getFecha_De_Pago() {
        return Fecha_De_Pago;
    }

    public void setFecha_De_Pago(Input fecha_De_Pago) {
        Fecha_De_Pago = fecha_De_Pago;
    }

    public Input getCod_serv() {
        return cod_serv;
    }

    public void setCod_serv(Input cod_serv) {
        this.cod_serv = cod_serv;
    }

    public Input getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(Input nombre_Cliente) {
        Nombre_Cliente = nombre_Cliente;
    }

    public Input getMonto_de_Pago2() {
        return Monto_de_Pago2;
    }

    public void setMonto_de_Pago2(Input monto_de_Pago2) {
        Monto_de_Pago2 = monto_de_Pago2;
    }

    public Input getDetalle_de_Pago() {
        return Detalle_de_Pago;
    }

    public void setDetalle_de_Pago(Input detalle_de_Pago) {
        Detalle_de_Pago = detalle_de_Pago;
    }

    public Input getCodigo_cuenta_abonar() {
        return codigo_cuenta_abonar;
    }

    public void setCodigo_cuenta_abonar(Input codigo_cuenta_abonar) {
        this.codigo_cuenta_abonar = codigo_cuenta_abonar;
    }

    public Input getNumero_cuenta_abonar() {
        return Numero_cuenta_abonar;
    }

    public void setNumero_cuenta_abonar(Input numero_cuenta_abonar) {
        Numero_cuenta_abonar = numero_cuenta_abonar;
    }

    public Input getIdent_Benef() {
        return Ident_Benef;
    }

    public void setIdent_Benef(Input ident_Benef) {
        Ident_Benef = ident_Benef;
    }

    public JComboBox combo_ident_benef;
    public Input num_id_pag;
    public Input cuenta_debitar;
    public Input Cantidad__pagos;
    public Input Monto_de_Pago;
    public Input Fecha_De_Pago;
    public Input cod_serv;
    public Input Nombre_Cliente;
    public Input Monto_de_Pago2;
    public Input Detalle_de_Pago;
    public Input codigo_cuenta_abonar;
    public Input Numero_cuenta_abonar;
    public Input Ident_Benef;


    /**
     * contenedor de componentes de la ventana
     */
    private Container contenedor;


    /**
     * Ventana
     */
    private  Vent_pago_nomin miVent_pago_nomin;


    /**
     * encapsulamiento de boton para poder usarlo en clases externas
     */
    private Boton boton_pago_nomin;

    public JComboBox getCombo() {
        return combo;
    }

    public void setCombo(JComboBox combo) {
        this.combo = combo;
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
    public Vent_pago_nomin() throws HeadlessException
    {

        iniciarComponentes();
        setTitle( "Pago Nomina" );
        setSize( 1070, 1100);
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
         * Agrego un Boton Pagar Nomina
         */
        boton_pago_nomin = new Boton();
        boton_pago_nomin.setText( "Registrar" );
        boton_pago_nomin.setBounds( 250, 600, 140, 23 );
        boton_pago_nomin.addActionListener (new ActionListener() {


            public void actionPerformed(ActionEvent e) {
                registrar();
            }
        }) ;

        /**
         * Agrego un Boton, Regresar
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

        Etiqueta titulo = new Etiqueta( "Pago Nomina" );
        titulo.setBounds(450, 1, 250, 60);

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
        contenedor.add(boton_pago_nomin );
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
    private void registrar() {

        File documento = new File("Pago_Nomina.txt");

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
            String _cuenta_debitar = cuenta_debitar.getText();
            String _Cantidad__pagos =Cantidad__pagos.getText();
            String _Monto_de_Pago = Monto_de_Pago.getText();
            String _Fecha_De_Pago = Fecha_De_Pago.getText();
            String _cod_serv = cod_serv.getText();
            String _Nombre_Cliente = Nombre_Cliente.getText();
            String _Monto_de_Pago2 = Monto_de_Pago2.getText();
            String _Detalle_de_Pago = Detalle_de_Pago.getText();
            String _codigo_cuenta_abonar = codigo_cuenta_abonar.getText();
            String _Numero_cuenta_abonar =  Numero_cuenta_abonar.getText();
            String _Ident_Benef = Ident_Benef.getText();
            String _combo_ident_benef = combo_ident_benef.getToolTipText();




            String cadena =  (_tipo_id_pag + " " + _num_id_pag + " " + _cuenta_debitar + " "+
                    _Cantidad__pagos + " "  + " " + _Monto_de_Pago+" "+ _Fecha_De_Pago + " " + _cod_serv + " " +
                    _Nombre_Cliente +" "+ _Monto_de_Pago2 + _Detalle_de_Pago + " " + _codigo_cuenta_abonar + " " +
                    _Numero_cuenta_abonar+ " " +  " " + _Ident_Benef+" "+
                    _combo_ident_benef);

            escribir.write(cadena + "\r\n");

            num_id_pag.setText(" ");
            cod_serv.setText(" ");
            num_id_pag.setText(" ");
            cuenta_debitar.setText(" ");
            Cantidad__pagos.setText(" ");
            Monto_de_Pago.setText(" ");
            Fecha_De_Pago.setText(" ");
            cod_serv.setText(" ");
            Nombre_Cliente.setText(" ");
            Monto_de_Pago2.setText(" ");
            Detalle_de_Pago.setText(" ");
            codigo_cuenta_abonar.setText(" ");
            Numero_cuenta_abonar.setText(" ");
            Ident_Benef.setText(" ");

            escribir.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

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



    public void setMiVent_pago_nomin(  Vent_pago_nomin miVent_pago_nominl )
    {
        this.miVent_pago_nomin = miVent_pago_nomin;
    }

    public Container getContenedor()
    {
        return contenedor;
    }

    public void setContenedor( Container contenedor )
    {
        this.contenedor = contenedor;
    }

    public Boton getBoton_pago_nomin() {
        return boton_pago_nomin;
    }

    public void setBoton_pago_nomin(Boton boton_pago_nomin) {
        this.boton_pago_nomin = boton_pago_nomin;
    }

    public  Vent_pago_nomin getMiVent_pago_nomin() {
        return miVent_pago_nomin;
    }
}
