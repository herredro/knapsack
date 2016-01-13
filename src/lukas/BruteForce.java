package src.lukas;

public class BruteForce {
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
					}
					l++;
				}
				h++;
			}
			w++;
			w++;
		}
	}
}