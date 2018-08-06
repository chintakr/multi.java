/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,sum=0,r,k;
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		for(i=n1+1;i<n2;i++)
		{
			k=i;
			sum=0;
			
			while(i>0)
		
			{
				r = i%10;
				sum = sum+r*r*r;
				i = i/10;
				
			}
			i=k;
			if(sum==k)
			System.out.println(i);
		}
	
	}
}
