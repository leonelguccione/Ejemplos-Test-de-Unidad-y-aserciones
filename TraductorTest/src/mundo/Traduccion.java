 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * $Id: Traduccion.java,v 1.9 2006/08/06 20:17:54 da-romer Exp $
  * Universidad de los Andes (Bogotá - Colombia)
  * Departamento de Ingeniería de Sistemas y Computación
  * Licenciado bajo el esquema Academic Free License versión 2.1
  *
  * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
  * Ejercicio: n7_traductor
  * Autor inicial: Katalina Marcos - Agosto 2005
  * Modificado por: Daniel Romero - Junio 2006
  * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  */
 package mundo;


/**
 * Representa una palabra y su traducción en otro idioma. <br>
 * <b>inv: </b> <br>
 * palabra != null <br>
 * !palabra.equals( "" ) <br>
 * traduccion != null <br>
 * !traduccion.equals( "" )
 */
 public class Traduccion
 {
     // -----------------------------------------------------------------
     // Atributos
     // -----------------------------------------------------------------

     /**
      * Palabra base para la búsqueda
      */
     private String palabra;

     /**
      * Traducción de la palabra
      */
     private String traduccion;

     // -----------------------------------------------------------------
     // Constructores
     // -----------------------------------------------------------------

     /**
      * Crea la traducción de una palabra. <br>
      * <b>post: </b> Se creó la traducción de la palabra especificada.
      * @param pal es la palabra - pal != null y pal != ""
      * @param trad es la traducción - trad != null, trad != ""
      */
     public Traduccion( String pal, String trad )
     {
         palabra = pal;
         traduccion = trad;

         // verifica el invariante
         verificarInvariante( );
     }

     // -----------------------------------------------------------------
     // Métodos
     // -----------------------------------------------------------------

     /**
      * Retorna la palabra base de la traducción. <br>
      * @return La palabra base de la traducción
      */
     public String darPalabra( )
     {
         return palabra;
     }

     /**
      * Retorna la traducción de la palabra. <br>
      * @return La traducción de la palabra
      */
     public String darTraduccion( )
     {
         return traduccion;
     }

     // -----------------------------------------------------------------
     // Invariante
     // -----------------------------------------------------------------

     /**
      * La palabra es válida si no está nula y si es diferente de la cadena vacía. <br>
      * @return True si la palabra es válida, false en caso contrario
      */
     private boolean palabraEsValida( )
     {
         return palabra != null && !palabra.equals( "" );
     }

     /**
      * La traducción es válida si no está nula y si es diferente de la cadena vacía. <br>
      * @return True si la traducción es válida, false en caso contrario
      */
     private boolean traduccionEsValida( )
     {
         return traduccion != null && !traduccion.equals( "" );
     }

     /**
      * Verifica que el invariante de la clase se cumpla. Si algo falla, lanza un AssertionError. <br>
      * <b>inv: </b> palabra no es nula ni es cadena vacía y la traducción no es nula ni es cadena vacía
      */
     private void verificarInvariante( )
     {
         assert palabraEsValida( ) : "La palabra es inválida";
         assert traduccionEsValida( ) : "La traducción es inválida";
     }
 }
