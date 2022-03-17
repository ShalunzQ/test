package newpacket;
import java.util.Scanner;
public class EX73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int [] num=new int[101];
		int length=0;
		int n=-1;
		do{
			n=in.nextInt();
			num[n]++;
		}while(n!=0);
		for(int i=1;i<=100;i++) {
			if(num[i]==0) continue;
			else if(num[i]==1) {
				System.out.println(i+" occurs "+num[i]+"time");
			}
			else {
				System.out.println(i+" occurs "+num[i]+"times");
			}
		}
	}
}
