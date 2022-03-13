package newpacket;
import java.util.Scanner;

public class EX532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int lottery= (int)(Math.random()*10);
		int flag=0;
		int lottery2;
		do {
			lottery2=(int)(Math.random()*10);
			if(lottery!=lottery2) {
				flag=1;
			}
		}while(flag!=1);
		System.out.print(lottery+""+lottery2);
	}

}
