import java.util.Scanner;
public class Age {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a=sc.nextInt();

        if(a<=13){
            System.out.println("The person is a Child");
        }
        else if(a<=18){
            System.out.println("The person is a Teenager");
        }
        else if(a<=30){
            System.out.println("The person is an Adult");
        }
        else if(a>30){
            System.out.println("The person is Odd");
        }
        else{
            System.out.println("Invalid Input");
        }

    }
}
