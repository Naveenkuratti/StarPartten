import java.util.Scanner;

public class Vowels {
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter the String");
	String str= scanner.nextLine();
	char []chars=str.toCharArray();
	int count=0;
	
	for(char c:chars) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			count++;
			break;
			
	}
		
}
	System.out.println("enter string"+count);
	
}
}
