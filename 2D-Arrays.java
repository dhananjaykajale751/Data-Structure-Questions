import java.util.Scanner;
public class Array2D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of cols");
		int cols = sc.nextInt();
		System.out.println("Enter the array Elements");
		int a[][]= new int[rows][cols];
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
			System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the number you want to find");
		int temp = sc.nextInt();
		for (int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if (temp==a[i][j]) {
					System.out.println("The Number is found at index ("+i+","+j+")");
				}
				
		}
		

	}

}
}
