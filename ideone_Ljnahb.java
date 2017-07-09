/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
// palindrome number
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int temp=n; 
		int r=0;
		int sum=0;
  while(n>0){    
   r=n%10;  //getting remainder  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
	}
