package newpacket;

public class EX527 {

	public static void main(String[] args) {
		double years;
		int numb=0;
		for(int i=101;i<=2100;i++) {
			if(i%400==0||(i%4==0&&i%100!=0)) {
				numb++;
				System.out.print(i+" ");
				if(numb%10==0) {
					System.out.printf("\n");
				}
			}
		}

	}
}
