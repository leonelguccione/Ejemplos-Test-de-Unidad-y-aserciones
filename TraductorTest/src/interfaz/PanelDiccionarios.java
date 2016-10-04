 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * $Id: PanelDiccionarios.java,v 1.4 2006/08/06 20:17:54 da-romer Exp $
  * Universidad de los Andes (Bogotá - Colombia)
  * Departamento de Ingeniería de Sistemas y Computación
  * Licenciado bajo el esquema Academic Free License versión 2.1
  *
  * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)  
  * Ejercicio: n7_traductor
  * Autor: Daniel Francisco Romero - 27-jun-2006
  * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  */
 package interfaz;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Panel para presentar los totales de palabras en el traductor
 */
 public class PanelDiccionarios extends JPanel
 {
     // -----------------------------------------------------------------
     // Atributos de Interfaz
     // -----------------------------------------------------------------
     private JTextField totalIngles;
     private JTextField totalFrances;
     private JTextField totalItaliano;
     private JLabel etiquetaIngles;
     private JLabel etiquetaFrances;
     private JLabel etiquetaItalino;

     // -----------------------------------------------------------------
     // Constructores
     // -----------------------------------------------------------------

     /**
      * Crea el panel de totales de palabras en el traductor
      */
     public PanelDiccionarios( )
     {
         // Configura layout y borde con título
         setLayout( new GridLayout( 1, 6, 10, 10 ) );
         setBorder( BorderFactory.createTitledBorder( "Cantidad de Traducciones" ) );

         // Inicializa los elementos de interfaz
         etiquetaIngles = new JLabel( "Inglés:" );
         etiquetaFrances = new JLabel( " Francés:" );
         etiquetaItalino = new JLabel( " Italiano:" );
         totalIngles = new JTextField( );
         totalFrances = new JTextField( );
         totalItaliano = new JTextField( );
         totalIngles.setEditable( false );
         totalFrances.setEditable( false );
         totalItaliano.setEditable( false );

         // Adiciona los elementos
         add( etiquetaIngles );
         add( totalIngles );
         add( etiquetaFrances );
         add( totalFrances );
         add( etiquetaItalino );
         add( totalItaliano );
     }

     // -----------------------------------------------------------------
     // Métodos
     // -----------------------------------------------------------------

     /**
      * Asigna el número de palabras que se tienen traducidas al inglés
      * @param total de palabras - total >= 0
      */
     public void asignarTotalIngles( int total )
     {
         totalIngles.setText( "" + total );
     }

     /**
      * Asigna el número de palabras que se tienen traducidas al francés
      * @param total de palabras - total >= 0
      */
     public void asignarTotalFrances( int total )
     {
         totalFrances.setText( "" + total );
     }

     /**
      * Asigna el número de palabras que se tienen traducidas al italiano
      * @param total de palabras - total >= 0
      */
     public void asignarTotalItalino( int total )
     {
         totalItaliano.setText( "" + total );
     }
 }
