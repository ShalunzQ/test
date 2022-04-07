package newpacket;

public class EG911 {

	public static void main(String[] args) {
		EG98[] circleArray;
		circleArray= createCircleArray();
		printCircleArray(circleArray);
	}
	public static EG98[] createCircleArray() {
		EG98[] circleArray = new EG98[5];
		
		for(int i=0;i<circleArray.length;i++) {
			circleArray[i]=new EG98(Math.random()*100);
		}
		
		return circleArray;
	}
	public static void printCircleArray(EG98[] circleArray) {
		System.out.printf("%-30s%-15s\n", "Radius","Area");
		for (int i=0;i<circleArray.length;i++) {
			System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),circleArray[i].getArea());
		}
	System.out.println("_______________________________________________");
	System.out.printf("%-30s%-15s\n","The total area of circles is", sum(circleArray));
	}
	public static double sum(EG98[] circleArray) {
		double sum=0;
		
		for(int i=0;i<circleArray.length;i++) 
			sum+=circleArray[i].getArea();
			return sum;
	}
}
