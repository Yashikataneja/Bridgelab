import java.sql.SQLOutput;
import java.util.Scanner;
public class cal{
    public static void main(String[] args){
//        int a;
//        int b;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the val of first number : ");
        int a =sc.nextInt();

        System.out.println("Enter the val of second number: ");
        int b=sc.nextInt();

        //calculator

        int c;
        int d;
        int e; int f; int g;int h; int i; int j; int k;

        c=a+b;
        d=a-b;
        e=a/b;
        f=a%b;
        g=a*b;



        System.out.println("a+b :" + c);
        System.out.println("a-b: "+d);
        System.out.println("a/b: "+e);
        System.out.println("a%b: "+f);
        System.out.println("a*b: "+g);

    }
}