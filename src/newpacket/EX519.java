package newpacket;

//import java.util.Scanner;

public class EX519 {

	public static void main(String[] args) {
	//	Scanner input=new Scanner(System.in);
		int n=8;
		//n=input.nextInt();
		int i,j,k,l;
		for(i=0;i<n;i++) {
			for(j=0;j<n-i;j++) {
				System.out.print("\t");
			}
			for(k=1;k<=i+1;k++) {
				if(k==1) {
					System.out.print(k+"\t");
				}
				else {
				System.out.print((int)Math.pow(2,k-1)+"\t");
				}
			}
			for(l=i;l>0;l--) {
				if(l==1) {
					System.out.print(l+"\t");
				}
				else {
				System.out.print((int)Math.pow(2,l-1)+"\t");
				}
			}
			System.out.print("\n");
		}

	}
}

