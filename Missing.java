
public class MissingNumber {
 public static void Missing(int arr[]) {
	 for (int i=0;i<arr.length;i++) {
			if (arr[i]!=i+1) {
				System.out.println(i+1+" is Missing");
			}
			
		}
 }
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7};
		Missing(a);
		

	}

}
