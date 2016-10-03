 /**
  * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * $Id: TraductorTest.java,v 1.8 2006/08/08 13:33:07 da-romer Exp $
  * Universidad de los Andes (Bogotá - Colombia)
  * Departamento de Ingeniería de Sistemas y Computación 
  * Licenciado bajo el esquema Academic Free License version 2.1 
  *
  * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
  * Ejercicio: n7_traductor
  * Autor: Daniel Francisco Romero - 27-jun-2006
  * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  */

package test.testCase;

import junit.framework.TestCase;

import mundo.Traduccion;
import mundo.Traductor;

/**
 * Esta es la clase usada para verificar que los métodos de la clase Traductor estén correctamente implementados
 */
public class TraductorTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es la clase donde se harán las pruebas
     */
    private Traductor traductor;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Crea al traductor con 12 traducciones de cada idioma
     */
    private void setupEscenario1( )
    {
        traductor = new Traductor( );

        // Agrega 12 palabras con traducción en inglés
        traductor.agregarTraduccion( "perro", "dog", Traductor.INGLES );
        traductor.agregarTraduccion( "blanco", "white", Traductor.INGLES );
        traductor.agregarTraduccion( "casa", "house", Traductor.INGLES );
        traductor.agregarTraduccion( "cielo", "sky", Traductor.INGLES );
        traductor.agregarTraduccion( "amor", "love", Traductor.INGLES );
        traductor.agregarTraduccion( "anillo", "ring", Traductor.INGLES );
        traductor.agregarTraduccion( "torre", "tower", Traductor.INGLES );
        traductor.agregarTraduccion( "león", "lion", Traductor.INGLES );
        traductor.agregarTraduccion( "basura", "garbage", Traductor.INGLES );
        traductor.agregarTraduccion( "bello", "beautiful", Traductor.INGLES );
        traductor.agregarTraduccion( "ratón", "mouse", Traductor.INGLES );
        traductor.agregarTraduccion( "lápiz", "pencil", Traductor.INGLES );

        // Agrega 12 palabras con traducción en francés
        traductor.agregarTraduccion( "casa", "maison", Traductor.FRANCES );
        traductor.agregarTraduccion( "libro", "livre", Traductor.FRANCES );
        traductor.agregarTraduccion( "azul", "bleu", Traductor.FRANCES );
        traductor.agregarTraduccion( "comida", "nourriture", Traductor.FRANCES );
        traductor.agregarTraduccion( "hombre", "homme", Traductor.FRANCES );
        traductor.agregarTraduccion( "rojo", "rouge", Traductor.FRANCES );
        traductor.agregarTraduccion( "bolso", "sac", Traductor.FRANCES );
        traductor.agregarTraduccion( "lasaña", "lasagne", Traductor.FRANCES );
        traductor.agregarTraduccion( "profundo", "profond", Traductor.FRANCES );
        traductor.agregarTraduccion( "deber", "devoir", Traductor.FRANCES );
        traductor.agregarTraduccion( "ratón", "souris", Traductor.FRANCES );
        traductor.agregarTraduccion( "lápiz", "crayon", Traductor.FRANCES );

        // Agrega 12 palabras con traducción en italiano
        traductor.agregarTraduccion( "mesa", "tavlo", Traductor.ITALIANO );
        traductor.agregarTraduccion( "hoja", "foglia", Traductor.ITALIANO );
        traductor.agregarTraduccion( "revista", "rivista", Traductor.ITALIANO );
        traductor.agregarTraduccion( "pasta", "pasta", Traductor.ITALIANO );
        traductor.agregarTraduccion( "ratón", "topo", Traductor.ITALIANO );
        traductor.agregarTraduccion( "billete", "bigletto", Traductor.ITALIANO );
        traductor.agregarTraduccion( "cable", "filo elettrico", Traductor.ITALIANO );
        traductor.agregarTraduccion( "tapa", "coperchio", Traductor.ITALIANO );
        traductor.agregarTraduccion( "cine", "cinema", Traductor.ITALIANO );
        traductor.agregarTraduccion( "tío", "zio", Traductor.ITALIANO );
        traductor.agregarTraduccion( "lápiz", "rossetto", Traductor.ITALIANO );
        traductor.agregarTraduccion( "disco", "disco", Traductor.ITALIANO );
    }

    /**
     * Crea un traductor vacío
     */
    private void setupEscenario2( )
    {
        traductor = new Traductor( );
    }

    /**
     * Prueba la adición correcta de traducciones. <br>
     * <b> Métodos a probar: </b> <br>
     * agregarTraduccion, traducir, darTotalPalabrasTraducidas. <br>
     * <b> Objetivo: </b> Probar que el método agregarTraduccion es capaz de agregar palabras y traducciones válidas a cualquiera de los diccionarios. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al agregar una traducción se debe incrementar el número de traducciones en el diccionario respectivo. <br>
     * 2. Al buscar una traducción de español a inglés previamente agregada ésta debe ser encontrada. <br>
     * 3. Al buscar una traducción de inglés a español previamente agregada ésta debe ser encontrada. <br>
     * 4. Al buscar una traducción de español a francés previamente agregada ésta debe ser encontrada. <br>
     * 5. Al buscar una traducción de francés a español previamente agregada ésta debe ser encontrada. <br>
     * 6. Al buscar una traducción de español a italiano previamente agregada ésta debe ser encontrada. <br>
     * 7. Al buscar una traducción de italiano a español previamente agregada ésta debe ser encontrada. <br>
     * 8. Al buscar una traducción de español a inglés que no exista se debe obtener null. <br>
     * 9. Al buscar una traducción de inglés a español que no exista se debe obtener null. <br>
     * 10. Al buscar una traducción de español a francés que no exista se debe obtener null. <br>
     * 11. Al buscar una traducción de francés a español que no exista se debe obtener null. <br>
     * 12. Al buscar una traducción de español a italiano que no exista se debe obtener null. <br>
     * 13. Al buscar una traducción de italiano a español que no exista se debe obtener null.
     * 
     */
    public void testAgregarTraduccion( )
    {
        // Configura los datos de prueba
        setupEscenario2( );

        // Agrega 3 palabras con traducción en inglés
        assertTrue( traductor.agregarTraduccion( "perro", "dog", Traductor.INGLES ) );
        assertTrue( traductor.agregarTraduccion( "blanco", "white", Traductor.INGLES ) );
        assertTrue( traductor.agregarTraduccion( "casa", "house", Traductor.INGLES ) );

        // Agrega 3 palabras con traducción en francés
        assertTrue( traductor.agregarTraduccion( "casa", "maison", Traductor.FRANCES ) );
        assertTrue( traductor.agregarTraduccion( "libro", "livre", Traductor.FRANCES ) );
        assertTrue( traductor.agregarTraduccion( "azul", "bleu", Traductor.FRANCES ) );

        // Agrega 3 palabras con traducción en italiano
        assertTrue( traductor.agregarTraduccion( "mesa", "tavlo", Traductor.ITALIANO ) );
        assertTrue( traductor.agregarTraduccion( "hoja", "foglia", Traductor.ITALIANO ) );
        assertTrue( traductor.agregarTraduccion( "revista", "rivista", Traductor.ITALIANO ) );

        // En cada diccionario deben haber 3 palabras con sus traducciones
        assertEquals( "No tiene el número de palabras esperado en inglés", 3, traductor.darTotalPalabrasTraducidas( Traductor.INGLES ) );
        assertEquals( "No tiene el número de palabras esperado en francés", 3, traductor.darTotalPalabrasTraducidas( Traductor.FRANCES ) );
        assertEquals( "No tiene el número de palabras esperado en italiano", 3, traductor.darTotalPalabrasTraducidas( Traductor.ITALIANO ) );

        // Realiza la búsqueda de traducciones de español a inglés
        Traduccion traduccion;
        traduccion = traductor.traducir( "blanco", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "white", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "perro", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "dog", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "house", traduccion.darTraduccion( ) );

        // Realiza la búsqueda de traducciones de inglés a español
        traduccion = traductor.traducir( "white", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "blanco", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "dog", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "perro", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "house", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "casa", traduccion.darPalabra( ) );

        // Realiza la búsqueda de traducciones de español a francés
        traduccion = traductor.traducir( "azul", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "bleu", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "libro", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "livre", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "maison", traduccion.darTraduccion( ) );

        // Realiza la búsqueda de traducciones de francés a español
        traduccion = traductor.traducir( "bleu", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La traducción no se agregó de forma correcta", "azul", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "livre", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La traducción no se agregó de forma correcta", "libro", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "maison", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La traducción no se agregó de forma correcta", "casa", traduccion.darPalabra( ) );

        // Realiza la búsqueda de traducciones de español a italiano
        traduccion = traductor.traducir( "mesa", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "tavlo", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "hoja", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "foglia", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "revista", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "rivista", traduccion.darTraduccion( ) );

        // Realiza la búsqueda de traducciones de italiano a español
        traduccion = traductor.traducir( "tavlo", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La traducción no se agregó de forma correcta", "mesa", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "foglia", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La traducción no se agregó de forma correcta", "hoja", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "rivista", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La traducción no se agregó de forma correcta", "revista", traduccion.darPalabra( ) );

        // Realiza la búsqueda de una traducción de español a inglés que no existe
        traduccion = traductor.traducir( "azul", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "La traducción no se agregó de forma correcta", traduccion );

        // Realiza la búsqueda de una traducción de inglés a español que no existe
        traduccion = traductor.traducir( "foglia", Traductor.INGLES, Traductor.ESPANOL );
        assertNull( "La traducción no se agregó de forma correcta", traduccion );

        // Realiza la búsqueda de una traducción de español a francés que no existe
        traduccion = traductor.traducir( "perro", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "La traducción no se agregó de forma correcta", traduccion );

        // Realiza la búsqueda de una traducción de francés a español que no existe
        traduccion = traductor.traducir( "tavlo", Traductor.FRANCES, Traductor.ESPANOL );
        assertNull( "La traducción no se agregó de forma correcta", traduccion );

        // Realiza la búsqueda de una traducción de español a italiano que no existe
        traduccion = traductor.traducir( "azul", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "La traducción no se agregó de forma correcta", traduccion );

        // Realiza la búsqueda de una traducción de italiano a español que no existe
        traduccion = traductor.traducir( "bleu", Traductor.ITALIANO, Traductor.ESPANOL );
        assertNull( "La traducción no se agregó de forma correcta", traduccion );
    }

    /**
     * Prueba que al adicionar una traducción de una palabra que ya existe esta no se pueda adicionar. <br>
     * <b> Métodos a probar: </b> <br>
     * agregarTraduccion, traducir, darTotalPalabrasTraducidas. <br>
     * <b> Objetivo: </b> Probar que el método agregarTraduccion no permite agregar palabras repetidas en español a sus diccionarios. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al agregar una palabra que ya exista, el número de traducciones en el diccionario respectivo debe mantenerse igual. <br>
     * 2. Al buscar la traducción de una palabra de español a inglés que se trató de adicionar de nuevo ésta debe ser encontrada. La traducción debe corresponder a la
     * traducción original de la palabra. <br>
     * 3. Al buscar la traducción de una palabra de inglés a español que se trató de adicionar de nuevo ésta debe ser encontrada. La traducción debe corresponder a la
     * traducción original de la palabra. <br>
     * 4. Al buscar la traducción de una palabra de español a francés que se trató de adicionar de nuevo ésta debe ser encontrada. La traducción debe corresponder a la
     * traducción original de la palabra. <br>
     * 5. Al buscar la traducción de una palabra de francés a español que se trató de adicionar de nuevo ésta debe ser encontrada. La traducción debe corresponder a la
     * traducción original de la palabra. <br>
     * 6. Al buscar la traducción de una palabra de español a italiano que se trató de adicionar de nuevo ésta debe ser encontrada. La traducción debe corresponder a la
     * traducción original de la palabra. <br>
     * 7. Al buscar la traducción de una palabra de italiano a español que se trató de adicionar de nuevo ésta debe ser encontrada. La traducción debe corresponder a la
     * traducción original de la palabra.
     */
    public void testAgregarTraduccionPalabraExistente( )
    {
        // Configura los datos de prueba
        setupEscenario1( );

        // Agrega 3 palabras con traducción en inglés que ya existan
        boolean agregada;
        agregada = traductor.agregarTraduccion( "perro", "dogs", Traductor.INGLES );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "blanco", "whites", Traductor.INGLES );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "casa", "houses", Traductor.INGLES );
        assertFalse( "La traducción no debió ser adicionada", agregada );

        // Agrega 3 palabras con traducción en francés que ya existan
        agregada = traductor.agregarTraduccion( "casa", "maisons", Traductor.FRANCES );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "libro", "livres", Traductor.FRANCES );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "azul", "bleus", Traductor.FRANCES );
        assertFalse( "La traducción no debió ser adicionada", agregada );

        // Agrega 3 palabras con traducción en italiano que ya existan
        agregada = traductor.agregarTraduccion( "mesa", "tavlos", Traductor.ITALIANO );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "hoja", "foglias", Traductor.ITALIANO );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "revista", "rivistas", Traductor.ITALIANO );
        assertFalse( "La traducción no debió ser adicionada", agregada );

        // Verifica el número de palabras en cada diccionario
        assertEquals( "No tiene el número de palabras esperado en inglés", 12, traductor.darTotalPalabrasTraducidas( Traductor.INGLES ) );
        assertEquals( "No tiene el número de palabras esperado en francés", 12, traductor.darTotalPalabrasTraducidas( Traductor.FRANCES ) );
        assertEquals( "No tiene el número de palabras esperado en italino", 12, traductor.darTotalPalabrasTraducidas( Traductor.ITALIANO ) );

        // Buscar traducciones de español a inglés
        Traduccion traduccion = traductor.traducir( "perro", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "perro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "dog", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "blanco", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "blanco", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "white", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "house", traduccion.darTraduccion( ) );

        // Buscar traducciones de inglés a español
        traduccion = traductor.traducir( "dog", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "perro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "dog", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "white", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "blanco", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "white", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "house", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "house", traduccion.darTraduccion( ) );

        // Buscar traducciones de español a francés
        traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "maison", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "libro", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "libro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "livre", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "azul", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "azul", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "bleu", traduccion.darTraduccion( ) );

        // Buscar traducciones de francés a español
        traduccion = traductor.traducir( "maison", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "maison", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "livre", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "libro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "livre", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "bleu", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "azul", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "bleu", traduccion.darTraduccion( ) );

        // Buscar traducciones de español a italiano
        traduccion = traductor.traducir( "mesa", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "mesa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "tavlo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "hoja", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "hoja", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "foglia", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "revista", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "revista", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "rivista", traduccion.darTraduccion( ) );

        // Buscar traducciones de italiano a español
        traduccion = traductor.traducir( "tavlo", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "mesa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "tavlo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "foglia", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "hoja", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "foglia", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rivista", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "revista", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "rivista", traduccion.darTraduccion( ) );
    }

    /**
     * Prueba que al tratar de adicionar una palabra cuya traducción ya este asociada con otra palabra no se permita la adición. <br>
     * <b> Métodos a probar: </b> <br>
     * agregarTraduccion, traducir, darTotalPalabrasTraducidas. <br>
     * <b> Objetivo: </b> Probar que el método agregarTraduccion no permite agregar traducciones repetidas a sus diccionarios. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al agregar una traducción que ya exista el número de traducciones en el diccionario respectivo debe mantenerse igual. <br>
     * 2. Al buscar la traducción de una palabra de español a inglés que se trató de adicionar con una traducción ya existente ésta no debe ser encontrada. La palabra con
     * dicha traducción no debió ser cambiada. <br>
     * 3. Al buscar la traducción de una palabra de español a francés que se trató de adicionar con una traducción ya existente ésta no debe ser encontrada. La palabra con
     * dicha traducción no debió ser cambiada. <br>
     * 4. Al buscar la traducción de una palabra de español a italiano que se trató de adicionar con una traducción ya existente ésta no debe ser encontrada. La palabra con
     * dicha traducción no debió ser cambiada. <br>
     * 5. Al buscar la traducción de una palabra de inglés a español que se trató de adicionar con una traducción ya existente ésta no debe ser encontrada. La palabra con
     * dicha traducción no debió ser cambiada. <br>
     * 6. Al buscar la traducción de una palabra de francés a español que se trató de adicionar con una traducción ya existente ésta no debe ser encontrada. La palabra con
     * dicha traducción no debió ser cambiada. <br>
     * 7. Al buscar la traducción de una palabra de italiano a español que se trató de adicionar con una traducción ya existente ésta no debe ser encontrada. La palabra con
     * dicha traducción no debió ser cambiada. <br>
     */
    public void testAgregarTraduccionExistente( )
    {
        // Configura los datos de prueba
        setupEscenario1( );

        // Agrega 3 palabras con una traducción en inglés que ya está asociada con otra palabra diferente
        boolean agregada;
        agregada = traductor.agregarTraduccion( "palabra1", "dog", Traductor.INGLES );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra2", "white", Traductor.INGLES );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra3", "house", Traductor.INGLES );
        assertFalse( "La traducción no debió ser adicionada", agregada );

        // Agrega 3 palabras con una traducción en francés que ya está asociada con otra palabra diferente
        agregada = traductor.agregarTraduccion( "palabra1", "maison", Traductor.FRANCES );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra2", "livre", Traductor.FRANCES );
        assertFalse( "La traducción no debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra3", "bleu", Traductor.FRANCES );
        assertFalse( "La traducción no debió ser adicionada", agregada );

        // Agrega 3 palabras con una traducción en italiano que ya está asociada con otra palabra diferente
        agregada = traductor.agregarTraduccion( "palabra1", "tavlo", Traductor.ITALIANO );
        assertFalse( "La traducción debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra2", "foglia", Traductor.ITALIANO );
        assertFalse( "La traducción debió ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra3", "rivista", Traductor.ITALIANO );
        assertFalse( "La traducción debió ser adicionada", agregada );

        // Verifica el número de palabras en cada diccionario
        assertEquals( "No tiene el número de palabras esperado en inglés", 12, traductor.darTotalPalabrasTraducidas( Traductor.INGLES ) );
        assertEquals( "No tiene el número de palabras esperado en francés", 12, traductor.darTotalPalabrasTraducidas( Traductor.FRANCES ) );
        assertEquals( "No tiene el número de palabras esperado en italino", 12, traductor.darTotalPalabrasTraducidas( Traductor.ITALIANO ) );

        // Buscar traducciones de español a inglés que no se debieron agregar
        Traduccion traduccion = traductor.traducir( "palabra1", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "La traducción no debio encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra2", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "La traducción no debio encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "La traducción no debio encontrarse", traduccion );

        // Buscar traducciones de inglés a español que no debieron ser alteradas por intento fallido de adición
        traduccion = traductor.traducir( "dog", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "perro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "dog", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "white", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "blanco", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "white", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "house", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "house", traduccion.darTraduccion( ) );

        // Buscar traducciones de español a francés que no se debieron agregar
        traduccion = traductor.traducir( "palabra1", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "La traducción no debió encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra2", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "La traducción no debió encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra3", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "La traducción no debio encontrarse", traduccion );

        // Buscar traducciones de francés a español que no debieron ser alteradas por intento fallido de adición
        traduccion = traductor.traducir( "maison", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "maison", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "livre", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "libro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "livre", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "bleu", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "azul", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "bleu", traduccion.darTraduccion( ) );

        // Buscar traducciones de español a italiano que no se debieron haber agregado
        traduccion = traductor.traducir( "palabra1", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "La traducción no debió encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra2", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "La traducción no debió encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra3", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "La traducción no debió encontrarse", traduccion );

        // Buscar traducciones de italiano a español que no debieron ser alteradas por intento fallido de adición
        traduccion = traductor.traducir( "tavlo", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "mesa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "tavlo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "foglia", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "hoja", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "foglia", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rivista", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "revista", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "rivista", traduccion.darTraduccion( ) );
    }

    /**
     * Revisa que el método traducir encuentre palabras que existen en el diccionario. <br>
     * <b> Métodos a probar: </b> <br>
     * traducir. <br>
     * <b> Objetivo: </b> Probar que el método traducir es capaz de encontrar correctamente la traducción de una palabra del español a cualquiera de los otros idiomas. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al buscar una traducción de español a inglés previamente agregada esta debe ser encontrada. La traducción y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 2. Al buscar una traducción de inglés a español previamente agregada esta debe ser encontrada. La traducción y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 3. Al buscar una traducción de español a francés previamente agregada esta debe ser encontrada. La traducción y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 4. Al buscar una traducción de francés a español previamente agregada esta debe ser encontrada. La traducción y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 5. Al buscar una traducción de español a italiano previamente agregada esta debe ser encontrada. La traducción y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 6. Al buscar una traducción de italiano a español previamente agregada esta debe ser encontrada. La traducción y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 7. Al buscar una traducción de español a inglés que no exista se debe obtener null. <br>
     * 8. Al buscar una traducción de inglés a español que no exista se debe obtener null. <br>
     * 9. Al buscar una traducción de español a francés que no exista se debe obtener null. <br>
     * 10. Al buscar una traducción de francés a español que no exista se debe obtener null. <br>
     * 11. Al buscar una traducción de español a italiano que no exista se debe obtener null. <br>
     * 12. Al buscar una traducción de italiano a español que no exista se debe obtener null. <br>
     * 13. Al buscar una traducción de inglés a italiano se debe obtener null. <br>
     * 14. Al buscar una traducción de inglés a francés se debe obtener null. <br>
     * 15. Al buscar una traducción de italiano a inglés se debe obtener null. <br>
     * 16. Al buscar una traducción de italiano a francés se debe obtener null. <br>
     * 17. Al buscar una traducción de francés a inglés se debe obtener null. <br>
     * 18. Al buscar una traducción de francés a italiano se debe obtener null. <br>
     */
    public void testTraducir1( )
    {
        // Configura los datos de prueba
        setupEscenario1( );

        // Realizar traducciones de español a inglés
        Traduccion traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "house", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "anillo", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "anillo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "ring", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "león", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "león", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "lion", traduccion.darTraduccion( ) );

        // Realizar traducciones de inglés a español
        traduccion = traductor.traducir( "sky", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "cielo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "sky", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "love", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "amor", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "love", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "garbage", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "basura", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "garbage", traduccion.darTraduccion( ) );

        // Realizar traducciones de español a francés
        traduccion = traductor.traducir( "bolso", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "bolso", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "sac", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rojo", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "rojo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "rouge", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "lasaña", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "lasaña", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "lasagne", traduccion.darTraduccion( ) );

        // Realizar traducciones de francés a español
        traduccion = traductor.traducir( "nourriture", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "comida", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "nourriture", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "profond", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "profundo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "profond", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "homme", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "hombre", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "homme", traduccion.darTraduccion( ) );

        // Realizar traducciones de español a italiano
        traduccion = traductor.traducir( "cable", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "cable", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "filo elettrico", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "ratón", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "ratón", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "topo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "cine", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "cine", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "cinema", traduccion.darTraduccion( ) );

        // Realizar traducciones de italiano a español
        traduccion = traductor.traducir( "coperchio", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "tapa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "coperchio", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "zio", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "tío", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "zio", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "bigletto", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original está mal", "billete", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "bigletto", traduccion.darTraduccion( ) );
    }

    /**
     * Revisa que el método traducir encuentre palabras que existen en el diccionario. <br>
     * <b> Métodos a probar: </b> <br>
     * traducir. <br>
     * <b> Objetivo: </b> Probar que el método traducir es capaz de encontrar correctamente la traducción de una palabra de un idioma distinto a español a cualquiera de los
     * otros idiomas. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al buscar una traducción de inglés a francés cuya traducciones español- inglés y español- francés han sido agregadas previamente deben ser encontradas. <br>
     * 2. Al buscar una traducción de inglés a italiano cuya traducciones español- inglés y español- italiano han sido agregadas previamente deben ser encontradas. <br>
     * 3. Al buscar una traducción de francés a inglés cuya traducciones español- francés y español- inglés han sido agregadas previamente deben ser encontradas. <br>
     * 4. Al buscar una traducción de francés a italiano cuya traducciones español- francés y español- italiano han sido agregadas previamente deben ser encontradas. <br>
     * 5. Al buscar una traducción de italiano a inglés cuya traducciones español- italiano y español- inglés han sido agregadas previamente deben ser encontradas. <br>
     * 6. Al buscar una traducción de italiano a francés cuya traducciones español- italiano y español- francés han sido agregadas previamente deben ser encontradas.
     */
    public void testTraducir2( )
    {
        // Configura los datos de prueba
        setupEscenario1( );

        // Realizar traducciones de inglés a francés
        Traduccion traduccion = traductor.traducir( "mouse", Traductor.INGLES, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "ratón", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "souris", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "pencil", Traductor.INGLES, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "lápiz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "crayon", traduccion.darTraduccion( ) );

        // Realizar traducciones de inglés a italiano
        traduccion = traductor.traducir( "mouse", Traductor.INGLES, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "ratón", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "topo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "pencil", Traductor.INGLES, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "lápiz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "rossetto", traduccion.darTraduccion( ) );

        // Realizar traducciones de francés a inglés
        traduccion = traductor.traducir( "souris", Traductor.FRANCES, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "ratón", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "mouse", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "crayon", Traductor.FRANCES, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "lápiz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "pencil", traduccion.darTraduccion( ) );

        // Realizar traducciones de francés a italiano
        traduccion = traductor.traducir( "souris", Traductor.FRANCES, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "ratón", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "topo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "crayon", Traductor.FRANCES, Traductor.ITALIANO );
        assertEquals( "La palabra original está mal", "lápiz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "rossetto", traduccion.darTraduccion( ) );

        // Realizar traducciones de italiano a inglés
        traduccion = traductor.traducir( "topo", Traductor.ITALIANO, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "ratón", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "mouse", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rossetto", Traductor.ITALIANO, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "lápiz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "pencil", traduccion.darTraduccion( ) );

        // Realizar traducciones de italiano a francés
        traduccion = traductor.traducir( "topo", Traductor.ITALIANO, Traductor.FRANCES );
        assertEquals( "La palabra original está mal", "ratón", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "souris", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rossetto", Traductor.ITALIANO, Traductor.INGLES );
        assertEquals( "La palabra original está mal", "lápiz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida está mal", "pencil", traduccion.darTraduccion( ) );
    }

    /**
     * Revisa que el método traducir NO encuentre palabras que NO existen en el diccionario. <br>
     * <b> Métodos a probar: </b> <br>
     * traducir. <br>
     * <b> Objetivo: </b> Probar que el método traducir no encuentra la traducción para palabras que no estén en el diccionario. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al buscar una traducción de español a inglés que no exista se debe obtener null. <br>
     * 2. Al buscar una traducción de inglés a español que no exista se debe obtener null. <br>
     * 3. Al buscar una traducción de español a francés que no exista se debe obtener null. <br>
     * 4. Al buscar una traducción de francés a español que no exista se debe obtener null. <br>
     * 5. Al buscar una traducción de español a italiano que no exista se debe obtener null. <br>
     * 6. Al buscar una traducción de italiano a español que no exista se debe obtener null. <br>
     */
    public void testTraducirError( )
    {
        setupEscenario1( );

        // Buscar una traducción de español a inglés que no exista
        Traduccion traduccion = traductor.traducir( "saco", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "No se debió encontrar la traducción", traduccion );

        // Buscar una traducción de inglés a español que no exista
        traduccion = traductor.traducir( "tree", Traductor.INGLES, Traductor.ESPANOL );
        assertNull( "No se debió encontrar la traducción", traduccion );

        // Buscar una traducción de español a francés que no exista
        traduccion = traductor.traducir( "vaso", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "No se debió encontrar la traducción", traduccion );

        // Buscar una traducción de francés a español que no exista
        traduccion = traductor.traducir( "verre", Traductor.FRANCES, Traductor.ESPANOL );
        assertNull( "No se debió encontrar la traducción", traduccion );

        // Buscar una traducción de español a italiano que no exista
        traduccion = traductor.traducir( "carpa", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "No se debió encontrar la traducción", traduccion );
    }
}