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
		String str="abccba";
		System.out.println(palindrome(str,0,str.length()-1));
		
	}
	
	static boolean palindrome(String str,int i,int j){
		if(i>=j)return true;
		return str.charAt(i)==str.charAt(j)&&palindrome(str,i+1,j-1);
		
	}
}
