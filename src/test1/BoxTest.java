/*
package test1;

public class BoxTest {
	public static void main(String[] args) {
		boolean debug = true;
		int [][][] cargo = new int[165][25][40];
		int w = 0;
		int h = 0;
		int l = 0;
		if (debug) System.out.println("Start\n");
		if (w < 25){
			if (debug) System.out.println("Width: " + w + " Height: " + h + " Lenght: " + l);
			if (h < 40){
				if (l < 165){
					try{
						BoxA boxA = new BoxA();
						boxA.setLocation(w, h, l);
						double [] dim = boxA.getDim();
						if (debug) for (int i = 0; i < dim.length; i++)
							System.out.print("Box A dim = " + dim[i]);
						for (int i = 0; i < dim[0]; i++){
							for (int j = 0; j < dim[1]; j++){
								for (int k = 0; k < dim[2]; k++){
									cargo[i][j][k] = 1;
								}
							}
						}
						System.out.print("Success Box A");
						
					}catch (Exception e1){
						System.out.println("Box A not possible");
						try{
							BoxB boxB = new BoxB();
							boxB.setLocation(w, h, l);
							double [] dim = boxB.getDim();
							for (int i = 0; i < dim[0]; i++) cargo[i][h][l] = 1;
							System.out.print("Success Box B");
						}catch (Exception e2){
							System.out.println("Box B not possible");
							try{
								BoxC boxC = new BoxC();
								boxC.setLocation(w, h, l);
								double [] dim = boxC.getDim();
								for (int i = 0; i < dim[0]; i++) cargo[i][h][l] = 1;
								System.out.print("Success Box C");
							}catch (Exception e3){
								System.out.println("Box C not possible");
							}
						}
					}
					l++;
				}
				h++;
			}
			w++;
		}
		
		
		
		
		
		
		
		
		
		
		/*
		//BOX
		Box box = new Box(1, 2, 3);
		//box.setLocation(3, 4, 5);
		System.out.println("Boxextern:");
		System.out.println("*Width  = " + box.getWidth());
		System.out.println("*Lenght = " + box.getLength());
		System.out.println("*Height = " + box.getHeight());
		
		//BOXA
		BoxA boxA = new BoxA(1, 2, 3);
		//boxA.setLocation(3, 4, 5);
		System.out.println("BoxAextern:");
		System.out.println("*Width  = " + boxA.getWidth());
		System.out.println("*Lenght = " + boxA.getLength());
		System.out.println("*Height = " + boxA.getHeight());
		
		//BOXB
		BoxB boxB = new BoxB(1, 2, 3);
		//box.setLocation(3, 4, 5);
		System.out.println("BoxBextern:");
		System.out.println("*Width  = " + boxB.getWidth());
		System.out.println("*Lenght = " + boxB.getLength());
		System.out.println("*Height = " + boxB.getHeight());
				
		//BOXC
		BoxC boxC = new BoxC(1, 2, 3);
		//boxC.setLocation(3, 4, 5);
		System.out.println("BoxCextern:");
		System.out.println("*Width  = " + boxC.getWidth());
		System.out.println("*Lenght = " + boxC.getLength());
		System.out.println("*Height = " + boxC.getHeight());
		*/
