import java.util.*;
public class PraticeProblem2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n =sc.nextInt();
		switch(n){
			case 0:System.out.print("Zero");
			       break;
			case 1:System.out.print("One");
			       break;
			case 2:System.out.print("TWo");
			       break;
			case 3:System.out.print("Three");
			       break;
			case 4:System.out.print("Four");
			       break;
			case 5:System.out.print("Five");
			       break;
		}
		sc.close();
	}
}


