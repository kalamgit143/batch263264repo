package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void method()
	{
		String name="Amrutha";
		String reversename="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reversename=reversename+name.charAt(i);
		}
		Reporter.log(reversename);
	}

}
