import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a number");
	int num =scanner.nextInt();
	
	//1.using alogorithm
	
	//int rev =0;
	//while(num!=0) {
	//	rev=rev*10+num%10;//0+1234%10=4  40+3=43 30+2=32  
	//	num=num/10;//1234/10=123 123/1=12  12/10=1  1/0=0
		
	//}
	
	
	//Using String Buffer class
	
	
	//StringBuffer sb = new StringBuffer(String.valueOf(num));
	//StringBuffer rev=sb.reverse();
	
	
	
	StringBuilder sf = new StringBuilder();
	sf.append(num);
	StringBuilder rev = sf.reverse();
	System.out.println("Reverse Numbers"+rev);
}
}
