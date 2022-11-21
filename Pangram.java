
public class Pangram {

	public static void main(String[] args) {
		String s1="Sixty zippers were quickly picked from the woven jute bag";
    	String s1ws="";
    	char[] arr=new char[26];
    	int count = 0;
    
    	s1=s1.toLowerCase();
    	
    	for(int i=0;i<s1.length();i++) {
    		if(s1.charAt(i)!=' ') {
    			s1ws=s1ws+s1.charAt(i);
    		}
    	}
    	
    	for(int i=0; i<s1ws.length();i++) {
    		arr[s1ws.charAt(i)-97]=s1ws.charAt(i);
    	}
    	
    	for(int i=0; i<arr.length;i++) {
    		if(arr[i]=='\u0000') {
    			count++;
    		}
    	}
    	
    	if(count==0) {
    		System.out.println("Pangram");
    	}
    	else {
    			System.out.println("Not a Pangram");
    	}
	}
}