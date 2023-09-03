package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void method()
	{
		int a=4;
		int b=5;
		int c=a+b;
		System.out.println("Output is "+c);
	}
}
