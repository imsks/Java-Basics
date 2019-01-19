/*
	@Author - Sachin Kr. Shukla
	@Date - 19 Jan, 2019
	About - Handling File - Create + Write + Read
*/

// To Create file 
/*
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
*/

// To Read files 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class base{

	public static void main(String[] args) {
		// Create File
		/*
		try{
			File file = new File("abc.txt");

			if(!file.exists()){
				file.createNewFile();
			}

			PrintWriter pw = new PrintWriter(file);
			pw.println("This is my file content");
			pw.println(1000);
			pw.close();
			System.out.println("Done");

		} catch(IOException e){
			e.printStackTrace();
		}
		*/


		// Read files
		/*
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader("abc.txt"));
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
		} catch(IOException e){
			e.printStackTrace();

		} finally{
			try{
				br.close();
			} catch(IOException e){
				e.printStackTrace();
			}
		}
		*/
	}
}