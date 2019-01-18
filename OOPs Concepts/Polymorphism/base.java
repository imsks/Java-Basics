/*
  @Author - Sachin Kr. Shukla
  @Date - 18 Jan, 2019
*/

class base{
    public static void main(String[] args) {
         // Polymorphism
         bank abc = new bank_abc();
         bank pqr = new bank_pqr();
         bank xyz = new bank_xyz();

         System.out.println(abc.getIntrestRate());
         System.out.println(pqr.getIntrestRate());
         System.out.println(xyz.getIntrestRate());
    }
}