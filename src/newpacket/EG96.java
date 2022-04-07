package newpacket;

public class EG96 {

	double radius;
	
	static int numberOfObjects=0;
	
	EG96(){
		radius=1;
		numberOfObjects++;
	}
	
	EG96(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	double getArea() {
		return radius*radius*Math.PI;
	}

}
