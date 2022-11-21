class DispDuplicates{
	public void printDuplicates(String str) {
		int k=0;
		boolean flag= false;
		char[] duplicates = new char[str.length()];
		System.out.println("String     :: "+str);
		for(int i=0; i<str.length();i++) {
			l1: for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					for(int z=0;z<duplicates.length;z++) {
						if(duplicates[z]==str.charAt(i)) {
							break l1;
						}
					}
					duplicates[k]=str.charAt(j);
					k++;
					flag=true;
					break;
				}
			}
		}
		if(flag==false) {
			System.out.println("No Duplicates Found!");
		}
		else {
			System.out.print("Duplicates :: ");
			for(int i=0;i<k;i++) {
				System.out.print(duplicates[i]);
			}
		}
		
	}
}
public class LaunchDispDuplicates {
	public static void main(String[] args) {
		DispDuplicates obj = new DispDuplicates();
		obj.printDuplicates("tanishkka");
	}
}