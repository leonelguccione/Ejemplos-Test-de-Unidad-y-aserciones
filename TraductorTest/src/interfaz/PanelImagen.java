 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * $Id: PanelImagen.java,v 1.5 2006/08/08 13:32:58 da-romer Exp $
  * 
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

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Es el panel donde se muestra una imagen decorativa
 */
 public class PanelImagen extends JPanel
 {

     // -----------------------------------------------------------------
     // Atributos de Interfaz
     // -----------------------------------------------------------------

     /**
      * Imagen del titulo
      */
     private JLabel imagen;

     // -----------------------------------------------------------------
     // Constructores
     // -----------------------------------------------------------------

     /**
      * Constructor sin parámetros
      */
     public PanelImagen( )
     {
         FlowLayout layout = new FlowLayout( );
         layout.setHgap( 0 );
         layout.setVgap( 0 );
         setLayout( layout );

         // Carga la imagen
         ImageIcon icono = new ImageIcon( "data/titulo.jpg" );

         // La agrega a la etiqueta
         imagen = new JLabel( "" );
         imagen.setIcon( icono );
         add( imagen );

         // Color de fondo blanco
         setBackground( Color.WHITE );
         setBorder( new LineBorder( Color.GRAY ) );
     }
 }
