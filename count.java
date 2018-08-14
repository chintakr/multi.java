/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s1;
		char ch;
		int count=1,i;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		for(i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(ch==' ')
			{
				count=count+1;
			}
   
             	}
             		System.out.println(count);
	}
}	
