package demopackage;

public class starpattern4
{
	public static void main(String[] args)
   
	{  
	
	  int row = 10;
	  
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
