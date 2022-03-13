package newpacket;
import java.util.Scanner;
public class EX536 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String str;
		str="";
		int d=in.nextInt();;
		int sum=0;
		int num;
		int k=9;
		if(d/100000000==0) {
			str+="0";
		}
		str+=d;
		for(int i=1;i<=9;i++) {
			num=d%10;
			d=d/10;
			sum=sum+num*k;
			k--;
		}
		int last=sum%11;
		if(last==10) {
			str+="X";
		}
		else str+=last;
		System.out.println(str);
	}

}
