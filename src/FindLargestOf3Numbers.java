import java.util.Scanner;

public class FindLargestOf3Numbers {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
 System.out.println("enter the number");
 
 int a=scanner.nextInt();
 System.out.println("enter the second numbers");
 int b= scanner.nextInt();
 System.out.println("enter the  third numbers");
 int c=scanner.nextInt();
 if(a>b&&a>c) {
	 System.out.println(a);
 }
 else if(b>a && b>c) {
	 System.out.println(b);
	 
 }else {
	 System.out.println(c);
 }
	}
}

