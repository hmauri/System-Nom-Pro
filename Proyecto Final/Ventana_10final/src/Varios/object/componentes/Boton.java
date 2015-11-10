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
public class Boton extends JButton
{
    /**
     * Nombre:                  Boton
     * Descripcion:             constructor de la clase
     * @version                 1.0
     * @author                  Leonor Guzman
     * @since                   11/5/2015
     *
     */
    public Boton()
    {

    }

    public Boton( String text )
    {
        super( text );
    }

    public Boton( Action a )
    {
        super( a );
    }
}
