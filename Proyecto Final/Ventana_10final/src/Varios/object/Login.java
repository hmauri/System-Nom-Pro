package Varios.object;

import Varios.object.componentes.Boton;
import Varios.object.componentes.Etiqueta;
import Varios.object.componentes.Input;

import javax.swing.*;
import java.awt.*;

/**
 * Created by WINDOWS XP on 09/11/15.
 */
public class Login extends JFrame {

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
    private Login miLogin;


    /**
     * Nombre:                  Login
     * Descripcion:             constructor de la clase
     *
     * @throws HeadlessException
     * @version 1.0
     * @author Leonor Guzman
     * @since 11/5/2015
     */
    public Login() throws HeadlessException {

        iniciarComponentes();
        setTitle("System Nom-Pro");
        setSize(300, 230);
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
         * Agrego una Etiqueta Usuario
         */

        Etiqueta eti_login= new Etiqueta( "Usuario: " );
        eti_login.setBounds(20, 40, 250, 60);

        /**
         * Agrego una Caja de texto de Usuario
         */

        Input log = new Input();
        log.setBounds(80, 60, 100, 20);
        /**
         * Agrego una Etiqueta Clave
         */

        Etiqueta eti_pass= new Etiqueta( "Clave: " );
        eti_pass.setBounds(20, 80, 250, 60);

        /**
         * Agrego una Caja de texto de Clave
         */

        Input pass = new Input();
        pass.setBounds(80, 100, 100, 20);




        /**
         * Agrego un Boton, Conectar
         */
        Boton boton_Afi_Prove = new Boton();
        boton_Afi_Prove.setText("Conectar");
        boton_Afi_Prove.setBounds(60, 130, 140, 23);
        boton_Afi_Prove.addActionListener(new Boton_Login());

        /**
         * Agrego una Etiqueta Login
         */
        Etiqueta etiqueta = new Etiqueta("Login");
        etiqueta.setBounds(80, 15, 250, 60);




        /**Agregamos los componentes al Contenedor*/
        contenedor.add(etiqueta);
        contenedor.add(boton_Afi_Prove);
        contenedor.add(eti_login);
        contenedor.add(log);
        contenedor.add(eti_pass);
        contenedor.add(pass);




    }


    public Login getMiLogin() {
        return miLogin;
    }

    public void setMiLogin(Login miLogin) {
        this.miLogin = miLogin;
    }

    public Container getContenedor() {
        return contenedor;
    }

    public void setContenedor(Container contenedor) {
        this.contenedor = contenedor;
    }




}
