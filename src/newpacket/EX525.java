package newpacket;
import java.util.Scanner;
public class EX525 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double i=100000;
		double pi=0;
		for(int j=1;j<=i;j++) {
			pi=Math.pow(-1, j+1)/(2*j-1)+pi;
			if(j==10000||j==20000||j==30000||j==40000||j==50000||j==60000||j==70000||j==80000||j==90000||j==100000) {
				System.out.println("¦°="+pi*4);
			}
		}
	}

}
