public class Count {
	public static void main(String[] args) {
		
		String input="ABCE1234@!$%";
		
		int vowels=0;
		int consonants=0;
		int numbers=0;
		int spechar=0;
		
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)>=48 && input.charAt(i)<=56) {
				numbers++;
			}
			else if((input.charAt(i)>=65 && input.charAt(i)<=90) || (input.charAt(i)>=97 && input.charAt(i)<=122)) {
				if(input.charAt(i)=='A' || input.charAt(i)=='E' || input.charAt(i)=='I' || input.charAt(i)=='O' || input.charAt(i)=='U' || 
					input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u') {
					vowels++;
				}
				else {
					consonants++;
				}
			}
			else
			{
				spechar++;
			}
		}
		
		System.out.println("Vowels              :: "+vowels);
		System.out.println("Consonants          :: "+consonants);
		System.out.println("Numbers             :: "+numbers);
		System.out.println("Special Characters  :: "+spechar);
	}
}