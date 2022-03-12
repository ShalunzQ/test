package newpacket;

import java.util.Scanner;

public class EX517 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		n=input.nextInt();
		int i,j,k,l;
		for(i=0;i<n;i++) {
			for(j=0;j<2*n-2*i;j++) {
				System.out.print(" ");
			}
			for(k=i+1;k>0;k--) {
				System.out.print(k+" ");
			}
			for(l=2;l<=i+1;l++) {
				System.out.print(l+" ");
			}
			System.out.print("\n");
		}

	}

}
