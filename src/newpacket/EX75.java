package newpacket;
import java.util.Scanner;
public class EX75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		int [] n=new int [11];
		int temp,flag=0,count=0;
		for(int i=1;i<=10;i++) {
			temp=in.nextInt();
			for(int j=0;j<=i;j++) {
				if(temp==n[j]) flag=1;
			}
			if(flag==0) {
				n[count]=temp;
				count++;
			}
			flag=0;
		}
		System.out.println("The number of distinct numbers is "+count);
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<count;i++) {
		System.out.print(n[i]+" ");
		}
	}
}
