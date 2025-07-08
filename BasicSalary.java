import java.util.*;

public class BasicSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose your option:");
        System.out.println("1 -> 50,000");
        System.out.println("2 -> 40,000");
        System.out.println("3 -> 30,000");
        System.out.println("4 -> 20,000");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();
        int salary;

        switch (choice) {
            case 1:
                salary = 50000 + (30 * 50000) / 100;
                break;
            case 2:
                salary = 40000 + (25 * 40000) / 100;
                break;
            case 3:
                salary = 30000 + (20 * 30000) / 100;
                break;
            case 4:
                salary = 20000 + (15 * 20000) / 100;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Total Salary = " + salary);
    }
}