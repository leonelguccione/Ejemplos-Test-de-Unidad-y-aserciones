 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * $Id: PanelAdicion.java,v 1.5 2006/08/06 20:17:54 da-romer Exp $
  * Universidad de los Andes (Bogotá - Colombia)
  * Departamento de Ingeniería de Sistemas y Computación
  * Licenciado bajo el esquema Academic Free License versión 2.1
  *
  * Proyecto Cupi2
  * Ejercicio: n7_traductor (http://cupi2.uniandes.edu.co)
  * Autor: Daniel Francisco Romero - 27-jun-2006
  * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  */
 package interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel para agregar palabras al traductor
 */
 public class PanelAdicion extends JPanel implements ActionListener
 {
     // -----------------------------------------------------------------
     // Constantes
     // -----------------------------------------------------------------
     private final static String AGREGAR = "agregar";
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
     private JLabel etiquetaTraduccion;
     private JLabel etiquetaIdiomaTraduccion;
     private JTextField campoPalabra;
     private JTextField campoTraduccion;
     private JComboBox comboIdiomas;
     private JButton botonAgregar;
     private JButton botonLimpiar;

     // -----------------------------------------------------------------
     // Constructores
     // -----------------------------------------------------------------

     /**
      * Construye el panel de adición de palabras al traductor
      * @param ventanaPrincipal o frame principal - ventanaPrincipal != null
      */
     public PanelAdicion( InterfazTraductor ventanaPrincipal )
     {
         // Guarda referencia a la ventana principal
         principal = ventanaPrincipal;

         // Configura el layout y el borde con título
         setLayout( new GridLayout( 2, 5, 10, 10 ) );
         setBorder( BorderFactory.createTitledBorder( "Agregar palabras" ) );

         // campo para la palabra
         etiquetaPalabra = new JLabel( "Palabra en español" );
         campoPalabra = new JTextField( );

         // campo traducción
         etiquetaTraduccion = new JLabel( "Palabra traducida" );
         campoTraduccion = new JTextField( );

         // combo idioma traducción
         etiquetaIdiomaTraduccion = new JLabel( "Idioma traducción" );
         comboIdiomas = new JComboBox( );
         inicializarComboIdiomas( );

         // Botón de adicionar
         botonAgregar = new JButton( "Agregar" );
         botonAgregar.setActionCommand( AGREGAR );
         botonAgregar.addActionListener( this );

         // Botón limpiar
         botonLimpiar = new JButton( "Limpiar" );
         botonLimpiar.setActionCommand( LIMPIAR );
         botonLimpiar.addActionListener( this );

         // Adiciona los elementos
         add( etiquetaPalabra );
         add( etiquetaTraduccion );
         add( etiquetaIdiomaTraduccion );
         add( new JLabel( "" ) ); // Rellena espacio vacío en la malla
         add( new JLabel( "" ) ); // Rellena espacio vacío en la malla
         add( campoPalabra );
         add( campoTraduccion );
         add( comboIdiomas );
         add( botonAgregar );
         add( botonLimpiar );
     }

     // -----------------------------------------------------------------
     // Métodos
     // -----------------------------------------------------------------

     /**
      * Limpia todos los campos y el combo del formulario
      */
     public void limpiar( )
     {
         campoPalabra.setText( "" );
         campoTraduccion.setText( "" );
         comboIdiomas.setSelectedIndex( -1 );
     }

     /**
      * Responde a los eventos en los elementos de la interfaz
      * @param evento es el evento generado
      */
     public void actionPerformed( ActionEvent evento )
     {
         String comando = evento.getActionCommand( );

         if( comando.equals( AGREGAR ) )
         {
             String palabra = campoPalabra.getText( );
             String traduccion = campoTraduccion.getText( );
             int idioma = comboIdiomas.getSelectedIndex( );
             // Si no se da la palabra en español, presenta el mensaje de error
             if( palabra == null || palabra.equals( "" ) )
             {
                 JOptionPane.showMessageDialog( this, "Debe ingresar la palabra en español", "Error al adicionar", JOptionPane.ERROR_MESSAGE );
                 return;
             }
             else if( traduccion == null || traduccion.equals( "" ) )
             {
                 JOptionPane.showMessageDialog( this, "Debe ingresar la traducción de la palabra", "Error al adicionar", JOptionPane.ERROR_MESSAGE );
                 return;
             }
             else if( idioma == -1 )
             {
                 JOptionPane.showMessageDialog( this, "Debe escoger el idioma en el que se encuentra la traducción de la palabra", "Error al adicionar", JOptionPane.ERROR_MESSAGE );
                 return;
             }
             principal.agregarPalabra( palabra, traduccion, idioma );
         }
         else if( comando.equals( LIMPIAR ) )
         {
             limpiar( );
         }
     }

     /**
      * Inicializa el combo de idiomas con los idiomas que existen en el traductor.<br>
      * <b> pre: </b> comboIdiomas!=null.
      */
     private void inicializarComboIdiomas( )
     {
         comboIdiomas.addItem( InterfazTraductor.IDIOMA_INGLES );
         comboIdiomas.addItem( InterfazTraductor.IDIOMA_FRANCES );
         comboIdiomas.addItem( InterfazTraductor.IDIOMA_ITALIANO );
         comboIdiomas.setSelectedIndex( -1 );
     }
 }