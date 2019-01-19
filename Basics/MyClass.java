/*
  @Author - Sachin Kr. Shukla
  @Date - 18 Jan, 2019
*/
// My first java program learning from YouTube

//import java.util.Scanner;
class MyClass{
    public static void main(String[] args) {
    	// Printing simple varibale values taken from user
    	/*
    	Scanner scan = new Scanner (System.in);
        System.out.println("Enter a variable : ");
        int userInput = scan.nextInt();
        System.out.println("Your answer is : " + " " + userInput);

        Output: 

        */


        // Printing intergers
        /*
        int x, y, answer;
        x = 30; 
        y = 70; 
        answer = x % y;
        System.out.println("Answer is :" + " " + answer);

        Output:

        */


        // Using increment operator
        /*
        int x = 10;
        System.out.println(x++); // Pre-Increment
        System.out.println(--x); // Post-Increment

        Output:

        */


        // Using If-Else statment
        /*
        int x = 10;
        int y = 5;
        if(x != 10 || y > 10){
        	System.out.println("True");
        }
        else{
        	System.out.println("False");
        }

        Output:

        */


        // Using switch condition
        /*
        int score = 10; 
        switch(score){
        	case 10:
        		System.out.println("Matched");
        	case 12: 
        		System.out.println("It's 12...");
        	default:
        		System.out.println("It's default");
        }

        Output:

        */


        // Using While loop
        /*
        int x = 10;
        while(x < 15){
        	System.out.println("The values are :" + x);
        	x++;
        }

        Output:

        */


        // Using Do-While loop
        /*
        int x = 10;
        while(x < 15){
        	System.out.println("The values are :" + x);
        	x++;
        }
        int b = 0;
        do{
        	System.out.println("B is " + b);
        	b++;
        }while(b <= 5);

        Output:

        */


        // Using Arrays
        /*
        int[] myArr = {1, 2, 3, 4, 5};
        int myArr2[] = {1, 2, 3, 4, 5}; // I use this way
        System.out.println(myArr[2]);
        int index = 0;
        while(index < myArr.length){
        	System.out.println(myArr[index]);
        	index++;
        }

        Output:

        */


        // Using For loop
        /*
        int myArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 1st way
        for(int index = 0; index < myArr.length; index++){
        	System.out.println("Values are : " + myArr[index]);
        }

        // 2nd way
        for(int element : myArr){
        	System.out.println(element);
        }

        Output:

        */


        // Using Strings
        /*
        String myStr = "hello world";
        int strLen = myStr.length(); // To find length
        //System.out.println(strLen);
        //System.out.println(myStr.toUpperCase());
        //System.out.println(myStr.replace('h', 'a'));
        System.out.println(myStr.indexOf("h"));

        Output:

        */

        // Calling myFun
        /*
        myFun();
        */

        // Calling sayHi
        /*
        sayHi("Sachin");
        */

        // Calling add
        /*
         int sum = add(5, 6);
         System.out.println(sum);
        */




         // Continue here for student class
         /*
         student mark = new student(); // Calls bject or instance
         mark.setId(1);
         mark.setName("Mark");
         mark.setAge(15);

         System.out.println(mark.getName() + " " + "is" + " " + mark.getAge() + " " + "years old.");

         student tom = new student();
         tom.setId(2);
         tom.setName("tom");
         tom.setAge(20);
         System.out.println(tom.getName() + " " + "is" + " " + tom.getAge() + " " + "years old.");
         */


        // New class cube starts here
         /*
         cube cube1 = new cube();

         // Display data from Constructor - cube1
         System.out.println(cube1.getCubeVol());

         // New class cube starts here
         cube cube2 = new cube(20, 20, 20);

         // Display data from Constructor - cube1
         System.out.println(cube2.getCubeVol()); 
         */


         // Using method overloading
         /*
         System.out.println(add(1, 2)); // For Int
         System.out.println(add("Hi", "Sachin")); // For String
         */


         // Using hello.java file
         /*
         hello hel = new hello();
         //hel.number = 20;
         */
    }

    // Using methods
    /*
    public static void myFun(){
    	System.out.println("Working");
    }

    Output: // First we will call myFun like line 155.
    */

    // Continuing methods -- 
    // String
    /*
    public static void sayHi(String name){
    	System.out.println("Hello" + " " + name); // Calling it at 159s
    }
    */

    // Int 
    /*
    public static int add(int a, int b){
    	return (a + b); // Calling it at 165
    }
    */


    // Using Classes
    // Creating a class student. Code is in next file student.java
    // Scroll to public static void main(String[] args) to continue. Line 176


    // Method overloading
    /*
    // Int
    public static int add (int a, int b){
        return (a + b);
    }

    // String
    public static String add (String a, String b){
        return (a + " " + b);
    }
    */
}