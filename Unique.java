
public class Unique {

	public static void main(String[] args) {
		String str="ABCDAA";
		boolean flag = false;
		l1: for(int i=0; i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					flag = true;
					System.out.println(str + " doest not contain Unique characters");
					break l1;
				}
			}
		}
		if(flag==false) {
			System.out.println(str + " contains Unique characters");
		}
	}

}
