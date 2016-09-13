package cuentaproyecto.TestSuite;

import cuentaproyecto.TestCase.CuentaTest;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SuiteDeTest
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite("Test aplicación bancaria");
        suite.addTestSuite(CuentaTest.class);
        //suite.addTestSuite(DepositoTest.class);
        return suite;
    }
}
