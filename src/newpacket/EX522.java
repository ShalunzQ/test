package newpacket;
import java.util.Scanner;
public class EX522 {

	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		 System.out.print("Loan Amount:");
		 double loan=input.nextDouble();
		 System.out.print("Number of Years:");
		 double years=input.nextDouble();
		 System.out.print("Annual Interest Rate:");
		 double rate=input.nextDouble();
		 double monthpayment=loan*rate/100/12/(1-1/Math.pow(1+rate/100/12, years*12));
		 double totalpayment=monthpayment*12*years;
		// double monthpayment=865.26;
		// double totalpayment=10383.21;
		 System.out.print("Monthly  Payment:");
		 System.out.printf("%.2f\n",monthpayment);
		 System.out.print("Total Payment:");
		 System.out.printf("%.2f\n",totalpayment);
		 System.out.println("Payment#"+"\t"+"Interest"+"\t"+"Principal"+"\t"+"Balance");
		 double balance=loan;
		 double interest=rate/1200*balance;
		 double principal=monthpayment-interest;
		 for(int i=1;i<=years*12;i++) {
			 interest=rate/1200*balance;
			 interest=getTwoDecimalPlaces(interest);
			 principal=monthpayment-interest;
			 principal=getTwoDecimalPlaces(principal);
			 balance=balance-principal;
			 balance=getTwoDecimalPlaces(balance);
			 System.out.print(i+"\t\t");//+interest+"\t\t"+principal+"\t\t"+balance
			 System.out.print(interest);
			 System.out.print("\t\t");
			 System.out.print(principal);
			 System.out.print("\t\t");
			 System.out.println(balance);
		 }

	}
	private static double getTwoDecimalPlaces(double original) {
		return (double) Math.floor(original * 100) / 100;
	}

}
