package Task5;
import java.util.Scanner;
public class Ques7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is largest number :: "+a);
		}else if(b>a && b>c){
			System.out.println("b is largest number :: "+b);
		}else {
			System.out.println("c is largest number :: "+c);
		}
	}

}
