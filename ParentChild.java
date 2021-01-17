public class ParentChild 
 {
     public static void main(String[]args)
      {
	    Super s = new Super() ;
	    s.display();
	    Sub c = new Sub() ;
	    c.print() ;
	    c.display();
      }
 }

class Super
 {
	void display()
	 {
	   System.out.println("This is parent class.") ;
	 }
 }

class Sub extends Super
 {
	void print()
	 {
	   System.out.println("This is child class.") ;
	 }
 }