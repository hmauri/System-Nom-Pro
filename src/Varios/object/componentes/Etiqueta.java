package Varios.object.componentes;

import javax.swing.*;

/**
 * Sistema:             Varios
 * Nombre:
 * Fecha creacion:      11/5/2015
 * Version:             1.0
 * Descripcion:
 * Autor:               Leonor Guzman
 */
public class Etiqueta extends JLabel
{
    /**
     * constructor de la clase
     * @param text titulo de la etiqueta
     */
    public Etiqueta( String text )
    {
        super( text );
    }

    /**
     * Nombre:                  setBound
     * Descripcion:             metodo de posicionamiento en la pantalla
     * @version                 1.0
     * @author                  Leonor Guzman
     * @since                   11/5/2015
     *
     * @param x posicion en equis
     * @param y posicion en ye
     * @param width ancho
     * @param height alto
     */
    public void setBound (int x, int y, int width, int height){
        this.setBounds( x, y, width, height );
    }


}
