
public class Arraymax {

	public static void main(String[] args) {
		int a[]= {25,56,85,99,7};
		int temp = 0;
		for(int i=0;i<a.length;i++) {
			if (temp<a[i]) {
				temp=a[i];
			}
			
		}
		System.out.println("Maximum number in the array is "+temp);

	}

}
