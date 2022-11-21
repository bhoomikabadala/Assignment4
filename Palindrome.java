public class Palindrome {
	public static void main(String[] args) {
		String input = "2552";
		boolean flag = false;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)==input.charAt(input.length()-1-i)) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==false) {
			System.out.println(input + " is not Palindrome");
		}
		else
		{
			System.out.println(input +" is Palindrome");
		}
	}
}