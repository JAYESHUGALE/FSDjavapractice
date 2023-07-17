package demopackage;

public class starpattern2 {
	 public static void main (String[] args)
	  {  
		  int row = 10;
		  
		  for (int i=row; i>=1; i--)
		  {
			  
			  for (int k=row; k>i; k--)
			  {
				  System.out.print(" ");
			   }
			  for (int l=1; l<=i; l++)
			  {System.out.print("* ");  
		      }
			  System.out.println();
			  
		  }
	  }
}
