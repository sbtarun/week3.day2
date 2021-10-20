package week3.day2.assignments;

public class Desktop implements HardWare, Software {

	public void desktopModel() {
		System.out.println("Print desktop model");
	}

	public void softwareResources() {
		System.out.println("Print software resources");
	}

	public void hardwareResources() {
		System.out.println("Print Hardware resources");
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.softwareResources();
		obj.hardwareResources();
		obj.desktopModel();
	}

}
