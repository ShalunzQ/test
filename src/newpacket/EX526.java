package newpacket;

import java.util.Scanner;

public class EX526 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double i=100000;
		double e=1;
		double item=1;
		for(int j=1;j<=i;j++) {
			for(int k=1;k<=j;k++) {
				item=item*k;
			}
			e=e+1.0/item;
			item=1;
			if(j==10000||j==20000||j==30000||j==40000||j==50000||j==60000||j==70000||j==80000||j==90000||j==100000) {
				System.out.println("e="+e);
			}
		}

	}

}
