package Task5;
import java.util.Scanner;
public class Ques2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String value:: ");
		String input=sc.nextLine();
		System.out.println("The string value entered is ::"+input);
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			output=output+input.charAt(i);
		}
		System.out.println("Reversed string : "+ output);
	}
}
