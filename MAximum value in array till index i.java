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
		int arr[]={1,2,3,4,5};
		System.out.println(maximum(arr,4));
		
	}
	
	static int maximum(int arr[],int index){
		if(index==0)
		return arr[index];
		return Math.max(arr[index],maximum(arr,index-1));
	}
}
