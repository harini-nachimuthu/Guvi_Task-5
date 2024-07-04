package Task5;
import java.util.Scanner;
public class Ques3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n number :: ");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("The entered value of n is :: "+n);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				sum=sum+1;
				System.out.print(sum+" ");
			}
			System.out.println("");
		}
	}
}
