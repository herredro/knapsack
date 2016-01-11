package test1;

public class BoxA extends Box {
	public BoxA(){
		super();
		super.width = 1;
		super.length = 1;
		super.height = 2;
	}
	public void status(){
		System.out.println("BoxA:");
		System.out.println("*Width  = " + getWidth());
		System.out.println("*Lenght = " + getLength());
		System.out.println("*Height = " + getHeight());
	}
}
