package test1;

public class BoxC extends Box {
	double width = 55;
	double length = 1;
	double height = 2;

	public BoxC(){
		super();
		
	}
	public void status(){
		System.out.println("Box:");
		System.out.println("*Width  = " + getWidth());
		System.out.println("*Lenght = " + getLength());
		System.out.println("*Height = " + getHeight());
	}
}
