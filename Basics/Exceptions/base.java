/*
	@Author - Sachin Kr. Shukla
	@Date - 19 Jan, 2019
	About - Implimenting Exception - Try/Catch + Finally
*/

public class base{
	public static int retInt(){
		int a = 100;
		try{
			a = a/0;
			return a;
		} catch(ArithmeticException e){
			System.out.println("Catch working");
			System.out.println(e);
			return a;
		} finally{
			a = 5000;
			System.out.println("Finally working");
			return a;
		}
	}

	public static void main(String[] args) {
		/*
		int b[] = new int[2];
		try{
			//int a = 10/0;
			System.out.println(b[3]);
		} catch(ArithmeticException a){
			System.out.println("Line 13");
		}
		catch(Exception a){
			System.out.println("Line");
		}
		
		System.out.println("---");
		*/


		// For Finally
		/*
		try{
			//int a = 100/0;
			System.exit(1);
		} catch(ArithmeticException e){
			System.out.println("Line 28");
			System.out.println(e);
		} finally{
			System.out.println("Finally working");
		}
		*/
		System.out.println(retInt());
	}
}