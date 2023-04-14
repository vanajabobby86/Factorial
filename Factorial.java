package org.factorial;

public class Factorial {
	public static void main(String[] args)
	{
		int num=5;
		Long factorial=1l;
		for(int i=1;i<=num;i++) 
		
		{
			factorial *=i;
		}
		System.out.println(factorial);
	}

}
