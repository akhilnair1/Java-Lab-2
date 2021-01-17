import java.util.Scanner;

public class Queue {

     public static void main(String[]args) 
      {
	    Scanner s=new Scanner(System.in);
    	System.out.println("Input Queue Size :");
	    int var = s.nextInt();
	    new FirstQueue(var);
      }
}

     class FirstQueue
     {
     	int front=-1,rear=-1,data;
    	int[]a=new int[100];
   	 
    		    
	    FirstQueue(int var){
		int option;
		 
		  do {
		      Scanner sc=new Scanner(System.in);
		      System.out.println("Choose from the following Operations:\n1.Enqueue\n2.Dequeue\n3.Display Elements\n");
	          System.out.println("Your Preferred Option:");
		      option = sc.nextInt();
		       switch(option)
		       {
		         case 1:
			     enqueue(var);
			     break;
		         case 2:
			     dequeue(var);
			     break;
		         case 3:
			     display(rear);
			     break;
		         case 4:
		         System.exit(0);	 
		         default:
			     break;	  }	
		       
		  }while(option<=4); 	}
		
	void enqueue(int var){
		if(rear>=var-1)
		 {
			System.out.println("Queue Overflow\n");
		 }
		else
		 {
			if(front==-1 && rear==-1){
			 front++;}
		 
			System.out.println("Input Data Element to Insert:");
			Scanner scan=new Scanner(System.in);
			data = scan.nextInt();
			rear++;
			a[rear]=data;}
		}
	
	void dequeue(int var)
	 {
		if(front==-1)
		{
		  System.out.println("Queue Underflow\n");
		}
		else 
		{
	      int del=a[front];
		  System.out.printf("Data Element Removed : %d\n",del);
			  
	        if(front==rear)
	         {
		       front=-1;
		       rear=-1;
	         }	
	        else
	         {
		       front++;
	         }
	    }
	 }
	
	void display(int rear)
	 {
		int i;
		
		System.out.println("Current Data Elements in the Queue :");
		for(i=front;i<=rear;i++)
		 {	
		  System.out.printf("%d\n",a[i]);
		 }
	 }
}