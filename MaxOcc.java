
public class MaxOcc {

	public static void main(String[] args) {
		int highest=0;
		char highchar;
		String str = "ABC";
		int count[] = new int[str.length()];
		char[] characters = new char[count.length];
		int k=0;
		int indCount=1;
		boolean flag= false;
		System.out.println("String     :: "+str);
		for(int i=0; i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					flag=true;
					count[k]=++indCount;
					characters[k]=str.charAt(j);
				}
			}
			k++;
			indCount=1;
		}
		if(flag==false) {
			System.out.println("No Duplicates Found!");
		}
		else {
			highest=count[0];
			highchar = characters[0];
			for(int i=0;i<count.length;i++) {
				if(count[i]>highest) {
					highest=count[i];
					highchar = characters[i];
				}
			}
			System.out.println("The maximum occurring character is "+highchar+" ("+highest+" times)");
		}
	}
}