import java.util.Scanner;

public class PaliDromeNumber {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	System.out.println("enter the numbers");
	int num =scanner.nextInt();
int org_num=num;
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
		
	}
	
	if(org_num==rev) {
		System.out.println("is pandimore");
	}else {
		System.out.println("not panlodrome");
	}
}
}