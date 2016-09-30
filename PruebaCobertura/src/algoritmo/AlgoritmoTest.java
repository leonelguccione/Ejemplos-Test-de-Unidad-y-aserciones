package algoritmo;

import org.junit.Test;

public class AlgoritmoTest
{
    private Algoritmo algoritmo;
    
    public AlgoritmoTest()
    {
    }
    
    private void setupEscenario1( )
    {
        algoritmo = new Algoritmo(11,0,0);
    }

    private void setupEscenario2( )
    {
        algoritmo = new Algoritmo(10,20,0);
    }
    
    /**
     * @see Algoritmo#algoritmo(int,int,int)
     */
    @Test
    public void testCamino1()
    {
        setupEscenario1();
        algoritmo.algoritmo();
        //fail("Unimplemented");
    }
    
    @Test
    public void testCamino2()
    {
    	setupEscenario2();
    	algoritmo.algoritmo();
    }
}
