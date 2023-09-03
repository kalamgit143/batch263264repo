package tests;

import java.util.Scanner;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test
	public void method()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String name=sc.nextLine();
		sc.close();
		String reversename="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reversename=reversename+name.charAt(i);
		}
		System.out.println(reversename);
		System.out.println(reversename);
	}

}
