package Task5;
import java.util.Scanner;
public class Ques4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n number :: ");
		int n=sc.nextInt();
		System.out.println("The entered value of n is :: "+n);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==6) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println("");
		}
		
	}
}
