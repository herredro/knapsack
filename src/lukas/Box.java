package lukas;

public class Box{
	double width;
	double length;
	double height;
	double x, y, z;
	double [] coords;
	double asd;

	public Box (){
		
	}
	
	public void status(){
		System.out.println("Box:");
		System.out.println("*Width  = " + getWidth());
		System.out.println("*Lenght = " + getLength());
		System.out.println("*Height = " + getHeight());
	}
	
	public double [] getDim(){
		double [] dim = {width, length, height};
		return dim;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getHeight(){
		return height;
	}

	public void setLocation (double w, double h, double l){
		coords [0] = w;
		coords [1] = h;
		coords [2] = l;
	}

	public double [] getLocation (){
		return coords;
	}

	public double [] getPlaneXY (){
		double [] xy = {coords[0], coords[1]};
		return xy;
	}

	public double [] getPlaneYZ (){
		double [] yz = {coords[1], coords[2]};
		return yz;
	}

	public double[] getPlaneXZ (){
		double [] xz = {coords[0], coords[2]};
		return xz;
	}
	public void drawPlanes(){
		
	}

}