package Task5;
import java.util.Scanner;
public class Ques1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number :"); //171
		String a=sc.nextLine();
		String out="";
		System.out.println("Entered number to check is palindrome or not is :: "+a);
		
		for(int i=a.length()-1;i>=0;i--) {
			out=out+a.charAt(i);
		}
		if(a.equals(out)) {
			System.out.println("It is palindrome. the a value is: "+a+"out value is: "+out);
		}
		else {
			System.out.println("It is not a palindrome. the a value is: "+a+" out value is: "+out);
		}
	}

}
