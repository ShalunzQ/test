package newpacket;

public class EG97 {

	public static void main(String[] args) {
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+EG96.numberOfObjects);
	
		EG96 c1=new EG96();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius("+c1.radius+") and number of Circle objects ("+
		c1.numberOfObjects+")");
		
		EG96 c2=new EG96(5);
		c1.radius=9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius ("+c1.radius+
				") and number of Circle objects ("+c1.numberOfObjects +")");
		
		System.out.println("c2: radius ("+c2.radius+
				") and number of Circle objects ("+c2.numberOfObjects +")");
		
	}
}
