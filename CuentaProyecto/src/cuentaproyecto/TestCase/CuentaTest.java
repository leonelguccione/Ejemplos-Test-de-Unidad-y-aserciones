package cuentaproyecto.TestCase;

import cuentaproyecto.Cuenta;
import cuentaproyecto.Persona;

import junit.framework.TestCase;

public class CuentaTest extends TestCase
{
    private Cuenta cuenta;

    @Override
    protected void setUp()
    {
        Persona cliente = new Persona("Juan González", "33435332");
        cuenta = new Cuenta(cliente, 100.00);
    }

    public void testIngreso()
    {
        cuenta.ingreso(100.00);
        assertEquals(200.00, cuenta.getSaldo());
    }
    
    public void testIngreso2()
    {
        cuenta.ingreso(150.00);
        assertEquals(200.00, cuenta.getSaldo());
    }
}
