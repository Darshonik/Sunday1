/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// THIS PROGRAM IS FOR HIGHEST OF 3 NUMBERS
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int x,y,z;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a first Character : ");
        x= scan.nextInt();
 System.out.print("Enter a second Character : ");
        y = scan.nextInt();
 System.out.print("Enter a third Character : ");
        z = scan.nextInt();
if (( x > y) &&( x > z) )
         System.out.println("First number is largest.");
      else if ( (y > x) && (y > z) )
         System.out.println("Second number is largest.");
      else if ( (z > x) && (z > y) )
         System.out.println("Third number is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");
		
      
	}
}