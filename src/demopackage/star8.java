package demopackage;

public class star8 {
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
		  {
		  
		  for (int l=row; l>=1; l--)
		  {
			  
			  for (int k=row; k>i; k--)
			  {
				  System.out.print(" ");
			   }
			  for (int j=1; j<=i; j++)
			  {System.out.print("* ");  
		      }
			  System.out.println();
		  }
	  }
	  }
	}
}
