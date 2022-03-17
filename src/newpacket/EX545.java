package newpacket;
import java.util.Scanner;
public class EX545 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		double[] num=new double[11];
		double sum=0,sum2=0;
		for(int i=1;i<=10;i++) {
			num[i]=in.nextDouble();
			sum+=num[i];
			sum2=sum2+num[i]*num[i];
		}
		double sevage=sum/10.0;
		double fangcha2=(sum2-((sum*sum)/10.0))/9.0;
		double fangcha=Math.sqrt(fangcha2);
		fangcha=getTwoDecimalPlaces(fangcha);
		System.out.println(sevage+" "+fangcha);
	}
	private static double getTwoDecimalPlaces(double original) {
		return (double) Math.floor(original * 100000) / 100000;
	}

}
