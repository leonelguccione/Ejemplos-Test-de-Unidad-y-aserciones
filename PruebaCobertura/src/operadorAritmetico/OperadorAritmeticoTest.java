package operadorAritmetico;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class OperadorAritmeticoTest
{
	@Test
	public void suma()
	{
		int a = 5;
		int b = 3;
		int suma = OperadorAritmetico.suma(a, b);
		Assert.assertEquals(8, suma);
	}
	
	@Test
	public void division()
	{
		int a = 8;
		int b = 4;
		int division;
		try
		{
			division = OperadorAritmetico.division(a, b);
			Assert.assertEquals(2, division);
		}
		catch (Exception e)
		{
			Assert.fail();
		}
	}
}
