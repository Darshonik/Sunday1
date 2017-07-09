/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
//NUMBER OF DIGITS
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int dig =0;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while (num>0)
		{
			dig +=1;
			num/=10;
		}
		System.out.print("NUMBER OF DIGITS"+ dig);
		
	}
}