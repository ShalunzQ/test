package newpacket;

public class EX57 {

	public static void main(String[] args) {
		double a=10000;
		int i;
		 for(i=0;i<10;i++) {
			 a=a*(1+0.05);
		 }
		 System.out.println(a);
		 double sum=0;
		 for(i=0;i<4;i++) {
			 sum=a+sum;
			 a=a*(1.05);
		 }
		 System.out.println(sum);
	}

}
