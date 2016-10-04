 /**
  * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * $Id: PanelExtension.java,v 1.4 2006/08/06 20:17:54 da-romer Exp $
  * Universidad de los Andes (Bogotá - Colombia)
  * Departamento de Ingeniería de Sistemas y Computación 
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
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Panel de manejo de extensiones
 */
 public class PanelExtension extends JPanel implements ActionListener
 {

     // -----------------------------------------------------------------
     // Constantes
     // -----------------------------------------------------------------

     /**
      * Comando Opción 1
      */
     private static final String OPCION_1 = "OPCION_1";

     /**
      * Comando Opción 2
      */
     private static final String OPCION_2 = "OPCION_2";

     // -----------------------------------------------------------------
     // Atributos
     // -----------------------------------------------------------------

     /**
      * Ventana principal de la aplicación
      */
     private InterfazTraductor principal;

     // -----------------------------------------------------------------
     // Atributos de interfaz
     // -----------------------------------------------------------------

     /**
      * Botón Opción 1
      */
     private JButton btnOpcion1;

     /**
      * Botón Opción 2
      */
     private JButton btnOpcion2;

     // -----------------------------------------------------------------
     // Constructores
     // -----------------------------------------------------------------

     /**
      * Constructor del panel
      * @param ventana o frame principal - ventanaPrincipal != null
      */
     public PanelExtension( InterfazTraductor ventana )
     {
         principal = ventana;

         setBorder( new TitledBorder( "Opciones" ) );
         setLayout( new GridBagLayout( ) );

         // Botón opción 1
         GridBagConstraints gbc = new GridBagConstraints( );
         gbc.ipadx = 0;
         gbc.ipady = 1;
         gbc.insets = new Insets( 0, 0, 0, 10 );
         btnOpcion1 = new JButton( "Opción 1" );
         btnOpcion1.setActionCommand( OPCION_1 );
         btnOpcion1.addActionListener( this );
         add( btnOpcion1, gbc );

         // Botón opción 2
         gbc = new GridBagConstraints( );
         gbc.ipadx = 0;
         gbc.ipady = 2;
         btnOpcion2 = new JButton( "Opción 2" );
         btnOpcion2.setActionCommand( OPCION_2 );
         btnOpcion2.addActionListener( this );
         add( btnOpcion2, gbc );
     }

     // -----------------------------------------------------------------
     // Métodos
     // -----------------------------------------------------------------

     /**
      * Manejo de los eventos de los botones
      * @param e es la acción que generó el evento
      */
     public void actionPerformed( ActionEvent e )
     {
         if( OPCION_1.equals( e.getActionCommand( ) ) )
         {
             principal.reqFuncOpcion1( );
         }
         else if( OPCION_2.equals( e.getActionCommand( ) ) )
         {
             principal.reqFuncOpcion2( );
         }
     }
 }
