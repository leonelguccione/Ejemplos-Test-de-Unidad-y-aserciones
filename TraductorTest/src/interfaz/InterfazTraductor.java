/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: InterfazTraductor.java,v 1.9 2006/08/08 13:32:58 da-romer Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_traductor
 * Autor: Daniel Francisco Romero - 27-jun-2006
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package interfaz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Traduccion;
import mundo.Traductor;


/**
 * Esta es la ventana principal de la aplicaci�n.
 */
public class InterfazTraductor extends JFrame
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------
    public static final String IDIOMA_ESPANOL = "Espa�ol";
    public static final String IDIOMA_INGLES = "Ingl�s";
    public static final String IDIOMA_FRANCES = "Franc�s";
    public static final String IDIOMA_ITALIANO = "Italiano";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Clase principal del mundo
     */
    private Traductor traductor;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Panel con las extensiones
     */
    private PanelExtension panelExtension;

    /**
     * Panel para la adici�n de palabras
     */
    private PanelAdicion panelAdicion;

    /**
     * Panel con estad�sticas sobre el n�mero de palabras en cada diccionario
     */
    private PanelDiccionarios panelDiccionarios;

    /**
     * Panel para las consultas de las traducciones
     */
    private PanelConsulta panelConsulta;

    /**
     * Panel para mostrar una imagen decorativa
     */
    private PanelImagen panelImagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la ventana principal de la aplicaci�n.
     */
    public InterfazTraductor( )
    {
        // Crea la clase principal
        traductor = new Traductor( );

        // Construye la forma
        getContentPane( ).setLayout( new GridBagLayout( ) );
        setSize( 720, 425 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setTitle( "Traductor" );
        setResizable( false );

        // Creaci�n de los paneles
        GridBagConstraints gbc = new GridBagConstraints( );
        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelImagen = new PanelImagen( );
        getContentPane( ).add( panelImagen, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelConsulta = new PanelConsulta( this );
        getContentPane( ).add( panelConsulta, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelAdicion = new PanelAdicion( this );
        getContentPane( ).add( panelAdicion, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelDiccionarios = new PanelDiccionarios( );
        refrescarTotalesDiccionarios( );
        getContentPane( ).add( panelDiccionarios, gbc );

        gbc = new GridBagConstraints( );
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panelExtension = new PanelExtension( this );
        getContentPane( ).add( panelExtension, gbc );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------
    /**
     * Agrega una palabra al idioma en la que se ha especificado una traducci�n
     * @param pal es la palabra - pal != null y pal != ""
     * @param trad es la traducci�n - trad != null y trad != ""
     * @param idioma es el idioma destino - idioma pertenece a {FRANCES, INGLES, ITALIANO}
     */
    public void agregarPalabra( String pal, String trad, int idioma )
    {
        // Adiciona la traducci�n
        if( traductor.agregarTraduccion( pal, trad, idioma ) )
        {
            panelAdicion.limpiar( );
            // Actualiza los totales
            refrescarTotalesDiccionarios( );
        }
        else
            JOptionPane.showMessageDialog( this, "La palabra ya existe o su traducci�n ya est� asignada a otra palabra", "Error al adicionar", JOptionPane.ERROR_MESSAGE );
    }

    /**
     * Traduce una palabra y muestra el resultado en el panel de consulta
     * @param pal es la palabra - pal != null
     * @param origen es el idioma de origen - origen pertenece a {FRANCES, INGLES, ITALIANO, ESPANOL}
     * @param destino es el idioma destino - destino pertenece a {FRANCES, INGLES, ITALIANO, ESPANOL}
     */
    public void traducirPalabra( String pal, int origen, int destino )
    {
        Traduccion traduccion = traductor.traducir( pal, origen, destino );
        if( traduccion != null )
        {
            // Dependiendo del idioma destino se muestra la palabra o la traducci�n
            if( destino == Traductor.ESPANOL )
            {
                // Si es espa�ol el idioma destino se muestra la traducci�n
                panelConsulta.mostrarTraduccion( traduccion.darPalabra( ) );
            }
            else
            {
                // Si el idioma destino no es espa�ol se muestra la palabra
                panelConsulta.mostrarTraduccion( traduccion.darTraduccion( ) );
            }
        }
        else
        {
            panelConsulta.mostrarTraduccion( "" );
            JOptionPane.showMessageDialog( this, "No existe la traducci�n de la palabra", "Traducci�n", JOptionPane.ERROR_MESSAGE );
        }
    }

    /**
     * Asigna los valores de totales de las palabras en el respectivo panel
     */
    private void refrescarTotalesDiccionarios( )
    {
        panelDiccionarios.asignarTotalIngles( traductor.darTotalPalabrasTraducidas( Traductor.INGLES ) );
        panelDiccionarios.asignarTotalFrances( traductor.darTotalPalabrasTraducidas( Traductor.FRANCES ) );
        panelDiccionarios.asignarTotalItalino( traductor.darTotalPalabrasTraducidas( Traductor.ITALIANO ) );
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1
     */
    public void reqFuncOpcion1( )
    {
        String resultado = traductor.metodo1( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    /**
     * M�todo para la extensi�n 2
     */
    public void reqFuncOpcion2( )
    {
        String resultado = traductor.metodo2( );
        JOptionPane.showMessageDialog( this, resultado, "Respuesta", JOptionPane.INFORMATION_MESSAGE );
    }

    // -----------------------------------------------------------------
    // Programa principal
    // -----------------------------------------------------------------

    public static void main( String[] args )
    {
        InterfazTraductor interfaz = new InterfazTraductor( );
        interfaz.setVisible( true );
    }    
}