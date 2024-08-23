class Car{
    String model;

    void startEngine() {
        System.out.println(model + " engine started.");
    }

    void stopEngine() {
        System.out.println(model + " engine stopped.");
    }
}
class Scorpio_N extends Car{
	void RoofOpen() {
		System.out.println("Opening sunroof of "+model);
	}
	void RoofClose() {
		System.out.println("Closing sunroof of "+model);
	}
}
class XUV_700 extends Car{
	void RoofOpen() {
		System.out.println("Opening sunroof of "+model);
	}
	void RoofClose() {
		System.out.println("Closing sunroof of "+model);
	}
}

public class Inheritance{
	 public static void main(String[] args) {
		 Scorpio_N MyScorpio = new Scorpio_N();
		 MyScorpio.model = "Scorpio N";
		 MyScorpio.startEngine();
		 MyScorpio.RoofOpen();
		 MyScorpio.RoofClose();
		 MyScorpio.stopEngine();
		 
		 System.out.println();
		 
		 XUV_700 MyXUV = new XUV_700();
		 MyXUV.model = "XUV 700";
		 MyXUV.startEngine();
		 MyXUV.RoofOpen();
		 MyXUV.RoofClose();
		 MyXUV.stopEngine();
		 
	 }
}

