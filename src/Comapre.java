import java.util.Arrays;

public class Comapre {
public static void main(String[] args) {
	int arr1[]= {3,2,5,8,9};
	int arr2[]= {3,2,5,8};
	if(areequals(arr1, arr2)) {
		System.out.println("two are equals");
		
	}else {
		System.out.println("two are not equals");
	}
	
	
	
}
public static boolean  areequals(int arr1[],int arr2[]) {
	
	int n =arr1.length;
	int m = arr2.length;
	
	if(n!=m) {
		return false;
		
	}
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	for(int i=0;i<n; i++) {
		if(arr1[i]!=arr2[i]) {
			return false;
		}
		
	}
	return true;

}
}
