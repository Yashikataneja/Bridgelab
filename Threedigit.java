import java.util.Scanner;

public class Threedigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three digit number: ");
        int abc = sc.nextInt();

        // Extract digits
        int a = abc / 100;         // Hundreds place
        int b = (abc / 10) % 10;   // Tens place
        int c = abc % 10;          // Units place

        if (a == b && b == c) {
            System.out.println("All three digits are the same.");
        } else if (a != b && b != c && a != c) {
            System.out.println("All three digits are different.");
        } else {
            System.out.println("Two digits are the same and one is different.");
        }
    }
}



//import java.util.Scanner;
//
//public class Threedigit {
//    public static void main(String[]args){
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter first number: ");
//        System.out.println("Enter second number :  ");
//        System.out.println("Enter third number : ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//
//        if(a==b && b==c){
//            System.out.println("three of them are same");
//        }
//        else if(a==b && b!=c){
//            System.out.println("2 are same and 1 is different");
//        }
//        else {
//            System.out.println("3 are different");
//        }
//    }
//}
