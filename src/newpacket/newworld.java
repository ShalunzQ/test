package newpacket;

import java.util.Scanner;

public class newworld {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i=0,max=0,j=0;
		while(true){
			int str = sc.nextInt();
			if(str>max){
				max=str;
				j=0;
			}
			if(str==max){
				j++;
			}
			if(str==0){
				break;
			}
			i++;
		}
		if(i==0)
			System.out.println("No input");
		else
			System.out.println(max+" "+j);
	}

}
