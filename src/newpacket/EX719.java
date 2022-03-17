package newpacket;
import java.util.Scanner;
public class EX719 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		int size=in.nextInt();
		System.out.print("Enter the contents of the list:");
		int [] list=new int [size+1];
		for(int i=0;i<size;i++) {
			list[i]=in.nextInt();
		}
		int flag=0;
		for(int i=0;i<size-1;i++) {
			if(list[i]>list[i+1]) {
				flag=1;
			}
			if(flag==1) break;
		}
		System.out.print("The list has "+size+" intergers ");
		for(int i=0;i<size;i++)
		System.out.print(list[i]+" ");
		System.out.println();
		if(flag==1) {
			System.out.println("The list is not sorted");
		}
		else System.out.println("The list is already sorted");
	}

}
