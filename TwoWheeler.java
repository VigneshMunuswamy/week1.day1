package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 2121212l;
	boolean isPunctured= false;
	String bikeName = "Yamaha FZ16";
	double runningKM = 35080.52;
	
	public static void main(String[] args) {
		TwoWheeler fz16 = new TwoWheeler();
		System.out.println("Number of Wheels in Vehicle : "+fz16.noOfWheels);
		System.out.println("Number of Mirrors : "+fz16. noOfMirrors);
		System.out.println("chassisNumber : "+fz16. chassisNumber);
		System.out.println("Is the vehicle punctured :"+fz16.isPunctured);
		System.out.println("Name of Bike :"+fz16.bikeName);
		System.out.println("Total Running km:"+fz16.runningKM+"km");
		
	}
	
}
