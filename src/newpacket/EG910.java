package newpacket;

public class EG910 {

	public static void main(String[] args) {
		EG98 myCircle=new EG98(1);
		int n=5;
		printAress(myCircle,n);

		
		System.out.println("\n"+"Radius is " +myCircle.getRadius());
		System.out.println("n is "+n);
	}
	public static void printAress(EG98 c,int times) {
		System.out.println("Radius \t\tArea");
		while (times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.setRadius(c.getRadius()+1);
			times--;
		}
	}
}
