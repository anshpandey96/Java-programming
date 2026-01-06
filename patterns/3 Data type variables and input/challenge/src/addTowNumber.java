import java.util.Scanner;

  public class addTowNumber {

     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println(" Enter  Your First positive Number:");
            int a = scanner.nextInt();
         System.out.println(" Enter your second positive Number:");
            int b = scanner.nextInt();

                int c;
              c =  a + b;
         System.out.println("Your Sum Number is : "+ c);

     }
}
