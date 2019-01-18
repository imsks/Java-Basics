/*
  @Author - Sachin Kr. Shukla
  @Date - 18 Jan, 2019
*/

class base{
    public static void main(String[] args) {
         // New classes for OOPs concepts
         // Inheritance
         rect rec = new rect();
         triangle tri = new triangle();

         rec.setVal(10, 10);
         tri.setVal(5, 10);

         System.out.println("Area of rectangle " + " " + rec.area());
         System.out.println("Area of triangle " + " " + tri.area());

    }
}