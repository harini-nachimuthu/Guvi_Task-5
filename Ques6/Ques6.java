package Task5;
import java.util.*;
public class Ques6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of.month :: ");
		int a=sc.nextInt();
		System.out.println("Enter the room rent per day :: ");
		float b=sc.nextFloat();
		System.out.println("Enter the no.of.days stay :: ");
		int c=sc.nextInt();
		switch(a) {
		case 1:System.out.printf("%.2f%n",b*c);
		break;
		case 2:System.out.printf("%.2f%n",b*c);
		break;
		case 3:System.out.printf("%.2f%n",b*c);
		break;
		case 4:System.out.printf("%.2f%n",b*c*1.2f);
		break;
		case 5:System.out.printf("%.2f%n",b*c*1.2f);
		break;
		case 6:System.out.printf("%.2f%n",b*c*1.2f);
		break;
		case 7:System.out.printf("%.2f%n",b*c);
		break;
		case 8:System.out.printf("%.2f%n",b*c);
		break;
		case 9:System.out.printf("%.2f%n",b*c);
		break;
		case 10:System.out.printf("%.2f%n",b*c);
		break;
		case 11:System.out.printf("%.2f%n", b *c *1.2f);
		break;
		case 12:System.out.printf("%.2f%n", b * c * 1.2f);
		break;
		default:
			System.out.println("Invalid input");
		}
		
	}

}
