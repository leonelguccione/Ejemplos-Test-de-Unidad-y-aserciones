/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: Traductor.java,v 1.13 2006/08/11 21:34:30 da-romer Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_traductor
 * Autor: Daniel Francisco Romero - 27-jun-2006
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package mundo;

import java.util.ArrayList;

/**
 * Traductor de palabras de espa�ol, ingl�s, franc�s e italiano. <br>
 * <b>inv: </b> <br>
 * espanolIngles != null <br>
 * espanolFrances != null <br>
 * espanolItaliano != null <br>
 * 
 * En el vector espanolIngles no hay palabras repetidas <br>
 * En el vector espanolFrances no hay palabras repetidas <br>
 * En el vector espanolItaliano no hay palabras repetidas <br>
 * 
 * En el vector espanolIngles no hay traducciones repetidas <br>
 * En el vector espanolFrances no hay traducciones repetidas <br>
 * En el vector espanolItaliano no hay traducciones repetidas
 */
public class Traductor
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Idioma ingl�s
     */
    public final static int INGLES = 0;
    /**
     * Idioma franc�s
     */
    public final static int FRANCES = 1;
    /**
     * Idioma italiano
     */
    public final static int ITALIANO = 2;
    /**
     * Idioma espa�ol
     */
    public final static int ESPANOL = 3;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Conjunto de traducciones del espa�ol al ingl�s
     */
    private ArrayList espanolIngles;

    /**
     * Conjunto de traducciones del espa�ol al franc�s
     */
    private ArrayList espanolFrances;

    /**
     * Conjunto de traducciones del espa�ol al italiano
     */
    private ArrayList espanolItaliano;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea al traductor con los diccionarios vac�os. <br>
     * <b> post: </b> Se cre� el traductor con los diccionarios vac�os.
     */
    public Traductor( )
    {
        espanolIngles = new ArrayList( );
        espanolFrances = new ArrayList( );
        espanolItaliano = new ArrayList( );

        // Verifica el invariante
        verificarInvariante( );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Agrega al diccionario una traducci�n de una palabra en espa�ol a un idioma dado. <br>
     * <b> post: </b> La traducci�n fue adicionada al diccionario del idioma especificado.
     * @param pal es la palabra - pal != null y pal != ""
     * @param trad es la traducci�n - trad != null y trad != ""
     * @param idDestino es el idioma destino - idDestino pertenece a {FRANCES, INGLES, ITALIANO}
     * @return True si la palabra pudo ser adicionada al diccionario o false en caso contrario.
     */
    public boolean agregarTraduccion( String pal, String trad, int idDestino )
    {
        boolean agregada = false;
        // Busca la palabra en el diccionario del idioma
        Traduccion laTraduccion = traducirDeEspanol( pal, idDestino );
        // Verifica que la palabra ni la traducci�n existan
        if( laTraduccion == null && !existeTraduccion( idDestino, trad ) )
        {
            // Obtiene el arreglo de las traducciones correspondientes al idioma
            ArrayList traducciones = obtenerDiccionario( idDestino );
            // Agrega la palabra con su traducci�n al diccionario
            traducciones.add( new Traduccion( pal, trad ) );
            agregada = true;
            // Verifica el invariante
            verificarInvariante( );
        }
        // Indica si la palabra fue agregada
        return agregada;
    }

    /**
     * Dada la palabra de b�squeda y el idioma al que se quiere traducir, retorna la traducci�n correspondiente. <br>
     * @param palabra es la palabra a buscar - palabra != null y palabra se encuentra en espa�ol
     * @param idiomaTraduccion es el idioma al que se va a traducir la palabra - idiomaTraduccion pertenece {FRANCES, INGLES, ITALIANO}
     * @return Traducci�n de la palabra en el idioma solicitado. Si no encuentra la palabra retorna null
     */
    private Traduccion traducirDeEspanol( String palabra, int idiomaTraduccion )
    {
        // Obtiene el arreglo de traducciones correspondiente al idioma de traducci�n
        ArrayList traducciones = obtenerDiccionario( idiomaTraduccion );
        Traduccion traduccion = null;
        // Busca la palabra como palabra base en las traducciones
        for( int i = 0; i < traducciones.size( ) && traduccion == null; i++ )
        {
            Traduccion aux = ( Traduccion )traducciones.get( i );
            if( aux.darPalabra( ).equalsIgnoreCase( palabra ) )
                traduccion = aux;
        }
        return traduccion;
    }

    /**
     * Seg�n el idioma retorna el diccionario correspondiente. <br>
     * @param idiomaTraduccion es el idioma de la traducci�n - idiomaTraduccion pertenece {FRANCES, INGLES, ITALIANO}
     * @return Arreglo con las traducciones del espa�ol al idioma dado. Si no se maneja esa traducci�n retorna null
     */
    private ArrayList obtenerDiccionario( int idiomaTraduccion )
    {
        switch( idiomaTraduccion )
        {
            case INGLES:
                return espanolIngles;
            case ITALIANO:
                return espanolItaliano;
            case FRANCES:
                return espanolFrances;
            default:
                return null;
        }
    }

    /**
     * Indica si la traducci�n especificada ya existe en el diccionario del idioma dado. <br>
     * <b> post: </b> Se retorn� true si la traducci�n ya se encuentra asignada o false de lo contrario.
     * @param idiomaTraduccion es el idioma del diccionario - idiomaTraduccion pertenece {FRANCES, INGLES, ITALIANO}
     * @param traduccion es la traducci�n a ser buscada en el diccionario - traducion!=null
     * @return True si la traducci�n ya se encuentra asignada o false de lo contrario.
     */
    private boolean existeTraduccion( int idiomaTraduccion, String traduccion )
    {
        boolean existe = false;
        ArrayList traducciones = obtenerDiccionario( idiomaTraduccion );
        // Recorre el diccionario buscando si hay palabras con la misma traducci�n
        for( int i = 0; i < traducciones.size( ) && !existe; i++ )
        {
            Traduccion t = ( Traduccion )traducciones.get( i );
            String palabraTraducida = t.darTraduccion( );
            if( palabraTraducida.equalsIgnoreCase( traduccion ) )
                existe = true;
        }
        return existe;
    }

    /**
     * Dada una palabra, el idioma en el que est� y el idioma al que se quiere traducir, este m�todo retorna la traducci�n correspondiente. Para que la traducci�n exista entre
     * dos idiomas diferentes es necesario que la traducci�n de la palabra exista en los dos idiomas implicados. As� por ejemplos para traducir una palabra de franc�s a ingl�s
     * es necesario que exista la traducci�n en el diccionario de espa�ol-franc�s y que la traducci�n de la palabra en espa�ol exista el diccionario espa�ol-ingl�s. <br>
     * @param pal es la palabra - pal != null
     * @param idOrigen es el idioma de origen - idOrigen pertenece a {FRANCES, INGLES, ITALIANO, ESPANOL}
     * @param idDestino es el idioma destino - idDestino pertenece a {FRANCES, INGLES, ITALIANO, ESPANOL}
     * @return Traducci�n de la palabra en el idioma destino. Si no existe, retorna null.
     */
    public Traduccion traducir( String pal, int idOrigen, int idDestino )
    {
        // Solo se realiza la traducci�n si los dos idiomas son diferentes
        if( idOrigen != idDestino )
        {
            if( idOrigen == ESPANOL )
            {
                return traducirDeEspanol( pal, idDestino );
            }
            else if( idDestino == ESPANOL )
            {
                return traducirAEspanol( pal, idOrigen );
            }
            else
            {
                Traduccion aux = traducirAEspanol( pal, idOrigen );
                if( aux != null )
                    return traducirDeEspanol( aux.darPalabra( ), idDestino );
            }
        }
        return null;
    }

    /**
     * Dada la palabra de b�squeda y el idioma en el que se encuentra, retorna la traducci�n correspondiente al espa�ol. <br>
     * @param palabra es la palabra a buscar - palabra != null
     * @param idiomaOrigen es el idioma en el que se encuentra la palabra - idiomaOrigen pertenece {FRANCES, INGLES, ITALIANO}
     * @return Traducci�n de la palabra en espa�ol - Si no encuentra la traducci�n retorna null
     */
    private Traduccion traducirAEspanol( String palabra, int idiomaOrigen )
    {
        // Obtiene el arreglo de traducciones correspondiente al idioma origen
        ArrayList traducciones = obtenerDiccionario( idiomaOrigen );
        Traduccion traduccion = null;
        // Busca la palabra como la traducci�n en el diccionario
        for( int i = 0; i < traducciones.size( ) && traduccion == null; i++ )
        {
            Traduccion aux = ( Traduccion )traducciones.get( i );
            if( aux.darTraduccion( ).equalsIgnoreCase( palabra ) )
                traduccion = aux;
        }
        return traduccion;
    }

    /**
     * Retorna el n�mero de palabras del diccionario de un idioma dado. <br>
     * @param idDestino es el idioma destino - idDestino pertenece a {FRANCES, INGLES, FRANCES}
     * @return N�mero de palabras en el diccionario
     */
    public int darTotalPalabrasTraducidas( int idDestino )
    {
        // Obtiene el arreglo de traducciones correspondiente
        ArrayList traducciones = obtenerDiccionario( idDestino );
        if( traducciones == null )
            return 0;
        else
            return traducciones.size( );
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    /**
     * Indica si hay palabras repetidas en el diccionario del idioma dado. <br>
     * @param idTrad es el idioma del diccionario - idTrad pertenece a {FRANCES, INGLES, ITALIANO}
     * @return True si hay al menos una palabra repetida o false en caso contrario.
     */
    private boolean hayPalabrasRepetidas( int idTrad )
    {
        Traduccion traduccion;
        Traduccion otraTraduccion;
        String palabra;
        ArrayList traducciones = obtenerDiccionario( idTrad );

        // Recorre las traducciones buscando si hay palabras repetidas
        for( int i = 0; i < traducciones.size( ) - 1; i++ )
        {
            traduccion = ( Traduccion )traducciones.get( i );
            palabra = traduccion.darPalabra( );
            for( int j = i + 1; j < traducciones.size( ); j++ )
            {
                otraTraduccion = ( Traduccion )traducciones.get( j );
                if( palabra.equalsIgnoreCase( otraTraduccion.darPalabra( ) ) )
                    return true;
            }
        }
        return false;
    }

    /**
     * Indica si hay palabras con la misma traducci�n en el diccionario del idioma dado. <br>
     * @param idTrad es el idioma del diccionario - idTrad pertenece a {FRANCES, INGLES, ITALIANO}
     * @return True si hay dos palabras con la misma traducci�n o false en caso contrario.
     */
    private boolean hayTraduccionesRepetidas( int idTrad )
    {
        Traduccion traduccion;
        Traduccion otraTraduccion;
        String palabraTraducida;
        ArrayList traducciones = obtenerDiccionario( idTrad );

        // Recorre las traducciones buscando si hay palabras con la misma traducci�n
        for( int i = 0; i < traducciones.size( ) - 1; i++ )
        {
            traduccion = ( Traduccion )traducciones.get( i );
            palabraTraducida = traduccion.darTraduccion( );
            for( int j = i + 1; j < traducciones.size( ); j++ )
            {
                otraTraduccion = ( Traduccion )traducciones.get( j );
                if( palabraTraducida.equalsIgnoreCase( otraTraduccion.darTraduccion( ) ) )
                    return true;
            }
        }
        return false;
    }

    // -----------------------------------------------------------------
    // Invariante
    // -----------------------------------------------------------------

    /**
     * Verifica que el invariante de la clase se cumpla. Si algo falla, lanza un AssertError.<br>
     * <b>inv: </b> <br>
     * espanolIngles != null <br>
     * espanolFrances != null <br>
     * espanolItaliano != null <br>
     * En el diccionario espa�ol-ingl�s no hay palabras repetidas <br>
     * En el diccionario espa�ol-franc�s no hay palabras repetidas <br>
     * En el diccionario espa�ol-italiano no hay palabras repetidas
     */
    private void verificarInvariante( )
    {
        assert espanolIngles != null : "Diccionario espa�ol-ingles sin inicializar";
        assert espanolFrances != null : "Diccionario espa�ol-franc�s sin inicializar";
        assert espanolItaliano != null : "Diccionario espa�ol-italiano sin inicializar";

        assert !hayPalabrasRepetidas( INGLES ) : "Palabras repetidas en el diccionario de ingl�s";
        assert !hayPalabrasRepetidas( FRANCES ) : "Palabras repetidas en el diccionario de franc�s";
        assert !hayPalabrasRepetidas( ITALIANO ) : "Palabras repetidas en el diccionario de italiano";

        assert !hayTraduccionesRepetidas( INGLES ) : "Traducciones repetidas en el diccionario de ingl�s";
        assert !hayTraduccionesRepetidas( FRANCES ) : "Traducciones repetidas en el diccionario de franc�s";
        assert !hayTraduccionesRepetidas( ITALIANO ) : "Traducciones repetidas en el diccionario de italiano";
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * Ejecuta el punto de extensi�n 1
     * @return respuesta 1
     */
    public String metodo1( )
    {
        return "respuesta1";
    }

    /**
     * Ejecuta el punto de extensi�n 2
     * @return respuesta 2
     */
    public String metodo2( )
    {
        return "respuesta2";
    }
}