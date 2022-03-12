package newpacket;

//import java.util.Scanner;

public class EX519 {

	public static void main(String[] args) {
	//	Scanner input=new Scanner(System.in);
		int n=8;
		//n=input.nextInt();
		int i,j,k,l;
		for(i=0;i<n;i++) {
			for(j=0;j<3*n-3*i;j++) {
				System.out.print(" ");
			}
			for(k=1;k<=i+1;k++) {
				if(k==1) {
					System.out.print(k+"  ");
				}
				else {
				System.out.print((int)Math.pow(2,k-1)+"  ");
				}
			}
			for(l=i;l>0;l--) {
				if(l==1) {
					System.out.print(l+"  ");
				}
				else {
				System.out.print((int)Math.pow(2,l-1)+"  ");
				}
			}
			System.out.print("\n");
		}

	}
}

