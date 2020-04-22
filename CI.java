import java.util.Scanner;
import java.io.*; 
public class CI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle, rate, time, CI, amount;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principle amount");
		principle=sc.nextDouble();
		System.out.println("enter the rate of interest");
		rate=sc.nextDouble();
		System.out.println("enter the time period");
		time=sc.nextDouble();
		System.out.print("enter  the number of times that interest is compounded per unit t : ");
	    n=sc.nextInt();
		amount = principle*(Math.pow((1 + rate / n), n*time)); 
		CI = amount-principle;
		System.out.println("compound interest is:" +CI);
		sc.close();

	}

}
