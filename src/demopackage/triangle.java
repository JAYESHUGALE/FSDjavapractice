package demopackage;

public class triangle 
{
  public static void main (String[] args)
  {  
	  int row = 10;
	  
	  for (int i=row; i>=1; i--)
	  {
		  
		  for (int l=row; l>i; l--)
		  {
			  System.out.print(" ");
		   }
		  for (int j=1; j<=2*i-1; j++)
		  {System.out.print("*");  
	      }
		  System.out.println();
	  }
   }
}
