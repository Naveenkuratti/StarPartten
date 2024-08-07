import java.util.Scanner;

public class CountNumber {
public static void main(String[] args) {
	
	System.out.println("enter the numbers");
	int num=123456;
	int count=0;
	
while(num>0) {
	num=num/10;
	count++;
}
System.out.println(count);
}
}
