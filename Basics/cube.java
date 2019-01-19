/*
	@Author - Sachin Kr. Shukla
	@Date - 18 Jan, 2019
	About - Determine parameters related to cube
*/
public class cube{
	int length;
	int bredth;
	int height;

	public int getCubeVol(){
		return (length * bredth * height);
	}

	// Initializing Constructor
	cube(){
		//System.out.println("Working");
		length = 10;
		bredth = 20;
		height = 30;
	}

	cube(int l, int b, int h){
		//System.out.println("Working");
		length = l;
		bredth = b;
		height = h;
	}

	public static void main(String[] args) {
		
	}
}