import java.util.Scanner;
public class ArrayQ1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number you want to search :- ");
		int f = sc.nextInt();
		for (int i=0;i<a.length;i++) {
			
			if(f==a[i]) {
				System.out.println(" The nuumber is present at index"+i);
			}
			
		}
		
	}

}
