
public class duplicateds {
public static void main(String[] args) {
	
	
	int a[]= {1,3,2,4,5,1,2};

	for(int i=0; i<a.length-1;i++) {
		for(int j=i+1; i<a.length;j++) {
			if(a[i]==a[j]) {
				
				System.out.println("duplicates from arrays"+a[i]);
			
			}
		}
	}
	
}
}
