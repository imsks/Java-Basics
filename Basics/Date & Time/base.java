/*
	@Author - Sachin Kr. Shukla
	@Date - 19 Jan, 2019
	About - Using Date and Time
*/

import java.util.Date;
import java.text.*;
public class base{

	public static void main(String[] args) {
		Date date = new Date();
		//System.out.println(date.toString());
		//System.out.println(date.getTime());

		//System.out.println(date.getMonth() + 1);
		//System.out.println(date.getDay() + 1);
		//System.out.println(date.getHours());

		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy/mm/dd HH:mm:ss");
		System.out.println(sdf.format(date));

	}
}