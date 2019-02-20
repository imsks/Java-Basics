/*
	Author - Sachin Kr. Shukla
	Date - 19 Feb, 19
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class sql {



	public void mid(){
		String result = "";
		// Read files
		BufferedReader br = null;
		try{
			// Here put the txt file in same folder
			br = new BufferedReader(new FileReader("sql.txt"));
			String line;
			while((line = br.readLine()) != null){
				// All operation here
				String ini = "INSERT INTO Customers (Name, Address, Locality, no of doctors)";
				String midFirst = " VALUES(";
				String midLast = ");";
				String comma = "'";
				line = ini + midFirst + comma + line.replaceAll("@","', '") + comma + midLast;
				System.out.println(line);
				System.out.println();
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
	}

	public static void main(String[] args) {
		sql obj = new sql();
		obj.mid();
	}
}
