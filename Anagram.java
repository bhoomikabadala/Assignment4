import java.util.Scanner;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter First String: ");
    	String s1 = sc.nextLine();
    	String s1ws="";
    	System.out.print("Enter Second String: ");
    	String s2 = sc.nextLine();
    	String s2ws="";
    	int count = 0;
    	 
    	for(int i=0;i<s1.length();i++) {
    		if(s1.charAt(i)!=' ') {
    			s1ws=s1ws+s1.charAt(i);
    		}
    	}
    	
    	for(int i=0;i<s2.length();i++) {
    		if(s2.charAt(i)!=' ') {
    			s2ws=s2ws+s2.charAt(i);
    		}
    	}
    	
    	for(int i=0; i<s1ws.length();i++) {
    		for (int j=0;j<s2ws.length(); j++) {
    			if(s1ws.charAt(i)==s2ws.charAt(j)) {
    				count++;
    				break;
    			}
    		}
    	}
    	
    	if(s1ws.length()==count && s2ws.length()==count) {
    		System.out.println("Strings are Anagram");
    	}
    	else {
    		System.out.println("Strings are not Anagram");
    	}
	}
}