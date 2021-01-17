import java.util.Scanner;

public class RectCirArea {
	
	void RectangleArea(double len,double br)
	 {
		String Ar=String.format("%.3f", (len*br));
		System.out.println("Area Of the required Rectangle :"+Ar+"");
	 }
	
	void CircleArea(double rad)
	 {
		double Pi = 3.14159;
		String CArea= String.format("%.3f", (Pi*Math.pow(rad,2)));
		System.out.println("Area Of the required Circle :"+CArea+"");
	 }
 

	 public static void main(String[]args)
	  {
		Scanner s = new Scanner(System.in);
		
		double rad;
		double len,br;
		
		System.out.println("Input Radius for the required Cicle : ");
		rad = s.nextDouble();
		RectCirArea C = new RectCirArea();
		C.CircleArea(rad);

		System.out.println("\nInput the Length and Breadth of the required Rectangle : ");
		len = s.nextDouble();
		br = s.nextDouble();
		RectCirArea Rec = new RectCirArea();
		Rec.RectangleArea(len,br);
	 }		
}		
		
		