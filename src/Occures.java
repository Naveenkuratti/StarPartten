
public class Occures {
public static void main(String[] args) {
	String str ="Cloud Tech";
	char ch ='C';
	removeChar(str, ch);
}

public static void removeChar(String str,char c) {
	
	int n =str.length();
	String finall="";
	
	for(int i=0; i<n; i++) {
		if(str.charAt(i)!=c) {
			finall=finall+str.charAt(i);
			
		}
	} 
	System.out.println(finall);
	
}
}
