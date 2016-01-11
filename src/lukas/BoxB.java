package test1;

public class BoxB extends Box {
	public BoxB(){
		super();
		super.width = 1.5;
		super.length = 1;
		super.height = 2;
	}
	public void status(){
		System.out.println("BoxB:");
		System.out.println("*Width  = " + getWidth());
		System.out.println("*Lenght = " + getLength());
		System.out.println("*Height = " + getHeight());
	}
}
