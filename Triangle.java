public class Triangle 
 {

	 public static void main(String[]args)
	  {
	    PeriArea p= new PeriArea();
      }
}
  
    class PeriArea
     {
	   PeriArea()
	    {
		  int s1=3,s2=4,s3=5;
		  int semiP=(s1 + s2 + s3)/2 ;
		  int peri= s1 + s2 + s3 ;
		  double ar= Math.sqrt(semiP*(semiP-s1)*(semiP-s2)*(semiP-s3));
		  System.out.println("Perimeter of the given Triangle : " +peri);
		  System.out.println("Area of the given Triangle : " +ar);}
		
     }