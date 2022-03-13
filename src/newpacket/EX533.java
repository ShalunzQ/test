package newpacket;

public class EX533 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum=0;
		for(i=1;i<=10000;i++) {
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
			sum=0;
		}
	}

}
