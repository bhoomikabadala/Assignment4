class RemoveDuplicate{
	public void removeDuplicates(String str) {
		boolean flag = false;
		System.out.println("Before Removing Duplicates :: "+str);
		for(int i=0; i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					flag = true;
						str=str.substring(0, j)+str.substring(j+1);
						j--;
				}
			}
		}
		if(flag==false) {
			System.out.println("No Duplicates Found!");
		}
		else {
			System.out.println("After Removing Duplicates  :: "+str);
			}
		
	}
}
public class Duplicate {
	public static void main(String[] args) {
		RemoveDuplicate obj = new RemoveDuplicate();
		obj.removeDuplicates("tanishka");
	}
}
