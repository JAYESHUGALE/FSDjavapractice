package demopackage;

import java.util.Scanner;

public class starpattern3 {
	public static void main(String[] args)
	{  
	 Scanner sc =  new Scanner(System.in);
	 System.out.println("Enter row numbers:");
	 int row = sc.nextInt();
	 
	  
	  
	  for (int i=1; i<=row; i++)
	  {
		  
		  for (int k=row; k>i; k--)
		  {
             System.out.print(" ");
		  }
		  for (int l=1; l<=i; l++)
		  {
			  System.out.print("* ");
		  }
		  System.out.println();
		  }
	  }
			  
  }
