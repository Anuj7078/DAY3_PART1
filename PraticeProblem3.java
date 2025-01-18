import java.util.*;
public class PraticeProblem3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers:");
		int[] num=new int[5];
		for(int i=0;i<5;i++){
			num[i]=sc.nextInt();
		}
		System.out.print("Largest number is:"+ Math.max(num[0],Math.max(num[1],Math.max(num[2],Math.max(num[3],num[4])))));
	}
}
