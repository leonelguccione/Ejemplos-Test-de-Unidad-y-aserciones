package invariante;

import org.junit.Assert;

/* Describimos los invariantes de Clase:
 * El contenido de las variables de clase dia y hora, deben cumplir en todo momento que:
 * dia>=1 y dia<=31
 * hora>=0 y hora<=24"
 */

public class Fecha
{

    private int dia = 1;
    private int hora = 0;

    public Fecha(int d, int h)
    { 
        // constructor
        /*El invariante de clase se debe garantizar al ingresar en cada método
        * publico de la clase y en cada constructor 
        * */
        Assert.assertTrue("Rango Erroneo Invariante de Clase Fecha",
                          (dia >= 1) && (dia <= 31) && (hora >= 0) && (hora <= 24));
        /* precondicion del constructor */
        Assert.assertTrue("Rango Erroneo Constructor Fecha", (d >= 1) && (d <= 31) && (h >= 0) && (h <= 24));
        dia = d;
        hora = h;
        /* postcondicion del Constructor */
        Assert.assertTrue("Error de Inicializaci[on Constructor Fecha", (dia == d) && (hora == h));
        /* Invariante de Clase se debe garantizar al salir de cada método
         * publico de la clase y en sus constructores 
        */
        Assert.assertTrue("Rango Erroneo Invariante de Clase Fecha",
                          (dia >= 1) && (dia <= 31) && (hora >= 0) && (hora <= 24));
    }

    /* establecemos las precondiciones y postcondiciones para setdia(int d)
     * Require: (d>=1) && (d<=31)
     * Ensures: (dia = d)
     */

    public void setdia(int d)
    {
        /*El invariante de clase se debe garantizar al ingresar en cada método
         * publico de la clase y en cada constructor */
        Assert.assertTrue("Rango Erroneo Invariante de Clase Fecha",
                          (dia >= 1) && (dia <= 31) && (hora >= 0) && (hora <= 24));
        /* Precondicion setdia */
        Assert.assertTrue("Rango Erroneo setdia", (d >= 1) && (d <= 31));
        dia = d;
        /* Postcondicion setdia */
        Assert.assertTrue("Error de Inicializacion setdia", (dia == d));
        /*Invariante de Clase se debe garantizar al salir de cada método
         * publico de la clase y en sus constructores */
        Assert.assertTrue("Rango Erroneo Invariante de Clase Fecha",
                          (dia >= 1) && (dia <= 31) && (hora >= 0) && (hora <= 24));
    }

    /* Establecemos precondiciones y postcondiciones para sethora()
     * Requires : (h>=0) && (h<=24)
     * Ensures : hora = h
     */
    public void sethora(int h)
    {
        /*El invariante de clase se debe garantizar al ingresar en cada método
         * publico de la clase y en cada constructor */
        Assert.assertTrue("Rango Erroneo Invariante de Clase Fecha",
                          (dia >= 1) && (dia <= 31) && (hora >= 0) && (hora <= 24));
        /*Precondicion sethora*/
        Assert.assertTrue("Rango Erroneo", (h >= 0) && (h <= 24));
        hora = h;
        /*Postcondicion sethora*/
        Assert.assertTrue("Error de Inicializacion set hora", (hora == h));
        /*Invariante de Clase se debe garantizar al salir de cada método
         * publico de la clase y en sus constructores */
        Assert.assertTrue("Rango Erroneo Invariante de Clase Fecha",
                          (dia >= 1) && (dia <= 31) && (hora >= 0) && (hora <= 24));

    }

    public int getdia()
    {
        /*El invariante de clase se debe garantizar al ingresar en cada método
         * publico de la clase y en cada constructor */
        Assert.assertTrue("Rango Erroneo Invariante de Clase Fecha",
                          (dia >= 1) && (dia <= 31) && (hora >= 0) && (hora <= 24));
        return dia;
    }

    public int gethora()
    {
        /*El invariante de clase se debe garantizar al ingresar en cada método
          * publico de la clase y en cada constructor */
        Assert.assertTrue("Rango Erroneo Invariante de Clase Fecha",
                          (dia >= 1) && (dia <= 31) && (hora >= 0) && (hora <= 24));
        return hora;
    }
}

