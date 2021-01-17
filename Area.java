import java.util.Scanner;

 public class Area
{

	String S = "" ;

	 Area(double len, double br)
	   {	
		S=String.format("%.3f", (len*br)) ;
	   }
	
	 String returnArea()
	 {
	  return this.S;
	 }
	
	  public static void main(String args[])
	   {
   		 Scanner s= new Scanner(System.in);
		 System.out.println("Input Length of the required Rectangle :");
		 double len = s.nextDouble();
		 System.out.println("Input Breadth of the required Rectangle :");
		 double br = s.nextDouble();
		 Area a = new Area(len,br) ;
		 String S = "" ;
		 S = a.returnArea();
		
		System.out.println("Area of the Rectangle = "+S);
		
	   }
}