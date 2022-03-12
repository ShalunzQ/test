package newpacket;
import java.util.Scanner;
public class EX521 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Loan Amount:");
		double loan=input.nextDouble();
		System.out.print("Number of Years:");
		double years=input.nextDouble();
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		for(double rate=5;rate<=8;) {
			System.out.printf("%.3f",rate);
			System.out.print("%");//"st Rate    " "y Payment    "
			System.out.print("           ");
			System.out.printf("%.2f",(loan*rate/100/12/(1-1/Math.pow(1+rate/100/12, years*12))));
			System.out.print("             ");
			System.out.printf("%.2f", (loan*rate/100/12/(1-1/Math.pow(1+rate/100/12, years*12)))*5*12);
			System.out.print("\n");
			rate=rate+0.125;
		}
	}
}
