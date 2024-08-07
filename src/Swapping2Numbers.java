
public class Swapping2Numbers {
public static void main(String[] args) {
	int a=10; 
	int b=20;
	  //logca1-
	System.out.println("befoore swapping"+a+" "+b);
	
	
	//int t=a;
	//a=b;
	//b=t;
	
	
	a=a+b;//10+20=30
	b=a-b;//30-20=10
	a=a-b;//30-10=20
	
	
	
	
	System.out.println("after swapping"+a+" "+b);
}
}
