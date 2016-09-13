package test.testSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

import test.testCase.TraductorTest;

public class SuiteDeTest
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite("Test aplicación Traductor");
        suite.addTestSuite(TraductorTest.class);
        return suite;
    }
}
