import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DatabaseConnection.getConnection();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void login() {
        System.out.println("Welcome to the Hospital Management System");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        int response = scanner.nextInt();
        scanner.nextLine();
        switch (response) {
            case 1:
                login();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
