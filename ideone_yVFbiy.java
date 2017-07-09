/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner (System.in);
	    System.out.println("enter the number");
        int num = sc.nextInt();
                if(num<30000 && num>(-30000))
			{
            if ((num%2)==0)
            System.out.println("the number is even");
            else
            System.out.println("the number is odd");
                        }
        else
			{
				System.out.println("enter a number with smaller magnitude");
			}
	}
}