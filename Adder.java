 class Adder {
     static int add(int a, int b) {
         return (a + b);
     }

     static int add(int a, int b, int c) {
         return (a + b + c);
     }
 }
 class AdderTesting
 {
     public static void main(String args[])
     {
         System.out.println(Adder.add(12, 33));
         System.out.println(Adder.add(12,34,56));
     }

 }
