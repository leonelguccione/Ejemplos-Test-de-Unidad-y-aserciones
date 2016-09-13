/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: PanelConsulta.java,v 1.7 2006/08/06 20:17:54 da-romer Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n
 * Licenciado bajo el esquema Academic Free License versi�n 2.1
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_traductor
 * Autor: Daniel Francisco Romero - 27-jun-2006
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * Panel para la consulta de las traducciones
 */
public class PanelConsulta extends JPanel implements ActionListener
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    private final static String TRADUCIR = "traducir";
    private final static String LIMPIAR = "limpiar";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------
    /**
     * Ventana principal
     */
    private InterfazTraductor principal;

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------
    private JLabel etiquetaPalabra;
    private JTextField campoPalabra;
    private JLabel etiquetaIdiomaTraduccionOrigen;
    private JLabel etiquetaIdiomaTraduccionDestino;
    private JComboBox comboIdiomaTraduccionOrigen;
    private JComboBox comboIdiomaTraduccionDestino;
    private JLabel etiquetaTraduccion;
    private JTextField campoTraduccion;
    private JButton botonTraducir;
    private JButton botonLimpiar;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel con el formulario para la consulta
     * @param ventanaPrincipal o frame principal - ventanaPrincipal != null
     */
    public PanelConsulta( InterfazTraductor ventanaPrincipal )
    {
        // Guarda referencia a la ventana principal
        principal = ventanaPrincipal;

        // Configura el layout y el borde con t�tulo
        setLayout( new GridLayout( 2, 5, 10, 10 ) );
        setBorder( BorderFactory.createTitledBorder( "Consulta de traducciones" ) );

        // Campo para la palabra
        etiquetaPalabra = new JLabel( "Palabra" );
        campoPalabra = new JTextField( );

        // Campo para el resultado de la traducci�n de la palabra
        etiquetaTraduccion = new JLabel( "Traducci�n" );
        campoTraduccion = new JTextField( );
        campoTraduccion.setEditable( false );

        // Combo para el idioma de la traducci�n
        etiquetaIdiomaTraduccionOrigen = new JLabel( "Idioma origen" );
        comboIdiomaTraduccionOrigen = new JComboBox( );
        inicializarComboIdiomaTraduccion( comboIdiomaTraduccionOrigen );

        // Combo para el idioma destino
        etiquetaIdiomaTraduccionDestino = new JLabel( "Idioma destino" );
        comboIdiomaTraduccionDestino = new JComboBox( );
        inicializarComboIdiomaTraduccion( comboIdiomaTraduccionDestino );

        // Campo para el resultado de la traducci�n
        campoTraduccion = new JTextField( );
        campoTraduccion.setEditable( false );

        // Botones
        botonTraducir = new JButton( "Traducir" );
        botonTraducir.addActionListener( this );
        botonTraducir.setActionCommand( TRADUCIR );

        botonLimpiar = new JButton( "Limpiar" );
        botonLimpiar.addActionListener( this );
        botonLimpiar.setActionCommand( LIMPIAR );

        // Adiciona los elementos a la interfaz
        add( etiquetaPalabra );
        add( etiquetaIdiomaTraduccionOrigen );
        add( etiquetaIdiomaTraduccionDestino );
        add( etiquetaTraduccion );
        add( new JLabel( "" ) );
        add( new JLabel( "" ) );
        add( campoPalabra );
        add( comboIdiomaTraduccionOrigen );
        add( comboIdiomaTraduccionDestino );
        add( campoTraduccion );
        add( botonTraducir );
        add( botonLimpiar );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Asigna la traducci�n de una palabra
     * @param traduccion de una palabra
     */
    public void mostrarTraduccion( String traduccion )
    {
        campoTraduccion.setText( traduccion );
    }

    /**
     * Responde a los eventos en los elementos de la interfaz
     * @param evento es el evento generado
     */
    public void actionPerformed( ActionEvent evento )
    {
        String comando = evento.getActionCommand( );

        if( comando.equals( TRADUCIR ) )
        {
            String palabra = campoPalabra.getText( );
            int origen = comboIdiomaTraduccionOrigen.getSelectedIndex( );
            int destino = comboIdiomaTraduccionDestino.getSelectedIndex( );

            if( palabra == null || palabra.equals( "" ) )
            {
                JOptionPane.showMessageDialog( this, "Debe ingresar la palabra a ser traducida!", "Error en la traducci�n", JOptionPane.ERROR_MESSAGE );
                return;
            }
            else if( origen == -1 )
            {
                JOptionPane.showMessageDialog( this, "Debe seleccionar el idioma origen para realizar la traducci�n!", "Error en la traducci�n", JOptionPane.ERROR_MESSAGE );
                return;
            }
            else if( destino == -1 )
            {
                JOptionPane.showMessageDialog( this, "Debe seleccionar el idioma destino para realizar la traducci�n!", "Error en la traducci�n", JOptionPane.ERROR_MESSAGE );
                return;
            }
            principal.traducirPalabra( palabra, origen, destino );
        }
        else if( comando.equals( LIMPIAR ) )
        {
            limpiar( );
        }
    }

    /**
     * Inicializa el combo especificado con las traducciones posibles.<br>
     * <b> pre: </b> comboIdiomaTraduccion!=null.
     */
    private void inicializarComboIdiomaTraduccion( JComboBox combo )
    {
        combo.addItem(InterfazTraductor.IDIOMA_INGLES );
        combo.addItem(InterfazTraductor.IDIOMA_FRANCES );
        combo.addItem(InterfazTraductor.IDIOMA_ITALIANO );
        combo.addItem(InterfazTraductor.IDIOMA_ESPANOL );
        combo.setSelectedIndex( -1 );
    }

    /**
     * Limpia todos los campos y el combo del formulario
     */
    public void limpiar( )
    {
        campoPalabra.setText( "" );
        campoTraduccion.setText( "" );
        comboIdiomaTraduccionOrigen.setSelectedIndex( -1 );
        comboIdiomaTraduccionDestino.setSelectedIndex( -1 );
    }
}