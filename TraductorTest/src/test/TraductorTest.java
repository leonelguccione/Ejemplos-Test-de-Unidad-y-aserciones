/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id: TraductorTest.java,v 1.8 2006/08/08 13:33:07 da-romer Exp $
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n7_traductor
 * Autor: Daniel Francisco Romero - 27-jun-2006
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package test;

import junit.framework.TestCase;

import mundo.Traduccion;
import mundo.Traductor;

/**
 * Esta es la clase usada para verificar que los métodos de la clase Traductor están correctamente implementados
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
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Crea al traductor con 12 traducciones de cada idioma
     */
    private void setupEscenario1( )
    {
        traductor = new Traductor( );

        // Agrega 12 palabras con traducci�n en ingl�s
        traductor.agregarTraduccion( "perro", "dog", Traductor.INGLES );
        traductor.agregarTraduccion( "blanco", "white", Traductor.INGLES );
        traductor.agregarTraduccion( "casa", "house", Traductor.INGLES );
        traductor.agregarTraduccion( "cielo", "sky", Traductor.INGLES );
        traductor.agregarTraduccion( "amor", "love", Traductor.INGLES );
        traductor.agregarTraduccion( "anillo", "ring", Traductor.INGLES );
        traductor.agregarTraduccion( "torre", "tower", Traductor.INGLES );
        traductor.agregarTraduccion( "le�n", "lion", Traductor.INGLES );
        traductor.agregarTraduccion( "basura", "garbage", Traductor.INGLES );
        traductor.agregarTraduccion( "bello", "beautiful", Traductor.INGLES );
        traductor.agregarTraduccion( "rat�n", "mouse", Traductor.INGLES );
        traductor.agregarTraduccion( "l�piz", "pencil", Traductor.INGLES );

        // Agrega 12 palabras con traducci�n en franc�s
        traductor.agregarTraduccion( "casa", "maison", Traductor.FRANCES );
        traductor.agregarTraduccion( "libro", "livre", Traductor.FRANCES );
        traductor.agregarTraduccion( "azul", "bleu", Traductor.FRANCES );
        traductor.agregarTraduccion( "comida", "nourriture", Traductor.FRANCES );
        traductor.agregarTraduccion( "hombre", "homme", Traductor.FRANCES );
        traductor.agregarTraduccion( "rojo", "rouge", Traductor.FRANCES );
        traductor.agregarTraduccion( "bolso", "sac", Traductor.FRANCES );
        traductor.agregarTraduccion( "lasa�a", "lasagne", Traductor.FRANCES );
        traductor.agregarTraduccion( "profundo", "profond", Traductor.FRANCES );
        traductor.agregarTraduccion( "deber", "devoir", Traductor.FRANCES );
        traductor.agregarTraduccion( "rat�n", "souris", Traductor.FRANCES );
        traductor.agregarTraduccion( "l�piz", "crayon", Traductor.FRANCES );

        // Agrega 12 palabras con traducci�n en italiano
        traductor.agregarTraduccion( "mesa", "tavlo", Traductor.ITALIANO );
        traductor.agregarTraduccion( "hoja", "foglia", Traductor.ITALIANO );
        traductor.agregarTraduccion( "revista", "rivista", Traductor.ITALIANO );
        traductor.agregarTraduccion( "pasta", "pasta", Traductor.ITALIANO );
        traductor.agregarTraduccion( "rat�n", "topo", Traductor.ITALIANO );
        traductor.agregarTraduccion( "billete", "bigletto", Traductor.ITALIANO );
        traductor.agregarTraduccion( "cable", "filo elettrico", Traductor.ITALIANO );
        traductor.agregarTraduccion( "tapa", "coperchio", Traductor.ITALIANO );
        traductor.agregarTraduccion( "cine", "cinema", Traductor.ITALIANO );
        traductor.agregarTraduccion( "t�o", "zio", Traductor.ITALIANO );
        traductor.agregarTraduccion( "l�piz", "rossetto", Traductor.ITALIANO );
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
     * Prueba la adici�n correcta de traducciones. <br>
     * <b> M�todos a probar: </b> <br>
     * agregarTraduccion, traducir, darTotalPalabrasTraducidas. <br>
     * <b> Objetivo: </b> Probar que el método agregarTraduccion es capaz de agregar palabras y traducciones v�lidas a cualquiera de los diccionarios. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al agregar una traducci�n se debe incrementar el n�mero de traducciones en el diccionario respectivo. <br>
     * 2. Al buscar una traducci�n de espa�ol a ingl�s previamente agregada �sta debe ser encontrada. <br>
     * 3. Al buscar una traducci�n de ingl�s a espa�ol previamente agregada �sta debe ser encontrada. <br>
     * 4. Al buscar una traducci�n de espa�ol a franc�s previamente agregada �sta debe ser encontrada. <br>
     * 5. Al buscar una traducci�n de franc�s a espa�ol previamente agregada �sta debe ser encontrada. <br>
     * 6. Al buscar una traducci�n de espa�ol a italiano previamente agregada �sta debe ser encontrada. <br>
     * 7. Al buscar una traducci�n de italiano a espa�ol previamente agregada �sta debe ser encontrada. <br>
     * 8. Al buscar una traducci�n de espa�ol a ingl�s que no exista se debe obtener null. <br>
     * 9. Al buscar una traducci�n de ingl�s a espa�ol que no exista se debe obtener null. <br>
     * 10. Al buscar una traducci�n de espa�ol a franc�s que no exista se debe obtener null. <br>
     * 11. Al buscar una traducci�n de franc�s a espa�ol que no exista se debe obtener null. <br>
     * 12. Al buscar una traducci�n de espa�ol a italiano que no exista se debe obtener null. <br>
     * 13. Al buscar una traducci�n de italiano a espa�ol que no exista se debe obtener null.
     * 
     */
    public void testAgregarTraduccion( )
    {
        // Configura los datos de prueba
        setupEscenario2( );

        // Agrega 3 palabras con traducci�n en ingl�s
        assertTrue( traductor.agregarTraduccion( "perro", "dog", Traductor.INGLES ) );
        assertTrue( traductor.agregarTraduccion( "blanco", "white", Traductor.INGLES ) );
        assertTrue( traductor.agregarTraduccion( "casa", "house", Traductor.INGLES ) );

        // Agrega 3 palabras con traducci�n en franc�s
        assertTrue( traductor.agregarTraduccion( "casa", "maison", Traductor.FRANCES ) );
        assertTrue( traductor.agregarTraduccion( "libro", "livre", Traductor.FRANCES ) );
        assertTrue( traductor.agregarTraduccion( "azul", "bleu", Traductor.FRANCES ) );

        // Agrega 3 palabras con traducci�n en italiano
        assertTrue( traductor.agregarTraduccion( "mesa", "tavlo", Traductor.ITALIANO ) );
        assertTrue( traductor.agregarTraduccion( "hoja", "foglia", Traductor.ITALIANO ) );
        assertTrue( traductor.agregarTraduccion( "revista", "rivista", Traductor.ITALIANO ) );

        // En cada diccionario deben haber 3 palabras con sus traducciones
        assertEquals( "No tiene el n�mero de palabras esperado en ingl�s", 3, traductor.darTotalPalabrasTraducidas( Traductor.INGLES ) );
        assertEquals( "No tiene el n�mero de palabras esperado en franc�s", 3, traductor.darTotalPalabrasTraducidas( Traductor.FRANCES ) );
        assertEquals( "No tiene el n�mero de palabras esperado en italiano", 3, traductor.darTotalPalabrasTraducidas( Traductor.ITALIANO ) );

        // Realiza la b�squeda de traducciones de espa�ol a ingl�s
        Traduccion traduccion;
        traduccion = traductor.traducir( "blanco", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "white", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "perro", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "dog", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "house", traduccion.darTraduccion( ) );

        // Realiza la b�squeda de traducciones de ingl�s a espa�ol
        traduccion = traductor.traducir( "white", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "blanco", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "dog", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "perro", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "house", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "casa", traduccion.darPalabra( ) );

        // Realiza la b�squeda de traducciones de espa�ol a franc�s
        traduccion = traductor.traducir( "azul", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "bleu", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "libro", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "livre", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "maison", traduccion.darTraduccion( ) );

        // Realiza la b�squeda de traducciones de franc�s a espa�ol
        traduccion = traductor.traducir( "bleu", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La traducci�n no se agreg� de forma correcta", "azul", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "livre", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La traducci�n no se agreg� de forma correcta", "libro", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "maison", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La traducci�n no se agreg� de forma correcta", "casa", traduccion.darPalabra( ) );

        // Realiza la b�squeda de traducciones de espa�ol a italiano
        traduccion = traductor.traducir( "mesa", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "tavlo", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "hoja", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "foglia", traduccion.darTraduccion( ) );
        traduccion = traductor.traducir( "revista", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "rivista", traduccion.darTraduccion( ) );

        // Realiza la b�squeda de traducciones de italiano a espa�ol
        traduccion = traductor.traducir( "tavlo", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La traducci�n no se agreg� de forma correcta", "mesa", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "foglia", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La traducci�n no se agreg� de forma correcta", "hoja", traduccion.darPalabra( ) );
        traduccion = traductor.traducir( "rivista", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La traducci�n no se agreg� de forma correcta", "revista", traduccion.darPalabra( ) );

        // Realiza la b�squeda de una traducci�n de espa�ol a ingl�s que no existe
        traduccion = traductor.traducir( "azul", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "La traducci�n no se agreg� de forma correcta", traduccion );

        // Realiza la b�squeda de una traducci�n de ingl�s a espa�ol que no existe
        traduccion = traductor.traducir( "foglia", Traductor.INGLES, Traductor.ESPANOL );
        assertNull( "La traducci�n no se agreg� de forma correcta", traduccion );

        // Realiza la b�squeda de una traducci�n de espa�ol a franc�s que no existe
        traduccion = traductor.traducir( "perro", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "La traducci�n no se agreg� de forma correcta", traduccion );

        // Realiza la b�squeda de una traducci�n de franc�s a espa�ol que no existe
        traduccion = traductor.traducir( "tavlo", Traductor.FRANCES, Traductor.ESPANOL );
        assertNull( "La traducci�n no se agreg� de forma correcta", traduccion );

        // Realiza la b�squeda de una traducci�n de espa�ol a italiano que no existe
        traduccion = traductor.traducir( "azul", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "La traducci�n no se agreg� de forma correcta", traduccion );

        // Realiza la b�squeda de una traducci�n de italiano a espa�ol que no existe
        traduccion = traductor.traducir( "bleu", Traductor.ITALIANO, Traductor.ESPANOL );
        assertNull( "La traducci�n no se agreg� de forma correcta", traduccion );
    }

    /**
     * Prueba que al adicionar una traducci�n de una palabra que ya existe esta no se pueda adicionar. <br>
     * <b> M�todos a probar: </b> <br>
     * agregarTraduccion, traducir, darTotalPalabrasTraducidas. <br>
     * <b> Objetivo: </b> Probar que el m�todo agregarTraduccion no permite agregar palabras repetidas en espa�ol a sus diccionarios. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al agregar una palabra que ya exista, el n�mero de traducciones en el diccionario respectivo debe mantenerse igual. <br>
     * 2. Al buscar la traducci�n de una palabra de espa�ol a ingl�s que se trat� de adicionar de nuevo �sta debe ser encontrada. La traducci�n debe corresponder a la
     * traducci�n original de la palabra. <br>
     * 3. Al buscar la traducci�n de una palabra de ingl�s a espa�ol que se trat� de adicionar de nuevo �sta debe ser encontrada. La traducci�n debe corresponder a la
     * traducci�n original de la palabra. <br>
     * 4. Al buscar la traducci�n de una palabra de espa�ol a franc�s que se trat� de adicionar de nuevo �sta debe ser encontrada. La traducci�n debe corresponder a la
     * traducci�n original de la palabra. <br>
     * 5. Al buscar la traducci�n de una palabra de franc�s a espa�ol que se trat� de adicionar de nuevo �sta debe ser encontrada. La traducci�n debe corresponder a la
     * traducci�n original de la palabra. <br>
     * 6. Al buscar la traducci�n de una palabra de espa�ol a italiano que se trat� de adicionar de nuevo �sta debe ser encontrada. La traducci�n debe corresponder a la
     * traducci�n original de la palabra. <br>
     * 7. Al buscar la traducci�n de una palabra de italiano a espa�ol que se trat� de adicionar de nuevo �sta debe ser encontrada. La traducci�n debe corresponder a la
     * traducci�n original de la palabra.
     */
    public void testAgregarTraduccionPalabraExistente( )
    {
        // Configura los datos de prueba
        setupEscenario1( );

        // Agrega 3 palabras con traducci�n en ingl�s que ya existan
        boolean agregada;
        agregada = traductor.agregarTraduccion( "perro", "dogs", Traductor.INGLES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "blanco", "whites", Traductor.INGLES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "casa", "houses", Traductor.INGLES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );

        // Agrega 3 palabras con traducci�n en franc�s que ya existan
        agregada = traductor.agregarTraduccion( "casa", "maisons", Traductor.FRANCES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "libro", "livres", Traductor.FRANCES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "azul", "bleus", Traductor.FRANCES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );

        // Agrega 3 palabras con traducci�n en italiano que ya existan
        agregada = traductor.agregarTraduccion( "mesa", "tavlos", Traductor.ITALIANO );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "hoja", "foglias", Traductor.ITALIANO );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "revista", "rivistas", Traductor.ITALIANO );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );

        // Verifica el n�mero de palabras en cada diccionario
        assertEquals( "No tiene el n�mero de palabras esperado en ingl�s", 12, traductor.darTotalPalabrasTraducidas( Traductor.INGLES ) );
        assertEquals( "No tiene el n�mero de palabras esperado en franc�s", 12, traductor.darTotalPalabrasTraducidas( Traductor.FRANCES ) );
        assertEquals( "No tiene el n�mero de palabras esperado en italino", 12, traductor.darTotalPalabrasTraducidas( Traductor.ITALIANO ) );

        // Buscar traducciones de espa�ol a ingl�s
        Traduccion traduccion = traductor.traducir( "perro", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "perro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "dog", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "blanco", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "blanco", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "white", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "house", traduccion.darTraduccion( ) );

        // Buscar traducciones de ingl�s a espa�ol
        traduccion = traductor.traducir( "dog", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "perro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "dog", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "white", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "blanco", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "white", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "house", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "house", traduccion.darTraduccion( ) );

        // Buscar traducciones de espa�ol a franc�s
        traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "maison", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "libro", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "libro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "livre", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "azul", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "azul", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "bleu", traduccion.darTraduccion( ) );

        // Buscar traducciones de franc�s a espa�ol
        traduccion = traductor.traducir( "maison", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "maison", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "livre", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "libro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "livre", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "bleu", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "azul", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "bleu", traduccion.darTraduccion( ) );

        // Buscar traducciones de espa�ol a italiano
        traduccion = traductor.traducir( "mesa", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "mesa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "tavlo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "hoja", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "hoja", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "foglia", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "revista", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "revista", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "rivista", traduccion.darTraduccion( ) );

        // Buscar traducciones de italiano a espa�ol
        traduccion = traductor.traducir( "tavlo", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "mesa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "tavlo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "foglia", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "hoja", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "foglia", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rivista", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "revista", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "rivista", traduccion.darTraduccion( ) );
    }

    /**
     * Prueba que al tratar de adicionar una palabra cuya traducci�n ya este asociada con otra palabra no se permita la adici�n. <br>
     * <b> M�todos a probar: </b> <br>
     * agregarTraduccion, traducir, darTotalPalabrasTraducidas. <br>
     * <b> Objetivo: </b> Probar que el m�todo agregarTraduccion no permite agregar traducciones repetidas a sus diccionarios. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al agregar una traducci�n que ya exista el n�mero de traducciones en el diccionario respectivo debe mantenerse igual. <br>
     * 2. Al buscar la traducci�n de una palabra de espa�ol a ingl�s que se trat� de adicionar con una traducci�n ya existente �sta no debe ser encontrada. La palabra con
     * dicha traducci�n no debi� ser cambiada. <br>
     * 3. Al buscar la traducci�n de una palabra de espa�ol a franc�s que se trat� de adicionar con una traducci�n ya existente �sta no debe ser encontrada. La palabra con
     * dicha traducci�n no debi� ser cambiada. <br>
     * 4. Al buscar la traducci�n de una palabra de espa�ol a italiano que se trat� de adicionar con una traducci�n ya existente �sta no debe ser encontrada. La palabra con
     * dicha traducci�n no debi� ser cambiada. <br>
     * 5. Al buscar la traducci�n de una palabra de ingl�s a espa�ol que se trat� de adicionar con una traducci�n ya existente �sta no debe ser encontrada. La palabra con
     * dicha traducci�n no debi� ser cambiada. <br>
     * 6. Al buscar la traducci�n de una palabra de franc�s a espa�ol que se trat� de adicionar con una traducci�n ya existente �sta no debe ser encontrada. La palabra con
     * dicha traducci�n no debi� ser cambiada. <br>
     * 7. Al buscar la traducci�n de una palabra de italiano a espa�ol que se trat� de adicionar con una traducci�n ya existente �sta no debe ser encontrada. La palabra con
     * dicha traducci�n no debi� ser cambiada. <br>
     */
    public void testAgregarTraduccionExistente( )
    {
        // Configura los datos de prueba
        setupEscenario1( );

        // Agrega 3 palabras con una traducci�n en ingl�s que ya est� asociada con otra palabra diferente
        boolean agregada;
        agregada = traductor.agregarTraduccion( "palabra1", "dog", Traductor.INGLES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra2", "white", Traductor.INGLES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra3", "house", Traductor.INGLES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );

        // Agrega 3 palabras con una traducci�n en franc�s que ya est� asociada con otra palabra diferente
        agregada = traductor.agregarTraduccion( "palabra1", "maison", Traductor.FRANCES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra2", "livre", Traductor.FRANCES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra3", "bleu", Traductor.FRANCES );
        assertFalse( "La traducci�n no debi� ser adicionada", agregada );

        // Agrega 3 palabras con una traducci�n en italiano que ya est� asociada con otra palabra diferente
        agregada = traductor.agregarTraduccion( "palabra1", "tavlo", Traductor.ITALIANO );
        assertFalse( "La traducci�n debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra2", "foglia", Traductor.ITALIANO );
        assertFalse( "La traducci�n debi� ser adicionada", agregada );
        agregada = traductor.agregarTraduccion( "palabra3", "rivista", Traductor.ITALIANO );
        assertFalse( "La traducci�n debi� ser adicionada", agregada );

        // Verifica el n�mero de palabras en cada diccionario
        assertEquals( "No tiene el n�mero de palabras esperado en ingl�s", 12, traductor.darTotalPalabrasTraducidas( Traductor.INGLES ) );
        assertEquals( "No tiene el n�mero de palabras esperado en franc�s", 12, traductor.darTotalPalabrasTraducidas( Traductor.FRANCES ) );
        assertEquals( "No tiene el n�mero de palabras esperado en italino", 12, traductor.darTotalPalabrasTraducidas( Traductor.ITALIANO ) );

        // Buscar traducciones de espa�ol a ingl�s que no se debieron agregar
        Traduccion traduccion = traductor.traducir( "palabra1", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "La traducci�n no debio encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra2", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "La traducci�n no debio encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "La traducci�n no debio encontrarse", traduccion );

        // Buscar traducciones de ingl�s a espa�ol que no debieron ser alteradas por intento fallido de adici�n
        traduccion = traductor.traducir( "dog", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "perro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "dog", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "white", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "blanco", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "white", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "house", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "house", traduccion.darTraduccion( ) );

        // Buscar traducciones de espa�ol a franc�s que no se debieron agregar
        traduccion = traductor.traducir( "palabra1", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "La traducci�n no debi� encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra2", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "La traducci�n no debi� encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra3", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "La traducci�n no debio encontrarse", traduccion );

        // Buscar traducciones de franc�s a espa�ol que no debieron ser alteradas por intento fallido de adici�n
        traduccion = traductor.traducir( "maison", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "maison", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "livre", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "libro", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "livre", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "bleu", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "azul", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "bleu", traduccion.darTraduccion( ) );

        // Buscar traducciones de espa�ol a italiano que no se debieron haber agregado
        traduccion = traductor.traducir( "palabra1", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "La traducci�n no debi� encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra2", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "La traducci�n no debi� encontrarse", traduccion );

        traduccion = traductor.traducir( "palabra3", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "La traducci�n no debi� encontrarse", traduccion );

        // Buscar traducciones de italiano a espa�ol que no debieron ser alteradas por intento fallido de adici�n
        traduccion = traductor.traducir( "tavlo", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "mesa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "tavlo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "foglia", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "hoja", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "foglia", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rivista", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "revista", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "rivista", traduccion.darTraduccion( ) );
    }

    /**
     * Revisa que el m�todo traducir encuentre palabras que existen en el diccionario. <br>
     * <b> M�todos a probar: </b> <br>
     * traducir. <br>
     * <b> Objetivo: </b> Probar que el m�todo traducir es capaz de encontrar correctamente la traducci�n de una palabra del espa�ol a cualquiera de los otros idiomas. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al buscar una traducci�n de espa�ol a ingl�s previamente agregada esta debe ser encontrada. La traducci�n y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 2. Al buscar una traducci�n de ingl�s a espa�ol previamente agregada esta debe ser encontrada. La traducci�n y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 3. Al buscar una traducci�n de espa�ol a franc�s previamente agregada esta debe ser encontrada. La traducci�n y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 4. Al buscar una traducci�n de franc�s a espa�ol previamente agregada esta debe ser encontrada. La traducci�n y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 5. Al buscar una traducci�n de espa�ol a italiano previamente agregada esta debe ser encontrada. La traducci�n y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 6. Al buscar una traducci�n de italiano a espa�ol previamente agregada esta debe ser encontrada. La traducci�n y la palabra deben corresponder a las adicionadas
     * originalmente. <br>
     * 7. Al buscar una traducci�n de espa�ol a ingl�s que no exista se debe obtener null. <br>
     * 8. Al buscar una traducci�n de ingl�s a espa�ol que no exista se debe obtener null. <br>
     * 9. Al buscar una traducci�n de espa�ol a franc�s que no exista se debe obtener null. <br>
     * 10. Al buscar una traducci�n de franc�s a espa�ol que no exista se debe obtener null. <br>
     * 11. Al buscar una traducci�n de espa�ol a italiano que no exista se debe obtener null. <br>
     * 12. Al buscar una traducci�n de italiano a espa�ol que no exista se debe obtener null. <br>
     * 13. Al buscar una traducci�n de ingl�s a italiano se debe obtener null. <br>
     * 14. Al buscar una traducci�n de ingl�s a franc�s se debe obtener null. <br>
     * 15. Al buscar una traducci�n de italiano a ingl�s se debe obtener null. <br>
     * 16. Al buscar una traducci�n de italiano a franc�s se debe obtener null. <br>
     * 17. Al buscar una traducci�n de franc�s a ingl�s se debe obtener null. <br>
     * 18. Al buscar una traducci�n de franc�s a italiano se debe obtener null. <br>
     */
    public void testTraducir1( )
    {
        // Configura los datos de prueba
        setupEscenario1( );

        // Realizar traducciones de espa�ol a ingl�s
        Traduccion traduccion = traductor.traducir( "casa", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "casa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "house", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "anillo", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "anillo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "ring", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "le�n", Traductor.ESPANOL, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "le�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "lion", traduccion.darTraduccion( ) );

        // Realizar traducciones de ingl�s a espa�ol
        traduccion = traductor.traducir( "sky", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "cielo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "sky", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "love", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "amor", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "love", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "garbage", Traductor.INGLES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "basura", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "garbage", traduccion.darTraduccion( ) );

        // Realizar traducciones de espa�ol a franc�s
        traduccion = traductor.traducir( "bolso", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "bolso", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "sac", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rojo", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "rojo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "rouge", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "lasa�a", Traductor.ESPANOL, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "lasa�a", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "lasagne", traduccion.darTraduccion( ) );

        // Realizar traducciones de franc�s a espa�ol
        traduccion = traductor.traducir( "nourriture", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "comida", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "nourriture", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "profond", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "profundo", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "profond", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "homme", Traductor.FRANCES, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "hombre", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "homme", traduccion.darTraduccion( ) );

        // Realizar traducciones de espa�ol a italiano
        traduccion = traductor.traducir( "cable", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "cable", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "filo elettrico", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rat�n", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "rat�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "topo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "cine", Traductor.ESPANOL, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "cine", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "cinema", traduccion.darTraduccion( ) );

        // Realizar traducciones de italiano a espa�ol
        traduccion = traductor.traducir( "coperchio", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "tapa", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "coperchio", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "zio", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "t�o", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "zio", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "bigletto", Traductor.ITALIANO, Traductor.ESPANOL );
        assertEquals( "La palabra original est� mal", "billete", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "bigletto", traduccion.darTraduccion( ) );
    }

    /**
     * Revisa que el m�todo traducir encuentre palabras que existen en el diccionario. <br>
     * <b> M�todos a probar: </b> <br>
     * traducir. <br>
     * <b> Objetivo: </b> Probar que el m�todo traducir es capaz de encontrar correctamente la traducci�n de una palabra de un idioma distinto a espa�ol a cualquiera de los
     * otros idiomas. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al buscar una traducci�n de ingl�s a franc�s cuya traducciones espa�ol- ingl�s y espa�ol- franc�s han sido agregadas previamente deben ser encontradas. <br>
     * 2. Al buscar una traducci�n de ingl�s a italiano cuya traducciones espa�ol- ingl�s y espa�ol- italiano han sido agregadas previamente deben ser encontradas. <br>
     * 3. Al buscar una traducci�n de franc�s a ingl�s cuya traducciones espa�ol- franc�s y espa�ol- ingl�s han sido agregadas previamente deben ser encontradas. <br>
     * 4. Al buscar una traducci�n de franc�s a italiano cuya traducciones espa�ol- franc�s y espa�ol- italiano han sido agregadas previamente deben ser encontradas. <br>
     * 5. Al buscar una traducci�n de italiano a ingl�s cuya traducciones espa�ol- italiano y espa�ol- ingl�s han sido agregadas previamente deben ser encontradas. <br>
     * 6. Al buscar una traducci�n de italiano a franc�s cuya traducciones espa�ol- italiano y espa�ol- franc�s han sido agregadas previamente deben ser encontradas.
     */
    public void testTraducir2( )
    {
        // Configura los datos de prueba
        setupEscenario1( );

        // Realizar traducciones de ingl�s a franc�s
        Traduccion traduccion = traductor.traducir( "mouse", Traductor.INGLES, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "rat�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "souris", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "pencil", Traductor.INGLES, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "l�piz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "crayon", traduccion.darTraduccion( ) );

        // Realizar traducciones de ingl�s a italiano
        traduccion = traductor.traducir( "mouse", Traductor.INGLES, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "rat�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "topo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "pencil", Traductor.INGLES, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "l�piz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "rossetto", traduccion.darTraduccion( ) );

        // Realizar traducciones de franc�s a ingl�s
        traduccion = traductor.traducir( "souris", Traductor.FRANCES, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "rat�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "mouse", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "crayon", Traductor.FRANCES, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "l�piz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "pencil", traduccion.darTraduccion( ) );

        // Realizar traducciones de franc�s a italiano
        traduccion = traductor.traducir( "souris", Traductor.FRANCES, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "rat�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "topo", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "crayon", Traductor.FRANCES, Traductor.ITALIANO );
        assertEquals( "La palabra original est� mal", "l�piz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "rossetto", traduccion.darTraduccion( ) );

        // Realizar traducciones de italiano a ingl�s
        traduccion = traductor.traducir( "topo", Traductor.ITALIANO, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "rat�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "mouse", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rossetto", Traductor.ITALIANO, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "l�piz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "pencil", traduccion.darTraduccion( ) );

        // Realizar traducciones de italiano a franc�s
        traduccion = traductor.traducir( "topo", Traductor.ITALIANO, Traductor.FRANCES );
        assertEquals( "La palabra original est� mal", "rat�n", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "souris", traduccion.darTraduccion( ) );

        traduccion = traductor.traducir( "rossetto", Traductor.ITALIANO, Traductor.INGLES );
        assertEquals( "La palabra original est� mal", "l�piz", traduccion.darPalabra( ) );
        assertEquals( "La palabra traducida est� mal", "pencil", traduccion.darTraduccion( ) );
    }

    /**
     * Revisa que el m�todo traducir NO encuentre palabras que NO existen en el diccionario. <br>
     * <b> M�todos a probar: </b> <br>
     * traducir. <br>
     * <b> Objetivo: </b> Probar que el m�todo traducir no encuentra la traducci�n para palabras que no est�n en el diccionario. <br>
     * <b> Resultados esperados: </b> <br>
     * 1. Al buscar una traducci�n de espa�ol a ingl�s que no exista se debe obtener null. <br>
     * 2. Al buscar una traducci�n de ingl�s a espa�ol que no exista se debe obtener null. <br>
     * 3. Al buscar una traducci�n de espa�ol a franc�s que no exista se debe obtener null. <br>
     * 4. Al buscar una traducci�n de franc�s a espa�ol que no exista se debe obtener null. <br>
     * 5. Al buscar una traducci�n de espa�ol a italiano que no exista se debe obtener null. <br>
     * 6. Al buscar una traducci�n de italiano a espa�ol que no exista se debe obtener null. <br>
     */
    public void testTraducirError( )
    {
        setupEscenario1( );

        // Buscar una traducci�n de espa�ol a ingl�s que no exista
        Traduccion traduccion = traductor.traducir( "saco", Traductor.ESPANOL, Traductor.INGLES );
        assertNull( "No se debi� encontrar la traducci�n", traduccion );

        // Buscar una traducci�n de ingl�s a espa�ol que no exista
        traduccion = traductor.traducir( "tree", Traductor.INGLES, Traductor.ESPANOL );
        assertNull( "No se debi� encontrar la traducci�n", traduccion );

        // Buscar una traducci�n de espa�ol a franc�s que no exista
        traduccion = traductor.traducir( "vaso", Traductor.ESPANOL, Traductor.FRANCES );
        assertNull( "No se debi� encontrar la traducci�n", traduccion );

        // Buscar una traducci�n de franc�s a espa�ol que no exista
        traduccion = traductor.traducir( "verre", Traductor.FRANCES, Traductor.ESPANOL );
        assertNull( "No se debi� encontrar la traducci�n", traduccion );

        // Buscar una traducci�n de espa�ol a italiano que no exista
        traduccion = traductor.traducir( "carpa", Traductor.ESPANOL, Traductor.ITALIANO );
        assertNull( "No se debi� encontrar la traducci�n", traduccion );
    }
}