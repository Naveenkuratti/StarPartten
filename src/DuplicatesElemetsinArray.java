
public class DuplicatesElemetsinArray {
public static void main(String[] args) {
	String arr[]= {"java","c","patyon","java"};
	
	boolean flag=false;
	for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[i]);
				flag=true;
			}
		
		}
	}
	
	if(flag==false) {
		System.out.println("duilcate elets not found");
	}
}
}
