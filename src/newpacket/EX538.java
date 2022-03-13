package newpacket;

import java.util.Scanner;

public class EX538 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int length=0;
		int num2=num;
		do {
			num=num/8;
			length++;
		}while(num!=0);
		int [] yushu=new int[20];
		for(int i=1;i<=length;i++) {
			yushu[i]=num2%8;
			num2=num2/8;
		//	System.out.println(num);
		}
		for(int i=length;i>0;i--) {
		System.out.print(yushu[i]);
		}
	}
}
