/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Traduccion.java,v 1.9 2006/08/06 20:17:54 da-romer Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n
 * Licenciado bajo el esquema Academic Free License versi�n 2.1
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_traductor
 * Autor inicial: Katalina Marcos - Agosto 2005
 * Modificado por: Daniel Romero - Junio 2006
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package mundo;

/**
 * Representa una palabra y su traducci�n en otro idioma. <br>
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
     * Palabra base para la b�squeda
     */
    private String palabra;

    /**
     * Traducci�n de la palabra
     */
    private String traduccion;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la traducci�n de una palabra. <br>
     * <b>post: </b> Se cre� la traducci�n de la palabra especificada.
     * @param pal es la palabra - pal != null y pal != ""
     * @param trad es la traducci�n - trad != null, trad != ""
     */
    public Traduccion( String pal, String trad )
    {
        palabra = pal;
        traduccion = trad;

        // verifica el invariante
        verificarInvariante( );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna la palabra base de la traducci�n. <br>
     * @return La palabra base de la traducci�n
     */
    public String darPalabra( )
    {
        return palabra;
    }

    /**
     * Retorna la traducci�n de la palabra. <br>
     * @return La traducci�n de la palabra
     */
    public String darTraduccion( )
    {
        return traduccion;
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    /**
     * La palabra es v�lida si no est� nula y si es diferente de la cadena vac�a. <br>
     * @return True si la palabra es v�lida, false en caso contrario
     */
    private boolean palabraEsValida( )
    {
        return palabra != null && !palabra.equals( "" );
    }

    /**
     * La traducci�n es v�lida si no est� nula y si es diferente de la cadena vac�a. <br>
     * @return True si la traducci�n es v�lida, false en caso contrario
     */
    private boolean traduccionEsValida( )
    {
        return traduccion != null && !traduccion.equals( "" );
    }

    /**
     * Verifica que el invariante de la clase se cumpla. Si algo falla, lanza un AssertionError. <br>
     * <b>inv: </b> palabra no es nula ni es cadena vac�a y la traducci�n no es nula ni es cadena vac�a
     */
    private void verificarInvariante( )
    {
        assert palabraEsValida( ) : "La palabra es inv�lida";
        assert traduccionEsValida( ) : "La traducci�n es inv�lida";
    }
}
